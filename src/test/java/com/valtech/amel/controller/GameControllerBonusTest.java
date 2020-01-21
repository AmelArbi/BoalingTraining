package com.valtech.amel.controller;

import java.util.stream.IntStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameControllerBonusTest {

    @Test
    public void LastFrameSpare() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        assertEquals(0, gameController.getBonus(9));
        assertEquals(13, gameController.calculateScore());

    }

    @Test
    public void LastFrameStrike() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        assertEquals(0, gameController.getBonus(9));
        assertEquals(18, gameController.calculateScore());

    }

    @Test
    public void LastFrameRegular() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(3);
        assertEquals(0, gameController.getBonus(9));
        assertEquals(6, gameController.calculateScore());

    }

    @Test
    public void FirstFrameRegular() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(2);

        assertEquals(0, gameController.getBonus(0));
        assertEquals(5, gameController.calculateScore());

    }

    @Test
    public void FirstFrameSpare() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);

        assertEquals(0, gameController.getBonus(0));
        assertEquals(10, gameController.calculateScore());

    }

    @Test
    public void FirstFrameStrike() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);

        assertEquals(0, gameController.getBonus(0));
        assertEquals(10, gameController.calculateScore());

    }

    @Test
    public void TowStrikes() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);

        assertEquals(10, gameController.getBonus(1));
        assertEquals(30, gameController.calculateScore());

    }

    @Test
    public void ThreeStrikes() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        assertEquals(60, gameController.calculateScore());
        assertEquals(20, gameController.getBonus(2));
        assertEquals(10, gameController.getBonus(1));
    }



    @Test
    public void ThreeSpares() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);

        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);

        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);

        assertEquals(40, gameController.calculateScore());
        assertEquals(5, gameController.getBonus(2));
        assertEquals(5, gameController.getBonus(1));
    }

    @Test
    public void SingleStrikeBeforeLastFrame() {
        GameController gameController = new GameController();
        IntStream.range(0, 16).forEach(i -> gameController.wurfelnAccept(0));

        gameController.wurfelnAccept(10);

        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(8);
        gameController.wurfelnAccept(6);


        assertEquals(10, gameController.getBonus(9));
        assertEquals(36, gameController.calculateScore());
    }
}