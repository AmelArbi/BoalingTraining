package com.valtech.amel.service;

import java.util.stream.IntStream;
import com.valtech.amel.model.Game;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class GameServiceTest {

    Logger logger = LoggerFactory.getLogger(GameServiceTest.class);
    GameService gameService = new GameService();
    Game game = new Game();

    @Test
    public void wuerfelAccept() {

        logger.info("Begin Test von wuerfelAccept");
        GameService gameService = new GameService();

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);

        logger.debug("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
    }

    @Test
    public void addBonusRegularFal() {
        GameService gameService = new GameService();

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(1).getFinalScore());
        assertEquals(2, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(1).getFinalScore());
        assertEquals(2, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(2).getFinalScore());
        assertEquals(2, game.getFrames().get(3).getFinalScore());
        assertEquals(2, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        assertEquals(2, game.getFrames().get(6).getFinalScore());
        assertEquals(2, game.getFrames().get(7).getFinalScore());
        assertEquals(2, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);

        assertEquals(2, game.getFrames().get(7).getFinalScore());
        assertEquals(2, game.getFrames().get(8).getFinalScore());
        assertEquals(2, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameStrike() {
        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);//0
        assertEquals(10, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(2,game);
        gameService.wurfelnAccept(2,game);
        assertEquals(14, game.getFrames().get(6).getFinalScore());
        assertEquals(4, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(2,game);
        gameService.wurfelnAccept(2,game);
        assertEquals(14, game.getFrames().get(6).getFinalScore());
        assertEquals(4, game.getFrames().get(7).getFinalScore());
        assertEquals(4, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(4, game.getFrames().get(7).getFinalScore());
        assertEquals(4, game.getFrames().get(8).getFinalScore());
        assertEquals(30, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusPrePrevFrameStrikePrevFrameStrike() {
        GameService gameService = new GameService();

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(6).getFinalScore());
        assertEquals(20, game.getFrames().get(7).getFinalScore());
        assertEquals(10, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(3,game);
        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(5,game);
        assertEquals(23, game.getFrames().get(7).getFinalScore());
        assertEquals(18, game.getFrames().get(8).getFinalScore());
        assertEquals(8, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameSpare() {
        GameService gameService = new GameService();

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);//0
        assertEquals(10, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(6).getFinalScore());
        assertEquals(20, game.getFrames().get(7).getFinalScore());
        assertEquals(10, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(3,game);
        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(5,game);
        assertEquals(23, game.getFrames().get(7).getFinalScore());
        assertEquals(18, game.getFrames().get(8).getFinalScore());
        assertEquals(8, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameRegular() {
        GameService gameService = new GameService();

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);//0
        assertEquals(10, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(6).getFinalScore());
        assertEquals(20, game.getFrames().get(7).getFinalScore());
        assertEquals(10, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(7,game);
        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(3,game);
        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(6,game);
        assertEquals(27, game.getFrames().get(7).getFinalScore());
        assertEquals(20, game.getFrames().get(8).getFinalScore());
        assertEquals(16, game.getFrames().get(9).getFinalScore());

    }

    @Test
    public void addBonusPrePrevFramePrevFrameLastFrameStrike() {
        GameService gameService = new GameService();

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(1,game);//0
        gameService.wurfelnAccept(2,game);
        assertEquals(3, game.getFrames().get(0).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(1).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(1).getFinalScore());
        assertEquals(10, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(1).getFinalScore());
        assertEquals(20, game.getFrames().get(2).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(2).getFinalScore());
        assertEquals(20, game.getFrames().get(3).getFinalScore());
        assertEquals(10, game.getFrames().get(4).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(3).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(20, game.getFrames().get(5).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(10, game.getFrames().get(7).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(10,game);
        assertEquals(30, game.getFrames().get(6).getFinalScore());
        assertEquals(20, game.getFrames().get(7).getFinalScore());
        assertEquals(10, game.getFrames().get(8).getFinalScore());

        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(3,game);
        logger.info("Iteration {}", game.getIteration());
        gameService.wurfelnAccept(2,game);
        assertEquals(23, game.getFrames().get(7).getFinalScore());
        assertEquals(15, game.getFrames().get(8).getFinalScore());
        assertEquals(5, game.getFrames().get(9).getFinalScore());
    }

    @Test
    public void lastFrameSparecalculateScore() {
        GameService gameService = new GameService();
        IntStream.range(0, 18).forEach(i -> gameService.wurfelnAccept(0,game));
        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(3,game);
        assertEquals(13, gameService.calculateScore(game,game.getIteration()));

    }

    @Test
    public void lastFrameStrikecalculateScore() {
        GameService gameService = new GameService();
        IntStream.range(0, 18).forEach(i -> gameService.wurfelnAccept(0,game));
        gameService.wurfelnAccept(10,game);
        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(3,game);
        assertEquals(18, gameService.calculateScore(game,game.getIteration()));

    }

    @Test
    public void lastFrameRegularcalculateScore() {
        GameService gameService = new GameService();
        IntStream.range(0, 18).forEach(i -> gameService.wurfelnAccept(0,game));
        gameService.wurfelnAccept(3,game);
        gameService.wurfelnAccept(3,game);
        assertEquals(6, gameService.calculateScore(game,game.getIteration()));

    }

    @Test
    public void firstFrameRegularcalculateScore() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(3,game);
        gameService.wurfelnAccept(2,game);
        assertEquals(5, gameService.calculateScore(game,game.getIteration()));

    }

    @Test
    public void firstFrameSparecalculateScore() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(5,game);
        assertEquals(10, gameService.calculateScore(game,game.getIteration()));

    }

    @Test
    public void firstFrameStrikecalculateScore() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(10,game);
        assertEquals(10, gameService.calculateScore(game,game.getIteration()));

    }

    @Test
    public void twoStrikes() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(10,game);
        gameService.wurfelnAccept(10,game);
        assertEquals(30, gameService.calculateScore(game,game.getIteration()));

    }

    @Test
    public void threeStrikes() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(10,game);
        gameService.wurfelnAccept(10,game);
        gameService.wurfelnAccept(10,game);
        assertEquals(60, gameService.calculateScore(game,game.getIteration()));
    }

    @Test
    public void threeSpares() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(5,game);

        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(5,game);

        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(5,game);

        assertEquals(40, gameService.calculateScore(game,game.getIteration()));
    }

    @Test
    public void singleStrikeBeforeLastFrame() {
        GameService gameService = new GameService();
        IntStream.range(0, 16).forEach(i -> gameService.wurfelnAccept(0,game));

        gameService.wurfelnAccept(10,game);

        gameService.wurfelnAccept(2,game);
        gameService.wurfelnAccept(8,game);
        gameService.wurfelnAccept(6,game);
        assertEquals(36, gameService.calculateScore(game,game.getIteration()));
    }

}
