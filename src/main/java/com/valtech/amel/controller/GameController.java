package com.valtech.amel.controller;

import com.valtech.amel.dto.GameDto;
import com.valtech.amel.model.Game;
import com.valtech.amel.service.GameService;
import com.valtech.amel.view.GameView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class GameController {

    static final Logger logger = LoggerFactory.getLogger(GameController.class);
    private final GameService gameService;
    private final GameView gameView;
    Game game;
    GameDto gameDto;

    public GameController(GameService gameService, GameView gameView) {
        this.gameService = gameService;
        this.gameView = gameView;
        logger.info("Initializing");
    }

    @RequestMapping(value = "startgame", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void resetGame() {
        game = new Game();
        gameDto=new GameDto(game);
    }

    @RequestMapping(value = "spielstand", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String spielStand() {
        logger.info("Spielstand würde abgerufen");
        return gameView.renderFrames(game);
    }

    @RequestMapping(value = "spielstandjson", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Game spielStandJson() {
        logger.info("spielstandjson würde abgerufen");
        return game;
    }

    //Aufgabe : spielstandjson muss aktuellen Spielstand als game DTO zurückgeben
    // Ressourcen bekommen ein id

    @RequestMapping(value = "spielstandjsondto", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public GameDto spielStandJsonDto() {
        logger.info("spielstandjsonDto würde abgerufen");
        return gameDto;
    }

    @RequestMapping(value = "spielername", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void spielerName(String name) {
        logger.info("Spielername : {}", name);
        game.setPlayerName(name);
    }

    @RequestMapping(value = "wurf", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void wurf(int zahl) {
        if (zahl < 0 || zahl > 10) {
            logger.error("Falsche Wurf : {}", zahl);
            throw new InvalidValueException();
        }
        logger.info("Wurf : {}", zahl);
        gameService.wurfelnAccept(zahl, game);
    }

}
