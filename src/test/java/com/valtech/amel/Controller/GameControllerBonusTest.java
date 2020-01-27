package com.valtech.amel.Controller;

import java.util.stream.IntStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameControllerBonusTest {

    @Test
    public void wuerfelAccept() {
        GameController gameController = new GameController();
        System.out.println("0 " + gameController.iteration);//0
        gameController.wurfelnAccept(10);//0
        System.out.println("0 " + gameController.iteration);//0
        gameController.gameView.printFrames(gameController.game.getFrames(), gameController.calculateScore());

        gameController.wurfelnAccept(10);
        //gameController.wurfelnAccept(2);
        System.out.println("1 " + gameController.iteration);//0
        gameController.gameView.printFrames(gameController.game.getFrames(), gameController.calculateScore());

    }

    @Test
    public void addBonusRegularFal() {//
        GameController gameController = new GameController();
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        // gameController.wurfelnAccept(1);//0
        System.out.println(gameController.iteration);//0

        assertEquals(2, gameController.getFrame(0).getFinalScore());

        System.out.println(gameController.iteration);//1
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        assertEquals(2, gameController.getFrame(1).getFinalScore());

        System.out.println(gameController.iteration);//2
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        assertEquals(2, gameController.getFrame(1).getFinalScore());
        assertEquals(2, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//3
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        assertEquals(2, gameController.getFrame(1).getFinalScore());
        assertEquals(2, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//4
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        assertEquals(2, gameController.getFrame(2).getFinalScore());
        assertEquals(2, gameController.getFrame(3).getFinalScore());
        assertEquals(2, gameController.getFrame(4).getFinalScore());

        System.out.println(gameController.iteration);//5
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        assertEquals(2, gameController.getFrame(3).getFinalScore());

        System.out.println(gameController.iteration);//6
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        assertEquals(2, gameController.getFrame(5).getFinalScore());

        System.out.println(gameController.iteration);//7
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        assertEquals(2, gameController.getFrame(7).getFinalScore());

        System.out.println(gameController.iteration);//8
        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(1);//0
        assertEquals(2, gameController.getFrame(6).getFinalScore());
        assertEquals(2, gameController.getFrame(7).getFinalScore());
        assertEquals(2, gameController.getFrame(8).getFinalScore());

        System.out.println(gameController.iteration);//9
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        gameController.wurfelnAccept(1);
        System.out.println("---------------" + gameController.iteration);//9
        gameController.wurfelnAccept(1);
        System.out.println("---------------" + gameController.iteration);//9
        //        gameController.wurfelnAccept(10);
        //        System.out.println("iteration / number "+gameController.getFrame(gameController.iteration-1).getNumber());
        assertEquals(2, gameController.getFrame(7).getFinalScore());
        assertEquals(2, gameController.getFrame(8).getFinalScore());
        assertEquals(2, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonus3() {//doppelt gezahlt
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);//0
        System.out.println(gameController.iteration);//0

        assertEquals(10, gameController.getFrame(0).getFinalScore());

        System.out.println(gameController.iteration);//1
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        System.out.println(gameController.iteration);//2
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//3
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//4
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        System.out.println(gameController.iteration);//5
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        System.out.println(gameController.iteration);//6
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        System.out.println(gameController.iteration);//7
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(2);
        assertEquals(14, gameController.getFrame(6).getFinalScore());
        assertEquals(4, gameController.getFrame(7).getFinalScore());

        System.out.println(gameController.iteration);//8
        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(2);
        assertEquals(14, gameController.getFrame(6).getFinalScore());
        assertEquals(4, gameController.getFrame(7).getFinalScore());
        assertEquals(4, gameController.getFrame(8).getFinalScore());

        System.out.println(gameController.iteration);//9
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        gameController.wurfelnAccept(10);
        System.out.println("---------------" + gameController.iteration);//9
        gameController.wurfelnAccept(10);
        System.out.println("---------------" + gameController.iteration);//9
        gameController.wurfelnAccept(10);
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        assertEquals(4, gameController.getFrame(7).getFinalScore());
        assertEquals(4, gameController.getFrame(8).getFinalScore());
        assertEquals(30, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonus1() {//doppelt gezahlt
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);//0
        System.out.println(gameController.iteration);//0

        assertEquals(10, gameController.getFrame(0).getFinalScore());

        System.out.println(gameController.iteration);//1
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        System.out.println(gameController.iteration);//2
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//3
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//4
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        System.out.println(gameController.iteration);//5
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        System.out.println(gameController.iteration);//6
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        System.out.println(gameController.iteration);//7
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(7).getFinalScore());

        System.out.println(gameController.iteration);//8
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(6).getFinalScore());
        assertEquals(20, gameController.getFrame(7).getFinalScore());
        assertEquals(10, gameController.getFrame(8).getFinalScore());

        System.out.println(gameController.iteration);//9
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        gameController.wurfelnAccept(3);
        System.out.println("---------------" + gameController.iteration);//9
        gameController.wurfelnAccept(5);
        System.out.println("---------------" + gameController.iteration);//9
        //gameController.wurfelnAccept(10);
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        assertEquals(23, gameController.getFrame(7).getFinalScore());
        assertEquals(18, gameController.getFrame(8).getFinalScore());
        assertEquals(8, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameSpare() {//doppelt gezahlt
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);//0
        System.out.println(gameController.iteration);//0

        assertEquals(10, gameController.getFrame(0).getFinalScore());

        System.out.println(gameController.iteration);//1
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        System.out.println(gameController.iteration);//2
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//3
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//4
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        System.out.println(gameController.iteration);//5
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        System.out.println(gameController.iteration);//6
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        System.out.println(gameController.iteration);//7
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(7).getFinalScore());

        System.out.println(gameController.iteration);//8
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(6).getFinalScore());
        assertEquals(20, gameController.getFrame(7).getFinalScore());
        assertEquals(10, gameController.getFrame(8).getFinalScore());

        System.out.println(gameController.iteration);//9
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        gameController.wurfelnAccept(3);
        System.out.println("---------------" + gameController.iteration);//9
        gameController.wurfelnAccept(5);
        System.out.println("---------------" + gameController.iteration);//9
        //gameController.wurfelnAccept(10);
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        assertEquals(23, gameController.getFrame(7).getFinalScore());
        assertEquals(18, gameController.getFrame(8).getFinalScore());
        assertEquals(8, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonusLastFrameRegular() {//doppelt gezahlt
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);//0
        System.out.println(gameController.iteration);//0

        assertEquals(10, gameController.getFrame(0).getFinalScore());

        System.out.println(gameController.iteration);//1
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        System.out.println(gameController.iteration);//2
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//3
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//4
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        System.out.println(gameController.iteration);//5
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        System.out.println(gameController.iteration);//6
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        System.out.println(gameController.iteration);//7
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(7).getFinalScore());

        System.out.println(gameController.iteration);//8
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(6).getFinalScore());
        assertEquals(20, gameController.getFrame(7).getFinalScore());
        assertEquals(10, gameController.getFrame(8).getFinalScore());

        System.out.println(gameController.iteration);//9
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        gameController.wurfelnAccept(7);
        System.out.println("---------------" + gameController.iteration);//9
        gameController.wurfelnAccept(3);
        System.out.println("---------------" + gameController.iteration);//9
        gameController.wurfelnAccept(6);
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        assertEquals(27, gameController.getFrame(7).getFinalScore());
        assertEquals(20, gameController.getFrame(8).getFinalScore());
        assertEquals(16, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void addBonus() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(1);//0
        System.out.println(gameController.iteration);//0
        gameController.wurfelnAccept(2);

        assertEquals(3, gameController.getFrame(0).getFinalScore());

        System.out.println(gameController.iteration);//1
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(1).getFinalScore());

        System.out.println(gameController.iteration);//2
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(1).getFinalScore());
        assertEquals(10, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//3
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(1).getFinalScore());
        assertEquals(20, gameController.getFrame(2).getFinalScore());

        System.out.println(gameController.iteration);//4
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(2).getFinalScore());
        assertEquals(20, gameController.getFrame(3).getFinalScore());
        assertEquals(10, gameController.getFrame(4).getFinalScore());

        System.out.println(gameController.iteration);//5
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(3).getFinalScore());

        System.out.println(gameController.iteration);//6
        gameController.wurfelnAccept(10);
        assertEquals(20, gameController.getFrame(5).getFinalScore());

        System.out.println(gameController.iteration);//7
        gameController.wurfelnAccept(10);
        assertEquals(10, gameController.getFrame(7).getFinalScore());

        System.out.println(gameController.iteration);//8
        gameController.wurfelnAccept(10);
        assertEquals(30, gameController.getFrame(6).getFinalScore());
        assertEquals(20, gameController.getFrame(7).getFinalScore());
        assertEquals(10, gameController.getFrame(8).getFinalScore());

        System.out.println(gameController.iteration);//9
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        gameController.wurfelnAccept(3);
        System.out.println("---------------" + gameController.iteration);//9
        gameController.wurfelnAccept(2);
        System.out.println("---------------" + gameController.iteration);//9
        System.out.println("iteration / number " + gameController.getFrame(gameController.iteration - 1).getNumber());
        assertEquals(23, gameController.getFrame(7).getFinalScore());
        assertEquals(15, gameController.getFrame(8).getFinalScore());
        assertEquals(5, gameController.getFrame(9).getFinalScore());

        //        System.out.println(gameController.iteration);//9
        //        gameController.wurfelnAccept(10);
        //        assertEquals(30, gameController.getFrame(7).getFinalScore());
        //        assertEquals(20, gameController.getFrame(8).getFinalScore());
        //        assertEquals(10, gameController.getFrame(9).getFinalScore());
        //
        //        gameController.wurfelnAccept(10);
        //        assertEquals(30, gameController.getFrame(6).getFinalScore());
        //        assertEquals(30, gameController.getFrame(7).getFinalScore());
        //        assertEquals(30, gameController.getFrame(8).getFinalScore());///
        //
        //
        //        assertEquals(20, gameController.getFrame(9).getFinalScore());
        //
        //        gameController.wurfelnAccept(10);
        //        assertEquals(30, gameController.getFrame(7).getFinalScore());
        //        assertEquals(30, gameController.getFrame(8).getFinalScore());
        //        assertEquals(30, gameController.getFrame(9).getFinalScore());
        //
        //       // assertEquals(10, gameController.getFrame(9).getFinalScore());

    }

    @Test
    public void calculateScoreForward() {
        GameController gameController = new GameController();

        gameController.wurfelnAccept(1);//0
        gameController.wurfelnAccept(2);

        gameController.wurfelnAccept(10);//1

        gameController.wurfelnAccept(10);//2

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
        ////assertEquals(0, gameController.getBonus(9));
        assertEquals(13, gameController.calculateScore());

    }

    @Test
    public void LastFrameSpare() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        ////assertEquals(0, gameController.getBonus(9));
        assertEquals(13, gameController.calculateScore());

    }

    @Test
    public void LastFrameStrike() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(3);
        //assertEquals(0, gameController.getBonus(9));
        assertEquals(18, gameController.calculateScore());

    }

    @Test
    public void LastFrameRegular() {
        GameController gameController = new GameController();
        IntStream.range(0, 18).forEach(i -> gameController.wurfelnAccept(0));
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(3);
        ////assertEquals(0, gameController.getBonus(9));
        assertEquals(6, gameController.calculateScore());

    }

    @Test
    public void FirstFrameRegular() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(3);
        gameController.wurfelnAccept(2);

        //assertEquals(0, gameController.getBonus(0));
        assertEquals(5, gameController.calculateScore());

    }

    @Test
    public void FirstFrameSpare() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(5);
        gameController.wurfelnAccept(5);

        //assertEquals(0, gameController.getBonus(0));
        assertEquals(10, gameController.calculateScore());

    }

    @Test
    public void FirstFrameStrike() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);

        //assertEquals(0, gameController.getBonus(0));
        assertEquals(10, gameController.calculateScore());

    }

    @Test
    public void TowStrikes() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);

        //assertEquals(10, gameController.getBonus(1));
        assertEquals(30, gameController.calculateScore());

    }

    @Test
    public void ThreeStrikes() {
        GameController gameController = new GameController();
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        gameController.wurfelnAccept(10);
        assertEquals(60, gameController.calculateScore());
        //assertEquals(20, gameController.getBonus(2));
        //assertEquals(10, gameController.getBonus(1));
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
       // assertEquals(5, gameController.getBonus(2));
        //assertEquals(5, gameController.getBonus(1));
    }

    @Test
    public void SingleStrikeBeforeLastFrame() {
        GameController gameController = new GameController();
        IntStream.range(0, 16).forEach(i -> gameController.wurfelnAccept(0));

        gameController.wurfelnAccept(10);

        gameController.wurfelnAccept(2);
        gameController.wurfelnAccept(8);
        gameController.wurfelnAccept(6);

        //assertEquals(10, gameController.getBonus(9));
        assertEquals(36, gameController.calculateScore());
    }
}