package com.valtech.amel.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import com.valtech.amel.dto.FrameDto;
import com.valtech.amel.dto.GameDto;
import com.valtech.amel.dto.PlayerNameDto;
import com.valtech.amel.dto.WurfDto;
import com.valtech.amel.model.PlayerGame;
import com.valtech.amel.service.GameRepositoryClass;
import com.valtech.amel.service.GameService;
import com.valtech.amel.service.PlayerGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/api")
public class GameController {

    @Autowired
    private  GameService gameService;

    @Autowired
    private PlayerGameRepository playerGameRepository;

    @Autowired
    private  GameRepositoryClass gameRepositoryClass;



    @GetMapping(value = "/")
    public ResponseEntity<String> startGameGet() {

        return ResponseEntity.status(HttpStatus.OK).body("Hallo");
    }

    @PostMapping(value = "/game")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> startGame() {
        long gameId = gameRepositoryClass.createGame();
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{gameId}").buildAndExpand(gameId)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PostMapping(value = "/game/{gameId}/player")
    //@ResponseStatus(HttpStatus.OK)
    public ResponseEntity addPlayer(@PathVariable long gameId) {
        long playerId = gameRepositoryClass.createPlayerGame(gameId);
        log.info("Player {} with name {} is added to game {}", playerId,
                gameRepositoryClass.getGame(gameId, playerId).getPlayerName(), gameId);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(playerId)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping(value = "/game/{gameId}/player/{playerId}")
    @ResponseStatus(HttpStatus.OK)
    public void playerName(@PathVariable long gameId, @PathVariable long playerId,
            @RequestBody PlayerNameDto playerNameDto) {
        log.info("Game with id {} Player {} has name  : {}", gameId, playerId, playerNameDto.getName());
        PlayerGame game = gameRepositoryClass.getGame(gameId, playerId);

        game.setPlayerName(playerNameDto.getName());
        playerGameRepository.save(game);////////////////
        log.info("Playername {} in game : {}", game.getPlayerName(), gameId);
    }

    @GetMapping(value = "/game/{gameId}/player/{playerId}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public GameDto spielStand(@PathVariable long gameId, @PathVariable long playerId) {
        log.info("Spielstand wurde abgerufen für game with id {}, and player with id {}", gameId, playerId);
        PlayerGame game = gameRepositoryClass.getGame(gameId, playerId);
        List<FrameDto> frameDtos;
        frameDtos = game.getFrames()
                .stream()
                .map(frame -> new FrameDto(frame.getThrowList(),
                        gameService.calculateScore(game, frame.getNumber() + 1)))
                .collect(Collectors.toList());
        log.info("List<FrameDto>frameDtos {}", frameDtos);
        GameDto gameDto = new GameDto(game.getIteration(), frameDtos, game.getPlayerName());
        return gameDto;
    }

    @PutMapping(value = "/game/{gameId}/player/{playerId}/throw")
    @ResponseStatus(HttpStatus.OK)
    public void wurf(@PathVariable long gameId, @PathVariable long playerId, @RequestBody WurfDto wurfDto) {
        log.info("Game Nr : {}. Player Nr {}", gameId, playerId);
        validateThrow(wurfDto);
        PlayerGame playerGame = gameRepositoryClass.getGame(gameId, playerId);
        log.info("in game {} player {} throws {} ", gameId, playerGame.getPlayerName(), wurfDto.getZahl());
        gameService.wurfelnAccept(wurfDto.getZahl(), playerGame);
        playerGameRepository.save(playerGame);/////////////////////////
    }

    private void validateThrow(WurfDto wurfDto) {
        if (wurfDto.getZahl() < 0 || wurfDto.getZahl() > 10) {
            log.error("wrong number of throw : {}", wurfDto.getZahl());
            throw new InvalidValueException();
        }
    }
}
