package com.valtech.amel.controller;

import javax.validation.ValidationException;
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
    Game game;

    @RequestMapping(value = "startgame", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void resetGame() {
        game = new Game();
    }

    private final GameService gameService;
    private final GameView gameView;

    public GameController(GameService gameService, GameView gameView) {
        this.gameService = gameService;
        this.gameView = gameView;
        logger.info("Initializing");
    }

    @RequestMapping(value = "spielstand", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String spielStand() {
        logger.info("Spielstand würde abgerufen");
        return gameView.renderFrames(game);
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
