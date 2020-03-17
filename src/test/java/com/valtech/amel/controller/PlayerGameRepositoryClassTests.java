package com.valtech.amel.controller;

import java.util.Optional;
import com.valtech.amel.model.Game;
import com.valtech.amel.model.PlayerGame;
import com.valtech.amel.service.GameRepository;
import com.valtech.amel.service.GameRepositoryClass;
import com.valtech.amel.service.GameService;
import com.valtech.amel.service.PlayerGameRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PlayerGameRepositoryClassTests {

    @Mock
    private GameRepository gameRepository;
    @Mock
    private PlayerGameRepository playerGameRepository;
    @Mock
    private GameService gameService;

    @InjectMocks
    private GameRepositoryClass gameRepositoryClass;

    @Test(expected = GameNotInitialized.class)
    public void willReturnExceptionIfGameNotInitialzed() {
        gameRepositoryClass.getGame(123, 456);
    }

    @Test(expected = PlayerNotFound.class)
    public void willReturnExceptionIfPlayerNotFound() {
        Game game = new Game(10);

        when(gameRepository.findById(10l))
                .thenReturn(Optional.of(game));

        gameRepositoryClass.getGame(10, 456);
    }

    @Test(expected = GameNotInitialized.class)
    public void createPlayerGameThrowExceptionWhenGameNotInitialized() {
        gameRepositoryClass.createPlayerGame(10);
    }

    @Test
    public void GameCreated() {
        Game game = new Game(10);

        when(gameRepository.save(any()))
                .thenReturn(game);

        assertThat(gameRepositoryClass.createGame() > 0, is(true));
        assertThat(gameRepositoryClass.createGame(), is(10l));
    }

    @Test
    public void createPlayerGameTest() {
        Game game = new Game(10);

        when(gameRepository.findById(10l))
                .thenReturn(Optional.of(game));

        when(playerGameRepository.save(any()))
                .thenReturn(new PlayerGame(1));


        assertThat(gameRepositoryClass.createPlayerGame(10),is(1l));

    }

    @Test
    public void getGameTest() {
        Game game = new Game(10);

        PlayerGame playerGame = new PlayerGame(1);

        when(gameRepository.findById(10l))
                .thenReturn(Optional.of((game)));

        when(playerGameRepository.findByGameAndId(game, 1l))
                .thenReturn(Optional.of(playerGame));

        //assertNotNull(gameRepositoryClass.getGame(10, 1));
        assertThat(gameRepositoryClass.getGame(10l,1l), is(playerGame));

    }



}
