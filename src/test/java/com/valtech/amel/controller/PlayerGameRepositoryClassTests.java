package com.valtech.amel.controller;

import java.util.Optional;
import com.valtech.amel.model.Game;
import com.valtech.amel.model.PlayerGame;
import com.valtech.amel.service.GameRepository;
import com.valtech.amel.service.GameRepositoryClass;
import com.valtech.amel.service.PlayerGameRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PlayerGameRepositoryClassTests {



    @Mock
    private GameRepository gameRepository;
    @Mock
    private PlayerGameRepository playerGameRepository;

    @InjectMocks
    private GameRepositoryClass gameRepositoryClass;

    @Test
    public void GameCreated() {
        when(gameRepository.save(any()))
                .thenReturn(new Game(10));
        assertThat(gameRepositoryClass.createGame() > 0, is(true));
    }

    @Test(expected = GameNotInitialized.class)
    public void createPlayerGameThrowExceptionWhenGameNotInitialized() {
        gameRepositoryClass.createPlayerGame(10);
    }

//    @Test
//    private void createPlayerGameTest(){
//       Game game = new Game(10);
//
//       when(gameRepository.findById(10l))
//               .thenReturn(Optional.of(game));
//
//    }

    @Test
    public void getGameTest() {
        Game game = new Game(10);

        when(gameRepository.findById(10l))
                .thenReturn(Optional.of((game)));

        when(playerGameRepository.findByGameAndById(game, 1l))
                .thenReturn(Optional.of(new PlayerGame(1)));

        assertNotNull(gameRepositoryClass.getGame(10, 1));
    }

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


}
