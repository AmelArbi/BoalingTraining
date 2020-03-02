package com.valtech.amel.controller;

import java.util.Optional;
import com.valtech.amel.model.Game;
import com.valtech.amel.model.PlayerGame;
import com.valtech.amel.service.GameRepository;
import com.valtech.amel.service.GameRepositoryClass;
import com.valtech.amel.service.GameService;
import com.valtech.amel.service.PlayerGameRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PlayerGameRepositoryClassTests {
    private GameRepositoryClass gameRepositoryClass;
    private GameController gameController;

    private GameRepository gameRepository;
    private PlayerGameRepository playerGameRepository;

    @Before// with BeforeClass, will be excecuted only one time before
    public void init(){//with static, int() will be only one time excecuted
        gameRepository = Mockito.mock(GameRepository.class);
        playerGameRepository = Mockito.mock(PlayerGameRepository.class);
        gameRepositoryClass = new GameRepositoryClass(gameRepository, playerGameRepository);
        gameController = new GameController(new GameService(), gameRepositoryClass);

    }

    @Test
    public void GameCreated(){
        assertThat(gameRepositoryClass.createGame()>0, is(true));
    }

    @Test
    public void addGame(){
        when(gameRepository.save(any()))
                .thenReturn(new Game(10));
        when(gameRepository.findById(10l))
                .thenReturn(Optional.of((new Game(10))));


        when(playerGameRepository.save(any()))
                .thenReturn(new PlayerGame(1));
        when(playerGameRepository.findById(1l))
                .thenReturn(Optional.of(new PlayerGame(1)));
//        when(playerGameRepository.findByGameAndById(gameRepository.findById(10l).get(),1l))
//        .thenReturn(Optional.of(new PlayerGame(1)));


        long gameId = gameRepositoryClass.createGame();
        long playerId = gameRepositoryClass.createPlayerGame(10);

        assertNotNull(gameRepositoryClass.getGame(gameId,playerId));
    }

    @Test (expected= GameNotInitialized.class)
    public void willReturnExceptionIfGameNotInitialzed() {
        gameRepositoryClass.getGame(123,456);
    }

    @Test(expected =PlayerNotFound.class)
    public  void willReturnExceptionIfPlayerNotFound(){
        long gameId = gameRepositoryClass.createGame();
        gameRepositoryClass.getGame(gameId,456);
    }





}
