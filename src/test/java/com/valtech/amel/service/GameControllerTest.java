package com.valtech.amel.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.valtech.amel.controller.GameController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GameControllerTest {
    GameController gameController = new GameController(new GameService());

    Logger logger = LoggerFactory.getLogger(GameServiceTest.class);

//Montag Aufgabe :
//    game nicht initialisiert und spielsatnd wird abgefragt
//    erwartung: controller wirft eine exception die zu einem 400 (bad request) response code führt
//    game initialisiert, keine würfe nur der name ist gesetzt
//    game initialisiert, 3 würfe sind getan: DTO hat alle daten und korrekte  Scores


    @Test (expected=NullPointerException.class)
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

    @Test
    public void spielStandJsonDtoPerfectGameTest(){

        List<Integer> list = new ArrayList<>();
        list.add(10);

        logger.info("Begin der Test von spielStandJsonDtoTest");

        gameController.resetGame();
        gameController.spielerName("Alex");
        assertEquals(0, gameController.spielStandJsonDto().getTurn());
        gameController.wurf(10);
        assertEquals(1, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(10,gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(0).getThrowList());

        gameController.wurf(10);
        assertEquals(2, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(1).getThrowList());

        gameController.wurf(10);
        assertEquals(3, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(2).getThrowList());

        gameController.wurf(10);
        assertEquals(4, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(3).getThrowList());

        gameController.wurf(10);
        assertEquals(5, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(4).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(4).getThrowList());

        gameController.wurf(10);
        assertEquals(6, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(4).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(5).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(5).getThrowList());

        gameController.wurf(10);
        assertEquals(7, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(4).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(5).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(6).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(6).getThrowList());

        gameController.wurf(10);
        assertEquals(8, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(4).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(5).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(6).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(7).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(7).getThrowList());

        gameController.wurf(10);
        assertEquals(9, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(4).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(5).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(6).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(7).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(8).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(8).getThrowList());

        gameController.wurf(10);
        gameController.wurf(10);
        gameController.wurf(10);
        assertEquals(10, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(4).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(5).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(6).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(7).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(8).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(9).getScore());
        list.add(10);
        list.add(10);
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(9).getThrowList());








    }

}
