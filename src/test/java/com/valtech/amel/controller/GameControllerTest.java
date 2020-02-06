package com.valtech.amel.controller;

import java.util.stream.IntStream;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class GameControllerTest {

    Logger logger = LoggerFactory.getLogger(GameControllerTest.class);

    @Test
    public void wuerfelAccept() {

        logger.info("Begin Test von wuerfelAccept");
        GameController gameController = new GameController();

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);

        logger.debug("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
    }

    @Test
    public void addBonusRegularFal() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(0).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(1).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(1).getFinalScore());
        assertEquals(2, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(1).getFinalScore());
        assertEquals(2, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(2).getFinalScore());
        assertEquals(2, gameController.getFrame(3).getFinalScore());
        assertEquals(2, gameController.getFrame(4).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(3).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(5).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(7).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        assertEquals(2, gameController.getFrame(6).getFinalScore());
        assertEquals(2, gameController.getFrame(7).getFinalScore());
        assertEquals(2, gameController.getFrame(8).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);

        assertEquals(2, gameController.getFrame(7).getFinalScore());
        assertEquals(2, gameController.getFrame(8).getFinalScore());
        assertEquals(2, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameStrike() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);//0
        assertEquals(10, gameController.getFrame(0).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(2);
        assertEquals(14, gameController.getFrame(6).getFinalScore());
        assertEquals(4, gameController.getFrame(7).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(2);
        assertEquals(14, gameController.getFrame(6).getFinalScore());
        assertEquals(4, gameController.getFrame(7).getFinalScore());
        assertEquals(4, gameController.getFrame(8).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(4, gameController.getFrame(7).getFinalScore());
        assertEquals(4, gameController.getFrame(8).getFinalScore());
        assertEquals(30, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonusPrePrevFrameStrikePrevFrameStrike() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(0).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(7).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(6).getFinalScore());
        assertEquals(20, gameController.getFrame(7).getFinalScore());
        assertEquals(10, gameController.getFrame(8).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(3);
        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(5);
        assertEquals(23, gameController.getFrame(7).getFinalScore());
        assertEquals(18, gameController.getFrame(8).getFinalScore());
        assertEquals(8, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameSpare() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);//0
        assertEquals(10, gameController.getFrame(0).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(7).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(6).getFinalScore());
        assertEquals(20, gameController.getFrame(7).getFinalScore());
        assertEquals(10, gameController.getFrame(8).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(3);
        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(5);
        assertEquals(23, gameController.getFrame(7).getFinalScore());
        assertEquals(18, gameController.getFrame(8).getFinalScore());
        assertEquals(8, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameRegular() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);//0
        assertEquals(10, gameController.getFrame(0).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(7).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(6).getFinalScore());
        assertEquals(20, gameController.getFrame(7).getFinalScore());
        assertEquals(10, gameController.getFrame(8).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(7);
        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(3);
        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(6);
        assertEquals(27, gameController.getFrame(7).getFinalScore());
        assertEquals(20, gameController.getFrame(8).getFinalScore());
        assertEquals(16, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonusPrePrevFramePrevFrameLastFrameStrike() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(2);
        assertEquals(3, gameController.getFrame(0).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(7).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(6).getFinalScore());
        assertEquals(20, gameController.getFrame(7).getFinalScore());
        assertEquals(10, gameController.getFrame(8).getFinalScore());

        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(3);
        logger.info("Iteration {}", gameController.getGame().getIteration());
        gameController.wurfelnAccept(2);
        assertEquals(23, gameController.getFrame(7).getFinalScore());
        assertEquals(15, gameController.getFrame(8).getFinalScore());
        assertEquals(5, gameController.getFrame(9).getFinalScore());
    }

    @Test
    public void lastFrameSpareCalculateScore() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        assertEquals(13, gameController.calculateScore());

    }

    @Test
    public void lastFrameStrikeCalculateScore() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        assertEquals(18, gameController.calculateScore());

    }

    @Test
    public void lastFrameRegularCalculateScore() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(3);
        assertEquals(6, gameController.calculateScore());

    }

    @Test
    public void firstFrameRegularCalculateScore() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(2);
        assertEquals(5, gameController.calculateScore());

    }

    @Test
    public void firstFrameSpareCalculateScore() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        assertEquals(10, gameController.calculateScore());

    }

    @Test
    public void firstFrameStrikeCalculateScore() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.calculateScore());

    }

    @Test
    public void twoStrikes() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.calculateScore());

    }

    @Test
    public void threeStrikes() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        assertEquals(60, gameController.calculateScore());
    }

    @Test
    public void threeSpares() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);

        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);

        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);

        assertEquals(40, gameController.calculateScore());
    }

    @Test
    public void singleStrikeBeforeLastFrame() {
        GameController gameController = new GameController();
        IntStream.range(0, 16).forEach(i -> gameController.wurfelnAccept(0));

        gameController.wurfelnAccept(10);

        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(8);
        gameController.wurfelnAccept(6);
        assertEquals(36, gameController.calculateScore());
    }

}
