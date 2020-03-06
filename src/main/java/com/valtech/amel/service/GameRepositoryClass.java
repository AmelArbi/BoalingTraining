package com.valtech.amel.service;

import com.valtech.amel.controller.GameNotInitialized;
import com.valtech.amel.controller.PlayerNotFound;
import com.valtech.amel.model.Game;
import com.valtech.amel.model.PlayerGame;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GameRepositoryClass {

    private GameRepository gameRepository;
    private PlayerGameRepository playerGameRepository;

    public GameRepositoryClass(GameRepository gameRepository,
            PlayerGameRepository playerGameRepository) {
        this.gameRepository = gameRepository;
        this.playerGameRepository = playerGameRepository;
    }

    public Long createGame() {
        Game game = gameRepository.save(new Game());
        log.info("Game with id {} started, {} total games", game.getId(), gameRepository.count());
        return game.getId();
    }

    public long createPlayerGame(long gameId) {
        Game game = gameRepository.findById(gameId).orElseThrow(GameNotInitialized::new);
        PlayerGame playerGame = new PlayerGame();
        playerGame.setGame(game);
        PlayerGame playerGame1 = playerGameRepository.save(playerGame);
        return playerGame1.getId();
    }

    public PlayerGame getGame(long gameId, long playerId) {
        Game game = gameRepository
                .findById(gameId)
                .orElseThrow(GameNotInitialized::new);
        PlayerGame playerGame = playerGameRepository
                .findByGameAndId(game, playerId)
                .orElseThrow(PlayerNotFound::new);
        return playerGame;
    }

}
