package com.valtech.amel.controller;

import java.util.stream.IntStream;
import com.valtech.amel.model.Game;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class GameControllerTest {

    Logger logger = LoggerFactory.getLogger(GameControllerTest.class);
    GameController gameController = new GameController();
    Game game = new Game();

    @Test
    public void wuerfelAccept() {

        logger.info("Begin Test von wuerfelAccept");
        GameController gameController = new GameController();

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
    }

    @Test
    public void addBonusRegularFal() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(1).getFinalScore());
        assertEquals(2, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(1).getFinalScore());
        assertEquals(2, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(2).getFinalScore());
        assertEquals(2, game.getFrames().get(3).getFinalScore());
        assertEquals(2, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(6).getFinalScore());
        assertEquals(2, game.getFrames().get(7).getFinalScore());
        assertEquals(2, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);

        assertEquals(2, game.getFrames().get(7).getFinalScore());
        assertEquals(2, game.getFrames().get(8).getFinalScore());
        assertEquals(2, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameStrike() {
        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);//0
        assertEquals(10, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(2,game);
        gameController.wurfelnAccept(2,game);
        assertEquals(14, game.getFrames().get(6).getFinalScore());
        assertEquals(4, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(2,game);
        gameController.wurfelnAccept(2,game);
        assertEquals(14, game.getFrames().get(6).getFinalScore());
        assertEquals(4, game.getFrames().get(7).getFinalScore());
        assertEquals(4, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(4, game.getFrames().get(7).getFinalScore());
        assertEquals(4, game.getFrames().get(8).getFinalScore());
        assertEquals(30, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusPrePrevFrameStrikePrevFrameStrike() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(6).getFinalScore());
        assertEquals(20, game.getFrames().get(7).getFinalScore());
        assertEquals(10, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(3,game);
        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(5,game);
        assertEquals(23, game.getFrames().get(7).getFinalScore());
        assertEquals(18, game.getFrames().get(8).getFinalScore());
        assertEquals(8, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameSpare() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);//0
        assertEquals(10, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(6).getFinalScore());
        assertEquals(20, game.getFrames().get(7).getFinalScore());
        assertEquals(10, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(3,game);
        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(5,game);
        assertEquals(23, game.getFrames().get(7).getFinalScore());
        assertEquals(18, game.getFrames().get(8).getFinalScore());
        assertEquals(8, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameRegular() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);//0
        assertEquals(10, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(6).getFinalScore());
        assertEquals(20, game.getFrames().get(7).getFinalScore());
        assertEquals(10, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(7,game);
        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(3,game);
        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(6,game);
        assertEquals(27, game.getFrames().get(7).getFinalScore());
        assertEquals(20, game.getFrames().get(8).getFinalScore());
        assertEquals(16, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusPrePrevFramePrevFrameLastFrameStrike() {
        GameController gameController = new GameController();

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(1,game);//0
        gameController.wurfelnAccept(2,game);
        assertEquals(3, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(6).getFinalScore());
        assertEquals(20, game.getFrames().get(7).getFinalScore());
        assertEquals(10, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(3,game);
        logger.info("Iteration {}", game.getIteration());
        gameController.wurfelnAccept(2,game);
        assertEquals(23, game.getFrames().get(7).getFinalScore());
        assertEquals(15, game.getFrames().get(8).getFinalScore());
        assertEquals(5, game.getFrames().get(9).getFinalScore());
    }

    @Test
    public void lastFrameSparecalculateScore() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0,game));
        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(3,game);
        assertEquals(13, gameController.calculateScore(game,game.getIteration()));

    }

    @Test
    public void lastFrameStrikecalculateScore() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0,game));
        gameController.wurfelnAccept(10,game);
        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(3,game);
        assertEquals(18, gameController.calculateScore(game,game.getIteration()));

    }

    @Test
    public void lastFrameRegularcalculateScore() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0,game));
        gameController.wurfelnAccept(3,game);
        gameController.wurfelnAccept(3,game);
        assertEquals(6, gameController.calculateScore(game,game.getIteration()));

    }

    @Test
    public void firstFrameRegularcalculateScore() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(3,game);
        gameController.wurfelnAccept(2,game);
        assertEquals(5, gameController.calculateScore(game,game.getIteration()));

    }

    @Test
    public void firstFrameSparecalculateScore() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(5,game);
        assertEquals(10, gameController.calculateScore(game,game.getIteration()));

    }

    @Test
    public void firstFrameStrikecalculateScore() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10,game);
        assertEquals(10, gameController.calculateScore(game,game.getIteration()));

    }

    @Test
    public void twoStrikes() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10,game);
        gameController.wurfelnAccept(10,game);
        assertEquals(30, gameController.calculateScore(game,game.getIteration()));

    }

    @Test
    public void threeStrikes() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10,game);
        gameController.wurfelnAccept(10,game);
        gameController.wurfelnAccept(10,game);
        assertEquals(60, gameController.calculateScore(game,game.getIteration()));
    }

    @Test
    public void threeSpares() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(5,game);

        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(5,game);

        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(5,game);

        assertEquals(40, gameController.calculateScore(game,game.getIteration()));
    }

    @Test
    public void singleStrikeBeforeLastFrame() {
        GameController gameController = new GameController();
        IntStream.range(0, 16).forEach(i -> gameController.wurfelnAccept(0,game));

        gameController.wurfelnAccept(10,game);

        gameController.wurfelnAccept(2,game);
        gameController.wurfelnAccept(8,game);
        gameController.wurfelnAccept(6,game);
        assertEquals(36, gameController.calculateScore(game,game.getIteration()));
    }

}
