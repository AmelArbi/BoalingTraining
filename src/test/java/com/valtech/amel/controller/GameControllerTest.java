package com.valtech.amel.controller;

import com.valtech.amel.dto.WurfDto;
import com.valtech.amel.service.GameService;
import com.valtech.amel.service.GameServiceTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class GameControllerTest {
    GameController gameController = new GameController(new GameService());

    Logger logger = LoggerFactory.getLogger(GameServiceTest.class);

    //Montag Aufgabe :
    //    game nicht initialisiert und spielsatnd wird abgefragt
    //    erwartung: controller wirft eine exception die zu einem 400 (bad request) response code führt
    //    game initialisiert, keine würfe nur der name ist gesetzt
    //    game initialisiert, 3 würfe sind getan: DTO hat alle daten und korrekte  Scores


    //


    @Test (expected= GameNotInitialized.class)
    public void willReturnExceptionIfGameNotInitialzed() {
        gameController.spielStand("12","123");
    }

    @Test (expected= PlayerNotFound.class)
    public void willReturnExceptionIfPlayerNotFound() {
        gameController.startGame();
        gameController.spielStand("12","123");
    }

    @Test ()
    public void GameInitialized() {
        logger.info("Begin GameInitialized");
        String gameId = gameController.addGame();
        logger.info("Game is initialised ");
        String playerId = gameController.addPlayerGame(gameId);
        assertThat(gameController.spielStand(gameId,playerId).getFrames().isEmpty(), is(true));
        assertThat(gameController.spielStand(gameId,playerId).getPlayerName(), nullValue());
        assertThat(gameController.spielStand(gameId,playerId).getTurn(), is(0));
    }


    @Test ()
    public void GameInitialized4Turn() {
        logger.info("Begin GameInitialized");
        String gameId = gameController.addGame();
        String playerId = gameController.addPlayerGame(gameId);
        logger.info("Game Nr : {}. Player Nr {}", gameId,playerId);
        gameController.wurf(gameId,playerId,new WurfDto(10));
        gameController.wurf(gameId,playerId,new WurfDto(10));
        gameController.wurf(gameId,playerId,new WurfDto(10));
        gameController.wurf(gameId,playerId,new WurfDto(10));
        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(0).getScore(), is(30));
        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(1).getScore(), is(60));
        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(2).getScore(), is(80));
        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(3).getScore(), is(90));
    }


}
