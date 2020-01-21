package com.valtech.amel;

import com.valtech.amel.controller.GameController;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameControllerTest {

    @Test
    public void Game1() {
        GameController gameController = new GameController();
        //gameController.setIteration(0);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 8;
        assertEquals(expected, actual);

        //gameController.setIteration(1);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(1);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 9;
        assertEquals(expected, actual);

        //gameController.setIteration(2);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 19;
        assertEquals(expected, actual);

        //gameController.setIteration(3);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(4);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 25;
        assertEquals(expected, actual);

        //gameController.setIteration(4);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 35;
        assertEquals(expected, actual);

        //gameController.setIteration(5);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 39;
        assertEquals(expected, actual);

        //gameController.setIteration(6);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 49;
        assertEquals(expected, actual);

        //gameController.setIteration(7);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 69;
        assertEquals(expected, actual);

        //gameController.setIteration(8);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 99;
        assertEquals(expected, actual);

        //gameController.setIteration(9);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        assertEquals(3,gameController.game.getFrames().get(9).getThrowList().size());
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 159;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
        System.out.println("9 : " + gameController.game.getFrames().size());
    }

    @Test
    public void Spiel2() {
        GameController gameController = new GameController();
        //gameController.setIteration(0);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 2;
        assertEquals(expected, actual);

        //gameController.setIteration(1);
        gameController.wurfelnAccept(7);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 9;
        assertEquals(expected, actual);

        //gameController.setIteration(2);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 19;
        assertEquals(expected, actual);

        //gameController.setIteration(3);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(4);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 25;
        assertEquals(expected, actual);

        //gameController.setIteration(4);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 35;
        assertEquals(expected, actual);

        //gameController.setIteration(5);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 39;
        assertEquals(expected, actual);

        //gameController.setIteration(6);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 49;
        assertEquals(expected, actual);

        //gameController.setIteration(7);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 69;
        assertEquals(expected, actual);

        //gameController.setIteration(8);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 99;
        assertEquals(expected, actual);

        //gameController.setIteration(9);
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(8);
        gameController.wurfelnAccept(6);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 127;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
    }

    @Test
    public void Spiel3() {
        GameController gameController = new GameController();
        //gameController.setIteration(0);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 2;
        assertEquals(expected, actual);

        //gameController.setIteration(1);
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(3);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 7;
        assertEquals(expected, actual);

        //gameController.setIteration(2);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(4);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 16;
        assertEquals(expected, actual);

        //gameController.setIteration(3);
        gameController.wurfelnAccept(6);
        gameController.wurfelnAccept(1);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 23;
        assertEquals(expected, actual);

        //gameController.setIteration(4);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(6);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 30;
        assertEquals(expected, actual);

        //gameController.setIteration(5);
        gameController.wurfelnAccept(7);
        gameController.wurfelnAccept(2);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 39;
        assertEquals(expected, actual);

        //gameController.setIteration(6);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(5);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 44;
        assertEquals(expected, actual);

        //gameController.setIteration(7);
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(3);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 50;
        assertEquals(expected, actual);

        //gameController.setIteration(8);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 60;
        assertEquals(expected, actual);

        //gameController.setIteration(9);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(6);
        System.out.printf(
                "Score Game 1 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 86;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
    }

    @Test
    public void Game4() {//das perfekte Spiel
        GameController gameController = new GameController();
        //gameController.setIteration(0);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 10;
        assertEquals(expected, actual);

        //gameController.setIteration(1);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 30;
        assertEquals(expected, actual);

        //gameController.setIteration(2);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        assertEquals(3, gameController.game.getFrames().size());
        actual = gameController.calculateScore();
        assertEquals(60, actual);

        //gameController.setIteration(3);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 90;
        assertEquals(expected, actual);

        //gameController.setIteration(4);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 120;
        assertEquals(expected, actual);

        //gameController.setIteration(5);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 150;
        assertEquals(expected, actual);

        //gameController.setIteration(6);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 180;
        assertEquals(expected, actual);

        //gameController.setIteration(7);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 210;
        assertEquals(expected, actual);

        //gameController.setIteration(8);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 240;
        assertEquals(expected, actual);

        //gameController.setIteration(9);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 4 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 300;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
    }


    @Test
    public void Game5() {//the worst game
        GameController gameController = new GameController();
        //gameController.setIteration(0);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(1);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(2);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(3);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(4);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(5);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(6);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(7);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(8);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(9);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 5 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
    }

    @Test//the worst game
    public void Game6() {//das perfekte Spiel
        GameController gameController = new GameController();
        //gameController.setIteration(0);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        int actual = gameController.calculateScore();
        int expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(1);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(2);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(3);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(4);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(5);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(6);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(7);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(0);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 0;
        assertEquals(expected, actual);

        //gameController.setIteration(8);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(10);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 10;
        assertEquals(expected, actual);

        //gameController.setIteration(9);
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(7);
        //gameController.wurfelnAccept(5);
        System.out.printf(
                "Score Game 6 Turn %d :%d%n",
                gameController.getIteration(),
                gameController.calculateScore()
        );
        actual = gameController.calculateScore();
        expected = 21;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
    }

}
