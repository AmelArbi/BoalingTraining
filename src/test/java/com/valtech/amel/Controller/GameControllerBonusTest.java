package com.valtech.amel.Controller;

import java.util.stream.IntStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameControllerBonusTest {

/*    @Test
    public  void  calculateScoreWithFullScore(){
        GameController gameController = new GameController();

    }*/

    @Test
    public void addBonus(){
        GameController gameController = new GameController();
        gameController.wurfelnAccept(1);//0
        System.out.println(gameController.iteration);//0
        gameController.wurfelnAccept(2);
        System.out.println(gameController.iteration);//1
        gameController.wurfelnAccept(10);
        System.out.println(gameController.iteration);//2
        assertEquals(0, gameController.game.getFrames().get(0).getBonusCount());
        assertEquals(2, gameController.game.getFrames().get(1).getBonusCount());




    }

    @Test
    public void calculateFrameScore(){
        GameController gameController = new GameController();
        //
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(2);
        //
        gameController.wurfelnAccept(10);//1
       // gameController.wurfelnAccept(8);//1

        gameController.wurfelnAccept(10);//2
        gameController.wurfelnAccept(10);//2
        ////
        //        gameController.wurfelnAccept(10);//3
        //
        //        gameController.wurfelnAccept(10);

        //        assertEquals(3, gameController.calculateScore(0));
        //        assertEquals(13, gameController.calculateScore(1));
        //        assertEquals(33, gameController.calculateScore(2));
        //        assertEquals(63, gameController.calculateScore(3));
        //        assertEquals(93, gameController.calculateScore(4));


        assertEquals(3, gameController.calculateScore(0));
        assertEquals(23, gameController.calculateScore(1));


//        assertEquals(3, gameController.game.getFrames().get(0).getFinalScore());
//        assertEquals(3, gameController.game.getFrames().get(0).getFinalScore());
//        assertEquals(20, gameController.game.getFrames().get(1).getFinalScore());




    }

    @Test
    public void calculateScoreForward(){
        GameController gameController = new GameController();
//
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(2);
//
        gameController.wurfelnAccept(10);//1

        gameController.wurfelnAccept(10);//2
////
//        gameController.wurfelnAccept(10);//3
//
//        gameController.wurfelnAccept(10);

//        assertEquals(3, gameController.calculateScore(0));
//        assertEquals(13, gameController.calculateScore(1));
//        assertEquals(33, gameController.calculateScore(2));
//        assertEquals(63, gameController.calculateScore(3));
//        assertEquals(93, gameController.calculateScore(4));

        assertEquals(3, gameController.game.getFrames().get(0).getFinalScore());
        assertEquals(20, gameController.game.getFrames().get(1).getFinalScore());


    }

    @Test
    public void LastFrameSpareAddBonusTest() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        assertEquals(0, gameController.getBonus(9));
        assertEquals(13, gameController.calculateScore());

    }

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