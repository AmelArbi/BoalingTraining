package com.valtech.amel.controller;

import java.util.Arrays;
import java.util.List;
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
    public void willReturnExceptionIfGameNotInitialized() {
        gameController.spielStandJsonDto();
    }

    @Test ()
    public void GameInitialized() {
        logger.info("Begin GameInitialized");
        gameController.resetGame();
        logger.info("Game is initialised ");
        assertThat(gameController.spielStandJsonDto().getFrames().isEmpty(), is(true));
        assertThat(gameController.spielStandJsonDto().getPlayerName(), nullValue());
        assertThat(gameController.spielStandJsonDto().getTurn(), is(0));


    }

    @Test ()
    public void GameInitialized3Turn() {
        logger.info("Begin GameInitialized");
        gameController.resetGame();
        logger.info("Game is initialised ");
        gameController.wurf(10);
        logger.info("First Turn ");
        gameController.wurf(10);
        logger.info("Second Turn ");
        gameController.wurf(10);
        logger.info("Third Turn ");


        assertThat(gameController.spielStandJsonDto().getFrames().size(),is(3));
        assertThat(gameController.spielStandJsonDto().getTurn(), is(3));
        assertThat(gameController.spielStandJsonDto().getPlayerName(), nullValue());
        assertThat(gameController.spielStandJsonDto().getFrames().get(0).getScore(), is(30));
        assertThat(gameController.spielStandJsonDto().getFrames().get(1).getScore(), is(20));
        assertThat(gameController.spielStandJsonDto().getFrames().get(2).getScore(), is(10));

        List<Integer> expected = Arrays.asList(10);
        assertThat(gameController.spielStandJsonDto().getFrames().get(0).getThrowList(), is(expected));
        assertThat(gameController.spielStandJsonDto().getFrames().get(1).getThrowList(), is(expected));
        assertThat(gameController.spielStandJsonDto().getFrames().get(2).getThrowList(), is(expected));

    }


}