package com.valtech.amel.controller;

import com.valtech.amel.model.Game;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;

public class GameControllerRegressionTests {

    Logger logger = LoggerFactory.getLogger(GameControllerTest.class);
    GameController gameController = new GameController();
    Game game = new Game();

    @Test
    public void GameOneSpareFiveStrike() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(3,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        int actual = gameController.calculateScore(game,game.getIteration());
        int expected = 8;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(1,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 9;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(5,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 19;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(4,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 25;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 35;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 49;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 69;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 99;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        gameController.wurfelnAccept(10,game);
        gameController.wurfelnAccept(10,game);
        assertEquals(3, game.getFrames().get(9).getNumberOfThrows());
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 159;
        assertEquals(expected, actual);
    }

    @Test
    public void LastFrameSpare() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        int actual = gameController.calculateScore(game,game.getIteration());
        int expected = 2;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(7,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 9;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(5,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 19;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(4,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 25;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 35;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 49;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 69;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 99;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(2,game);
        gameController.wurfelnAccept(8,game);
        gameController.wurfelnAccept(6,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 127;
        assertEquals(expected, actual);
    }

    @Test
    public void ForLastFrameStrikeLastFrameSpare() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(1,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        int actual = gameController.calculateScore(game,game.getIteration());
        int expected = 2;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(2,game);
        gameController.wurfelnAccept(3,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 7;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(4,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 16;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(6,game);
        gameController.wurfelnAccept(1,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 23;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(1,game);
        gameController.wurfelnAccept(6,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 30;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(7,game);
        gameController.wurfelnAccept(2,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(5,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 44;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(3,game);
        gameController.wurfelnAccept(3,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 50;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 60;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(5,game);
        gameController.wurfelnAccept(6,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 86;
        assertEquals(expected, actual);
    }

    @Test
    public void PerfectGame() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        int actual = gameController.calculateScore(game,game.getIteration());
        int expected = 10;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 30;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        assertEquals(3, game.getFrames().size());
        actual = gameController.calculateScore(game,game.getIteration());
        assertEquals(60, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 90;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 120;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 150;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 180;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 210;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 240;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(10,game);
        gameController.wurfelnAccept(10,game);
        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void TheWorstGame() {//the worst game
        GameController gameController = new GameController();
        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        int actual = gameController.calculateScore(game,game.getIteration());
        int expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void ForLastFrameStrike() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        int actual = gameController.calculateScore(game,game.getIteration());
        int expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(0,game);
        gameController.wurfelnAccept(10,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 10;
        assertEquals(expected, actual);

        gameController.wurfelnAccept(2,game);
        gameController.wurfelnAccept(7,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameController.calculateScore(game,game.getIteration())
        );
        actual = gameController.calculateScore(game,game.getIteration());
        expected = 21;
        assertEquals(expected, actual);

    }

}
