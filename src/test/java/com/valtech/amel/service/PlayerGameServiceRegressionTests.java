package com.valtech.amel.service;

import com.valtech.amel.model.PlayerGame;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;

public class PlayerGameServiceRegressionTests {

    Logger logger = LoggerFactory.getLogger(PlayerGameServiceTest.class);
    GameService gameService = new GameService();
    PlayerGame game = new PlayerGame();

    @Test
    public void GameOneSpareFiveStrike() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(3,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        int actual = gameService.calculateScore(game,game.getIteration());
        int expected = 8;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(1,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 9;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(5,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 19;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(4,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 25;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 35;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 49;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 69;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 99;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        gameService.wurfelnAccept(10,game);
        gameService.wurfelnAccept(10,game);
        assertEquals(3, game.getFrames().get(9).getNumberOfThrows());
        logger.info(
                "Score Game one Spare  and five Strike Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 159;
        assertEquals(expected, actual);
    }

    @Test
    public void LastFrameSpare() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        int actual = gameService.calculateScore(game,game.getIteration());
        int expected = 2;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(7,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 9;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(5,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 19;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(4,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 25;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 35;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 49;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 69;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 99;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(2,game);
        gameService.wurfelnAccept(8,game);
        gameService.wurfelnAccept(6,game);
        logger.info(
                "Score Game Last Frame Spare Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 127;
        assertEquals(expected, actual);
    }

    @Test
    public void ForLastFrameStrikeLastFrameSpare() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(1,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        int actual = gameService.calculateScore(game,game.getIteration());
        int expected = 2;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(2,game);
        gameService.wurfelnAccept(3,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 7;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(4,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 16;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(6,game);
        gameService.wurfelnAccept(1,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 23;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(1,game);
        gameService.wurfelnAccept(6,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 30;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(7,game);
        gameService.wurfelnAccept(2,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(5,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 44;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(3,game);
        gameService.wurfelnAccept(3,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 50;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 60;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(5,game);
        gameService.wurfelnAccept(6,game);
        logger.info(
                "Score of ForLastFrameStrikeLastFrameSpareGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 86;
        assertEquals(expected, actual);
    }

    @Test
    public void PerfectGame() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        int actual = gameService.calculateScore(game,game.getIteration());
        int expected = 10;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 30;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        assertEquals(3, game.getFrames().size());
        actual = gameService.calculateScore(game,game.getIteration());
        assertEquals(60, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 90;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 120;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 150;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 180;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 210;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 240;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(10,game);
        gameService.wurfelnAccept(10,game);
        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score perfect  Game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void TheWorstGame() {//the worst game
        GameService gameService = new GameService();
        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        int actual = gameService.calculateScore(game,game.getIteration());
        int expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of the worst game Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void ForLastFrameStrike() {
        GameService gameService = new GameService();
        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        int actual = gameService.calculateScore(game,game.getIteration());
        int expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(0,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 0;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(0,game);
        gameService.wurfelnAccept(10,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 10;
        assertEquals(expected, actual);

        gameService.wurfelnAccept(2,game);
        gameService.wurfelnAccept(7,game);
        logger.info(
                "Score of ForLastFrameStrikeGame Turn {} {}",
                game.getIteration(),
                gameService.calculateScore(game,game.getIteration())
        );
        actual = gameService.calculateScore(game,game.getIteration());
        expected = 21;
        assertEquals(expected, actual);

    }

}
