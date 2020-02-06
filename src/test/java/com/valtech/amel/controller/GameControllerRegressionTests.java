package com.valtech.amel.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;

public class GameControllerRegressionTests {

    Logger logger = LoggerFactory.getLogger(GameControllerTest.class);

    @Test
    public void GameOneSpareFiveStrike() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 8;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(1);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 9;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 19;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(4);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 25;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 35;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 39;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 49;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 69;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 99;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        assertEquals(3, gameController.getGame().getFrames().get(9).getNumberOfThrows());
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 159;
        assertEquals(expected, actual);
    }

    @Test
    public void LastFrameSpare() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 2;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(7);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 9;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 19;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(4);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 25;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 35;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 39;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 49;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 69;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 99;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(8);
        gameController.wurfelnAccept(6);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 127;
        assertEquals(expected, actual);

        gameController.getGameView().printFrames(gameController.getGame().getFrames(), actual);
    }

    @Test
    public void ForLastFrameStrikeLastFrameSpare() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 2;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(3);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 7;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(4);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 16;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(6);
        gameController.wurfelnAccept(1);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 23;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(6);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 30;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(7);
        gameController.wurfelnAccept(2);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 39;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(5);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 44;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(3);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 50;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 60;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(6);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 86;
        assertEquals(expected, actual);

        gameController.getGameView().printFrames(gameController.getGame().getFrames(), actual);
    }

    @Test
    public void PerfectGame() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 10;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 30;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        assertEquals(3, gameController.getGame().getFrames().size());
        actual = gameController.calculateScore();
        assertEquals(60, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 90;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 120;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 150;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 180;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 210;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 240;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        logger.info(
                "Score perfect  Game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 300;
        assertEquals(expected, actual);

        gameController.getGameView().printFrames(gameController.getGame().getFrames(), actual);
    }

    @Test
    public void TheWorstGame() {//the worst game
        GameController gameController = new GameController();
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of the worst game Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.getGameView().printFrames(gameController.getGame().getFrames(), actual);
    }

    @Test
    public void ForLastFrameStrike() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(10);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 10;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(7);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                gameController.getGame().getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 21;
        assertEquals(expected, actual);

    }

}
