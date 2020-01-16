package com.valtech.amel;

import com.valtech.amel.controller.GameController;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameModelTest {

    @Test
    public void Game1() {
        // GameController gameController = new GameController(0,5,3);
        GameController gameController = new GameController();
        gameController.setIteration(0);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        int actual = gameController.calculateScore(gameController.getIteration());
        int expected = 8;
        assertEquals(expected, actual);

        gameController.setIteration(1);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 9;
        assertEquals(expected, actual);

        gameController.setIteration(2);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 19;
        assertEquals(expected, actual);

        gameController.setIteration(3);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(4);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 25;
        assertEquals(expected, actual);

        gameController.setIteration(4);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 35;
        assertEquals(expected, actual);

        gameController.setIteration(5);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameController.setIteration(6);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 49;
        assertEquals(expected, actual);

        gameController.setIteration(7);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 69;
        assertEquals(expected, actual);

        gameController.setIteration(8);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 99;
        assertEquals(expected, actual);

        gameController.setIteration(9);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        System.out.println("Score Game 1 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 179;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
        System.out.println("9 : " + gameController.game.getFrames().size());
    }

    @Test
    public void Spiel2() {
        GameController gameController = new GameController();
        gameController.setIteration(0);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        int actual = gameController.calculateScore(gameController.getIteration());
        int expected = 8;
        assertEquals(expected, actual);

        gameController.setIteration(1);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 9;
        assertEquals(expected, actual);

        gameController.setIteration(2);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 19;
        assertEquals(expected, actual);

        gameController.setIteration(3);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(4);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 25;
        assertEquals(expected, actual);

        gameController.setIteration(4);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 35;
        assertEquals(expected, actual);

        gameController.setIteration(5);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameController.setIteration(6);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 49;
        assertEquals(expected, actual);

        gameController.setIteration(7);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 69;
        assertEquals(expected, actual);

        gameController.setIteration(8);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 99;
        assertEquals(expected, actual);

        gameController.setIteration(9);
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(8);
        gameController.wurfelnAccept(6);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 133;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
    }

    @Test
    public void Spiel3() {
        GameController gameController = new GameController();
        gameController.setIteration(0);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        int actual = gameController.calculateScore(gameController.getIteration());
        int expected = 2;
        assertEquals(expected, actual);

        gameController.setIteration(1);
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(3);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 7;
        assertEquals(expected, actual);

        gameController.setIteration(2);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(4);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 16;
        assertEquals(expected, actual);

        gameController.setIteration(3);
        gameController.wurfelnAccept(6);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 23;
        assertEquals(expected, actual);

        gameController.setIteration(4);
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(6);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 30;
        assertEquals(expected, actual);

        gameController.setIteration(5);
        gameController.wurfelnAccept(7);
        gameController.wurfelnAccept(2);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 39;
        assertEquals(expected, actual);

        gameController.setIteration(6);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(5);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 44;
        assertEquals(expected, actual);

        gameController.setIteration(7);
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(3);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 50;
        assertEquals(expected, actual);

        gameController.setIteration(8);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 60;
        assertEquals(expected, actual);

        gameController.setIteration(9);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(6);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 3 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 92;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
    }

    @Test
    public void Game4() {//das perfekte Spiel
        // GameController gameController = new GameController(0,5,3);
        GameController gameController = new GameController();
        gameController.setIteration(0);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        int actual = gameController.calculateScore(gameController.getIteration());
        int expected = 10;
        assertEquals(expected, actual);

        gameController.setIteration(1);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 30;
        assertEquals(expected, actual);

        gameController.setIteration(2);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 60;
        assertEquals(expected, actual);

        gameController.setIteration(3);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 90;
        assertEquals(expected, actual);

        gameController.setIteration(4);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 120;
        assertEquals(expected, actual);

        gameController.setIteration(5);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 150;
        assertEquals(expected, actual);

        gameController.setIteration(6);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 180;
        assertEquals(expected, actual);

        gameController.setIteration(7);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 210;
        assertEquals(expected, actual);

        gameController.setIteration(8);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 240;
        assertEquals(expected, actual);

        gameController.setIteration(9);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        System.out.println("Score Game 4 Turn " + gameController.getIteration() + " :" + gameController
                .calculateScore(gameController.getIteration()));
        actual = gameController.calculateScore(gameController.getIteration());
        expected = 300;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.game.getFrames());
    }

}
