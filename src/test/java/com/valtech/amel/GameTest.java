package com.valtech.amel;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class GameTest {
    @Test
    public void spielStand() {
        Game game = new Game();
        game.iteration = 0;
        game.wurfelnAccept(5);
        game.wurfelnAccept(3);
        Integer actual=  game.spielStand(game.iteration);
        Integer  expected = 8;
        assertEquals(actual,expected);

        game.iteration = 1;
        game.wurfelnAccept(0);
        game.wurfelnAccept(1);
        actual=  game.spielStand(game.iteration);
        expected = 9;
        assertEquals(actual,expected);

        game.iteration = 2;
        game.wurfelnAccept(5);
        game.wurfelnAccept(5);
        actual=  game.spielStand(game.iteration);
        expected = 19;
        assertEquals(actual,expected);

        game.iteration = 3;
        game.wurfelnAccept(1);
        game.wurfelnAccept(4);
        actual=  game.spielStand(game.iteration);
        expected = 25;
        assertEquals(actual,expected);

        game.iteration = 4;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 35;
        assertEquals(actual,expected);

        game.iteration = 5;
        game.wurfelnAccept(1);
        game.wurfelnAccept(1);
        actual=  game.spielStand(game.iteration);
        expected = 39;
        assertEquals(actual,expected);

        game.iteration = 6;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 49;
        assertEquals(actual,expected);

        game.iteration = 7;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 69;
        assertEquals(actual,expected);

        game.iteration = 8;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        actual=  game.spielStand(game.iteration);
        expected = 99;
        assertEquals(actual,expected);

        game.iteration = 9;
        game.wurfelnAccept(10);
        game.wurfelnAccept(0);
        game.wurfelnAccept(10);
        game.wurfelnAccept(10);
        actual=  game.spielStand(game.iteration);
        expected = 179;
        assertEquals(actual,expected);


    }
}
