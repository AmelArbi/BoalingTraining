package com.valtech.amel.controller;

import com.valtech.amel.dto.PlayerNameDto;
import com.valtech.amel.model.PlayerGame;
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
    private PlayerGameRepository playerGameRepository;

    @Mock
    private GameRepositoryClass gameRepositoryClass;

    @InjectMocks
    private GameController gameController;


    @Test
    public void playerNameTest() {

        PlayerGame playerGame = new PlayerGame(1);

        when(gameRepositoryClass.getGame(10l, 1))
                .thenReturn(playerGame);

        when(playerGameRepository.save(any()))
                .thenReturn(playerGame);

        gameController.playerName(10, 1, new PlayerNameDto("Alex"));

    }

}
