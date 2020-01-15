package com.valtech.amel;


import org.junit.Test;

import static org.junit.Assert.*;


public class GameModelTest {

    @Test
    public void Game1() {
        GameController gameController = new GameController();
        gameController.iteration = 0;
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        int actual = gameController.calculateScore(gameController.iteration);
        int expected = 8;
        assertEquals(expected, actual);

        gameController.iteration = 1;
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 9;
        assertEquals(expected, actual);

        gameController.iteration = 2;
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 19;
        assertEquals(expected, actual);

        gameController.iteration = 3;
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(4);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 25;
        assertEquals(expected, actual);

        gameController.iteration = 4;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 35;
        assertEquals(expected, actual);

        gameController.iteration = 5;
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 39;
        assertEquals(expected, actual);

        gameController.iteration = 6;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 49;
        assertEquals(expected, actual);

        gameController.iteration = 7;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 69;
        assertEquals(expected, actual);

        gameController.iteration = 8;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 99;
        assertEquals(expected, actual);

        gameController.iteration = 9;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        System.out.println("Score Game 1 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 179;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.gameModel.frames);
    }

    @Test
    public void Spiel2() {
        GameController gameController = new GameController();
        gameController.iteration = 0;
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        int actual = gameController.calculateScore(gameController.iteration);
        int expected = 8;
        assertEquals(expected, actual);

        gameController.iteration = 1;
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 9;
        assertEquals(expected, actual);

        gameController.iteration = 2;
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 19;
        assertEquals(expected, actual);

        gameController.iteration = 3;
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(4);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 25;
        assertEquals(expected, actual);

        gameController.iteration = 4;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 35;
        assertEquals(expected, actual);

        gameController.iteration = 5;
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 39;
        assertEquals(expected, actual);

        gameController.iteration = 6;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 49;
        assertEquals(expected, actual);

        gameController.iteration = 7;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 69;
        assertEquals(expected, actual);

        gameController.iteration = 8;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 99;
        assertEquals(expected, actual);

        gameController.iteration = 9;
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(8);
        gameController.wurfelnAccept(6);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 2 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 133;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.gameModel.frames);
    }

    @Test
    public void Spiel3() {
        GameController gameController = new GameController();
        gameController.iteration = 0;
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        int actual = gameController.calculateScore(gameController.iteration);
        int expected = 2;
        assertEquals(expected, actual);

        gameController.iteration = 1;
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(3);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 7;
        assertEquals(expected, actual);

        gameController.iteration = 2;
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(4);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 16;
        assertEquals(expected, actual);

        gameController.iteration = 3;
        gameController.wurfelnAccept(6);
        gameController.wurfelnAccept(1);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 23;
        assertEquals(expected, actual);

        gameController.iteration = 4;
        gameController.wurfelnAccept(1);
        gameController.wurfelnAccept(6);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 30;
        assertEquals(expected, actual);

        gameController.iteration = 5;
        gameController.wurfelnAccept(7);
        gameController.wurfelnAccept(2);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 39;
        assertEquals(expected, actual);

        gameController.iteration = 6;
        gameController.wurfelnAccept(0);
        gameController.wurfelnAccept(5);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 44;
        assertEquals(expected, actual);

        gameController.iteration = 7;
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(3);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 50;
        assertEquals(expected, actual);

        gameController.iteration = 8;
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 60;
        assertEquals(expected, actual);

        gameController.iteration = 9;
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(6);
        gameController.wurfelnAccept(0);
        System.out.println("Score Game 3 Turn " + gameController.iteration + " :" + gameController.calculateScore(gameController.iteration));
        actual = gameController.calculateScore(gameController.iteration);
        expected = 92;
        assertEquals(expected, actual);

        gameController.gameView.printFrames(gameController.gameModel.frames);
    }

}
