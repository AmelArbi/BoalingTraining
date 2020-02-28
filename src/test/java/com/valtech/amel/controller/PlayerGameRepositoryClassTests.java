package com.valtech.amel.controller;

import com.valtech.amel.model.PlayerGame;
import com.valtech.amel.service.GameRepositoryClass;
import com.valtech.amel.service.PlayerGameServiceTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlayerGameRepositoryClassTests {
    Logger logger = LoggerFactory.getLogger(PlayerGameServiceTest.class);
    GameRepositoryClass gameRepositoryClass = new GameRepositoryClass();

    @Test
    public void GameCreated(){
        String gameId = gameRepositoryClass.createGame();
        assertThat(gameRepositoryClass.createGame().isEmpty(), is(false));
        assertThat(gameId.isEmpty(), is(false));
    }

    @Test
    public void addGame(){
        String gameId = gameRepositoryClass.createGame();
        String playerId = gameRepositoryClass.createPlayerGame(gameId);
        PlayerGame game = new PlayerGame();
        gameRepositoryClass.addGame(gameId,playerId,game);
        assertThat(gameRepositoryClass.getGame(gameId,playerId), is(game));
    }

    @Test (expected= GameNotInitialized.class)
    public void willReturnExceptionIfGameNotInitialzed() {
        gameRepositoryClass.getGame("123","456");
    }

    @Test(expected =PlayerNotFound.class)
    public  void willReturnExceptionIfPlayerNotFound(){
        String gameId = gameRepositoryClass.createGame();
        gameRepositoryClass.getGame(gameId,"456");
    }





}
