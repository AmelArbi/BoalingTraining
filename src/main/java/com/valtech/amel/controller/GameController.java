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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@Controller
@RequestMapping("game")
public class GameController {

    static final Logger logger = LoggerFactory.getLogger(GameController.class);
    private final GameService gameService;
    private final GameRepositoryClass gameRepositoryClass;

    public GameController(GameService gameService, GameRepositoryClass gameRepositoryClass) {
        this.gameService = gameService;
        this.gameRepositoryClass = gameRepositoryClass;
        logger.info("Initializing");
    }

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> startGame() {
        String gameId = gameRepositoryClass.createGame();
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{gameId}").buildAndExpand(gameId)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PostMapping(value = "/{gameId}/player")
    public ResponseEntity addPlayer(@PathVariable String gameId) {
        String playerId = gameRepositoryClass.createPlayerGame(gameId);
        logger.info("Player {} is added to game {}", playerId, gameId);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(playerId)
                .toUri();
        return ResponseEntity.created(location).build();
    }





    @GetMapping(value = "/{gameId}/player/{playerId}")
    @ResponseBody
    public GameDto spielStand(@PathVariable String gameId, @PathVariable String spielerId) {
        logger.info("Spielstand wurde abgerufen für game with id {}, and player with id {}", gameId, spielerId);
        PlayerGame game = gameRepositoryClass.getGame(gameId, spielerId);
        List<FrameDto> frameDtos;
        frameDtos = game.getFrames()
                .stream()
                .map(frame -> new FrameDto(frame.getThrowList(), gameService.calculateScore(game,frame.getNumber()+1)))
                .collect(Collectors.toList());
        logger.info("List<FrameDto>frameDtos {}", frameDtos);
        GameDto gameDto = new GameDto(game.getIteration(), frameDtos, game.getPlayerName());
        return gameDto;
    }

    @PutMapping(value = "/{gameId}/player/{playerId}")
    @ResponseStatus(HttpStatus.OK)
    public void spielerName(@PathVariable String gameId, @PathVariable String playerId,@RequestBody
            PlayerNameDto playerNameDto) {
        logger.info("Game with id {} Player {} has name  : {}", gameId, playerId, playerNameDto.getName());
        PlayerGame game = gameRepositoryClass.getGame(gameId, playerId);
        game.setPlayerName(playerNameDto.getName());
        logger.info("Spielername im Game : {}", game.getPlayerName());
    }

    @PostMapping(value = "/{gameId}/player/{playerId}/throw")
    @ResponseStatus(HttpStatus.OK)
    public void wurf(@PathVariable String gameId, @PathVariable String spielerId, @RequestBody WurfDto wurfDto) {
        logger.info("Game Nr : {}. Player Nr ", gameId,spielerId);
        validateThrow(wurfDto);
        PlayerGame game = gameRepositoryClass.getGame(gameId, spielerId);
        logger.info("in game {} Spieler {} throws {} ", gameId, game.getPlayerName(), wurfDto.getZahl());
        gameService.wurfelnAccept(wurfDto.getZahl(), game);
    }

    private void validateThrow(WurfDto wurfDto) {
        if (wurfDto.getZahl() < 0 || wurfDto.getZahl() > 10) {
            logger.error("wrong number of throw : {}", wurfDto.getZahl());
            throw new InvalidValueException();
        }
    }
}
