package com.valtech.amel;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class GameTest {
    @Test
    public void spielStand1() {
        Game game = new Game();
        game.iteration = 0;
        game.wurfelnAccept(5);
        game.wurfelnAccept(3);
        Integer actual=  game.spielStand(game.iteration);
        Integer  expected = 8;
        assertEquals(expected, actual);

        game.iteration = 1;
        game.wurfelnAccept(0);
        game.wurfelnAccept(1);
        actual=  game.spielStand(game.iteration);
        expected = 9;
        assertEquals(expected, actual);

        game.iteration = 2;
        game.wurfelnAccept(5);
        game.wurfelnAccept(5);
        actual=  game.spielStand(game.iteration);
        expected = 19;
        assertEquals(expected, actual);

        game.iteration = 3;
        game.wurfelnAccept(1);
        game.wurfelnAccept(4);
        actual=  game.spielStand(game.iteration);
        expected = 25;
        assertEquals(expected, actual);

        game.iteration = 4;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 35;
        assertEquals(expected, actual);

        game.iteration = 5;
        game.wurfelnAccept(1);
        game.wurfelnAccept(1);
        actual=  game.spielStand(game.iteration);
        expected = 39;
        assertEquals(expected, actual);

        game.iteration = 6;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 49;
        assertEquals(expected, actual);

        game.iteration = 7;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 69;
        assertEquals(expected, actual);

        game.iteration = 8;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 99;
        assertEquals(expected, actual);

        game.iteration = 9;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        game.wurfelnAccept(10);
        game.wurfelnAccept(10);
        actual=  game.spielStand(game.iteration);
        expected = 179;
        assertEquals(expected, actual);
    }

    @Test
    public void spielStand2() {
        Game game = new Game();
        game.iteration = 0;
        game.wurfelnAccept(5);
        game.wurfelnAccept(3);
        Integer actual=  game.spielStand(game.iteration);
        Integer  expected = 8;
        assertEquals(expected, actual);

        game.iteration = 1;
        game.wurfelnAccept(0);
        game.wurfelnAccept(1);
        actual=  game.spielStand(game.iteration);
        expected = 9;
        assertEquals(expected, actual);

        game.iteration = 2;
        game.wurfelnAccept(5);
        game.wurfelnAccept(5);
        actual=  game.spielStand(game.iteration);
        expected = 19;
        assertEquals(expected, actual);

        game.iteration = 3;
        game.wurfelnAccept(1);
        game.wurfelnAccept(4);
        actual=  game.spielStand(game.iteration);
        expected = 25;
        assertEquals(expected, actual);

        game.iteration = 4;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 35;
        assertEquals(expected, actual);

        game.iteration = 5;
        game.wurfelnAccept(1);
        game.wurfelnAccept(1);
        actual=  game.spielStand(game.iteration);
        expected = 39;
        assertEquals(expected, actual);

        game.iteration = 6;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 49;
        assertEquals(expected, actual);

        game.iteration = 7;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 69;
        assertEquals(expected, actual);

        game.iteration = 8;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 99;
        assertEquals(expected, actual);

        game.iteration = 9;
        game.wurfelnAccept(2);
        game.wurfelnAccept(8);
        game.wurfelnAccept(6);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 133;
        assertEquals(expected, actual);
    }
    @Test
    public void spielStand3() {
        Game game = new Game();
        game.iteration = 0;
        game.wurfelnAccept(1);
        game.wurfelnAccept(1);
        Integer actual=  game.spielStand(game.iteration);
        Integer  expected = 2;
        assertEquals(expected, actual);

        game.iteration = 1;
        game.wurfelnAccept(2);
        game.wurfelnAccept(3);
        actual=  game.spielStand(game.iteration);
        expected = 7;
        assertEquals(expected, actual);

        game.iteration = 2;
        game.wurfelnAccept(5);
        game.wurfelnAccept(4);
        actual=  game.spielStand(game.iteration);
        expected = 16;
        assertEquals(expected, actual);

        game.iteration = 3;
        game.wurfelnAccept(6);
        game.wurfelnAccept(1);
        actual=  game.spielStand(game.iteration);
        expected = 23;
        assertEquals(expected, actual);

        game.iteration = 4;
        game.wurfelnAccept(1);
        game.wurfelnAccept(6);
        actual=  game.spielStand(game.iteration);
        expected = 30;
        assertEquals(expected, actual);

        game.iteration = 5;
        game.wurfelnAccept(7);
        game.wurfelnAccept(2);
        actual=  game.spielStand(game.iteration);
        expected = 39;
        assertEquals(expected, actual);

        game.iteration = 6;
        game.wurfelnAccept(0);
        game.wurfelnAccept(5);
        actual=  game.spielStand(game.iteration);
        expected = 44;
        assertEquals(expected, actual);

        game.iteration = 7;
        game.wurfelnAccept(3);
        game.wurfelnAccept(3);
        actual=  game.spielStand(game.iteration);
        expected = 50;
        assertEquals(expected, actual);

        game.iteration = 8;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 60;
        assertEquals(expected, actual);

        game.iteration = 9;
        game.wurfelnAccept(5);
        game.wurfelnAccept(5);
        game.wurfelnAccept(6);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 92;
        assertEquals(expected, actual);
    }
}
