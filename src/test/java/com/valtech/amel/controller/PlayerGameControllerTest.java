package com.valtech.amel.controller;

import com.valtech.amel.dto.PlayerNameDto;
import com.valtech.amel.dto.WurfDto;
import com.valtech.amel.service.GameRepositoryClass;
import com.valtech.amel.service.GameService;
import com.valtech.amel.service.PlayerGameServiceTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class PlayerGameControllerTest {

    GameRepositoryClass gameRepositoryClass = new GameRepositoryClass();
    GameController gameController = new GameController(new GameService(), gameRepositoryClass);

    Logger logger = LoggerFactory.getLogger(PlayerGameServiceTest.class);

    @Test (expected= GameNotInitialized.class)
    public void willReturnExceptionIfGameNotInitialzed() {
        gameController.spielStand("12","123");
    }

    @Test (expected= PlayerNotFound.class)
    public void willReturnExceptionIfPlayerNotFound() {
        String gameId = gameRepositoryClass.createGame();
        gameController.spielStand(gameId,"123");
    }


    @Test ()
    public void GameInitialized() {
        logger.info("Begin GameInitialized");
        String gameId = gameRepositoryClass.createGame();
        logger.info("Game is initialised ");
        String playerId = gameRepositoryClass.createPlayerGame(gameId);
        assertThat(gameController.spielStand(gameId,playerId).getFrames().isEmpty(), is(true));
        assertThat(gameController.spielStand(gameId,playerId).getPlayerName(), nullValue());
        assertThat(gameController.spielStand(gameId,playerId).getTurn(), is(0));
    }


    @Test ()
    public void GameInitialized4Turn() {
        logger.info("Begin GameInitialized");
        String gameId = gameRepositoryClass.createGame();
        String playerId = gameRepositoryClass.createPlayerGame(gameId);
        PlayerNameDto playerNameDto = new PlayerNameDto("Alex");
        gameController.spielerName(gameId,playerId,playerNameDto);
        logger.info("Game Nr : {}. Player with name {} and Nr {}", gameId, playerNameDto.getName(), playerId);
        gameController.wurf(gameId,playerId,new WurfDto(10));
        gameController.wurf(gameId,playerId,new WurfDto(10));
        gameController.wurf(gameId,playerId,new WurfDto(10));
        gameController.wurf(gameId,playerId,new WurfDto(10));
        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(0).getScore(), is(30));
        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(1).getScore(), is(60));
        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(2).getScore(), is(80));
        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(3).getScore(), is(90));
    }


}
