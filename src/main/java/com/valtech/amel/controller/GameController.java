package com.valtech.amel.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import com.valtech.amel.dto.FrameDto;
import com.valtech.amel.dto.GameDto;
import com.valtech.amel.dto.SpielerNameDto;
import com.valtech.amel.dto.WurfDto;
import com.valtech.amel.model.Game;
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
    private Map<String, Map<String, Game>> games = new HashMap<>();

    public GameController(GameService gameService) {
        this.gameService = gameService;
        logger.info("Initializing");
    }

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> startGame() {
        String id = addGame();
        logger.info("Game ist gestarted, {} Games laufen bereit", games.size());
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(id)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    String addGame() {
        Map<String, Game> spielerGames = new HashMap<>();
        String id = UUID.randomUUID().toString();
        games.put(id, spielerGames);
        return id;
    }

    @PostMapping(value = "/{gameId}/player")
    public ResponseEntity addPlayer(@PathVariable String gameId) {
        String id = addPlayerGame(gameId);
        logger.info("Player {} ist erzeugt", id);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(id)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    String addPlayerGame(String gameId) {
        Game game = new Game();
        String id = UUID.randomUUID().toString();
        games.get(gameId).put(id, game);
        return id;
    }

    @GetMapping(value = "/{gameId}/player/{spielerId}")
    @ResponseBody
    public GameDto spielStand(@PathVariable String gameId, @PathVariable String spielerId) {
        logger.info("Spielstand wurde abgerufen für id {}", spielerId);
        Game game = getGame(gameId, spielerId);
        List<FrameDto> frameDtos = new ArrayList<>();
        frameDtos = game.getFrames()
                .stream()
                .map(frame -> new FrameDto(frame.getThrowList(), gameService.calculateScore(game,frame.getNumber()+1)))
                .collect(Collectors.toList());
        logger.info("List<FrameDto>frameDtos {}", frameDtos);
        GameDto gameDto = new GameDto(game.getIteration(), frameDtos, game.getPlayerName());
        return gameDto;
    }

    @PutMapping(value = "/{gameId}/player/{spielerId}")
    @ResponseStatus(HttpStatus.OK)
    public void spielerName(@PathVariable String gameId, @PathVariable String spielerId,
            @RequestBody SpielerNameDto spielerNameDto) {
        logger.info("Spieler {} hat den Namen : {}", spielerId, spielerNameDto.getName());
        Game game = getGame(gameId, spielerId);
        game.setPlayerName(spielerNameDto.getName());
        logger.info("Spielername im Game : {}", game.getPlayerName());
    }

    @PostMapping(value = "/{gameId}/player/{spielerId}/throw")
    @ResponseStatus(HttpStatus.OK)
    public void wurf(@PathVariable String gameId, @PathVariable String spielerId, @RequestBody WurfDto wurfDto) {
        logger.info("Game Nr : {}. Player Nr ", gameId,spielerId);
        validateThrow(wurfDto);
        Game game = getGame(gameId, spielerId);
        logger.info("Spieler {} hat {} geworfen", game.getPlayerName(), wurfDto.getZahl());
        gameService.wurfelnAccept(wurfDto.getZahl(), game);
    }

    private void validateThrow(WurfDto wurfDto) {
        if (wurfDto.getZahl() < 0 || wurfDto.getZahl() > 10) {
            logger.error("Spieler hat falsch geworfen : {}", wurfDto.getZahl());
            throw new InvalidValueException();
        }
    }

    private Game getGame(String gameId, String id) {
        Map<String, Game> spielerGames = games.get(gameId);
        if (spielerGames == null) {
            logger.error("Game not Initialized.");
            throw new GameNotInitialized();
        }
        Game game = spielerGames.get(id);
        if (game == null) {
            logger.error("Player not found.");
            throw new PlayerNotFound();
        }
        return game;
    }

}
