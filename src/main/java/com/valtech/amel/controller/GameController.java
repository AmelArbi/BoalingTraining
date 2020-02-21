package com.valtech.amel.controller;

import java.util.ArrayList;
import java.util.List;
import com.valtech.amel.dto.FrameDto;
import com.valtech.amel.dto.GameDto;
import com.valtech.amel.dto.WurfDto;
import com.valtech.amel.model.Game;
import com.valtech.amel.service.GameService;
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
    Game game;

    public GameController(GameService gameService) {
        this.gameService = gameService;
        logger.info("Initializing");
    }

    @RequestMapping(value = "startgame", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void resetGame() {
        game = new Game();
    }


    //Aufgabe : spielstandjson muss aktuellen Spielstand als game DTO zurückgeben
    // Ressourcen bekommen ein id

    @RequestMapping(value = "spielstandjsondto", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public GameDto spielStandJsonDto() {
        logger.info("spielstandjsonDto würde abgerufen");

        if (game==null){
            logger.error("Game is not Initialized.");
            throw new GameNotInitialized();
        }

        List<FrameDto> frameDtos = new ArrayList<>();


        for (int i = 0; i < game.getIteration(); i++) {
            logger.info("FrameDto für iteration {} wird erstellt",i);
            FrameDto frameDto =
                    new FrameDto(game.getFrames().get(i).getThrowList(), game.getFrames().get(i).getFinalScore());
            frameDtos.add(frameDto);
        }
        GameDto gameDto = new GameDto(game.getIteration(), frameDtos, game.getPlayerName());
        return gameDto;
    }

    @RequestMapping(value = "spielername", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void spielerName(String name) {
        logger.info("Spielername : {}", name);
        game.setPlayerName(name);
    }

//bekommt einen Zahl als JsonDto
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


   @RequestMapping(value = "wurfdto", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void wurfDto(int zahl){
        logger.info("wurfDto {}",zahl);
       WurfDto wurfDto = new WurfDto(zahl);
    }

}
