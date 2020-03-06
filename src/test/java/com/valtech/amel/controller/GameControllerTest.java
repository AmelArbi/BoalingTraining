package com.valtech.amel.controller;

import java.util.Optional;
import com.valtech.amel.dto.PlayerNameDto;
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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameControllerTest {

    @Mock
    private GameRepository gameRepository;
    @Mock
    private PlayerGameRepository playerGameRepository;

    @InjectMocks
    private GameRepositoryClass gameRepositoryClass;

    @InjectMocks
    private GameController gameController;

    @Test
    public void playerNameTest() {

        PlayerGame playerGame = new PlayerGame(1);

        Game game = new Game(10);

        when(gameRepository.findById(10l))
                .thenReturn(Optional.of(game));

        when(playerGameRepository.findByGameAndId(game, 1))
                .thenReturn(Optional.of(playerGame));


        when(playerGameRepository.save(any()))
                .thenReturn(playerGame);

        gameController.playerName(10, 1, new PlayerNameDto("Alex"));

    }

}
