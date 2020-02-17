package com.valtech.amel.service;

import java.util.ArrayList;
import java.util.List;
import com.valtech.amel.controller.GameController;
import com.valtech.amel.model.Game;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;

public class GameControllerTest {
    GameController gameController = new GameController(new GameService());

    Logger logger = LoggerFactory.getLogger(GameServiceTest.class);

    @Test
    public void spielStandJsonDtoPerfectGameTest(){

        List<Integer> list = new ArrayList<>();
        list.add(10);

        logger.info("Begin der Test von spielStandJsonDtoTest");

        gameController.resetGame();
        gameController.spielerName("Alex");
        assertEquals(0, gameController.spielStandJsonDto().getTurn());
        gameController.wurf(10);
        assertEquals(1, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(0).getThrowList());
        assertEquals(10,gameController.spielStandJsonDto().getFrames().get(0).getScore());

        gameController.wurf(10);
        assertEquals(2, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(1).getThrowList());

        gameController.wurf(10);
        assertEquals(3, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(2).getThrowList());

        gameController.wurf(10);
        assertEquals(4, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(3).getThrowList());

        gameController.wurf(10);
        assertEquals(5, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(4).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(4).getThrowList());

        gameController.wurf(10);
        assertEquals(6, gameController.spielStandJsonDto().getTurn());
        assertEquals("Alex", gameController.spielStandJsonDto().getPlayerName());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(0).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(1).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(2).getScore());
        assertEquals(30, gameController.spielStandJsonDto().getFrames().get(3).getScore());
        assertEquals(20, gameController.spielStandJsonDto().getFrames().get(4).getScore());
        assertEquals(10, gameController.spielStandJsonDto().getFrames().get(5).getScore());
        assertEquals(list,gameController.spielStandJsonDto().getFrames().get(5).getThrowList());







    }

}
