package com.valtech.amel.service;

import com.valtech.amel.controller.GameController;
import com.valtech.amel.controller.GameNotInitialized;
import com.valtech.amel.controller.PlayerNotFound;
import com.valtech.amel.model.Game;
import com.valtech.amel.model.PlayerGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GameRepositoryClass {

    private final GameRepository gameRepository;
    private final PlayerGameRepository playerGameRepository;

    static final Logger logger = LoggerFactory.getLogger(GameController.class);

    public GameRepositoryClass(GameRepository gameRepository,
            PlayerGameRepository playerGameRepository) {
        this.gameRepository = gameRepository;
        this.playerGameRepository = playerGameRepository;
    }
    //private Map<String, Map<String, PlayerGame>> games = new HashMap<>();

    public PlayerGame getGame(long gameId, long playerId) {
        Game game = gameRepository
                .findById(gameId)
                .orElseThrow(GameNotInitialized::new);
        PlayerGame playerGame = playerGameRepository
                .findByGameAndBAndId(game, playerId)
                .orElseThrow(PlayerNotFound::new);
        return playerGame;
    }

    public Long createGame() {
        Game game = gameRepository.save(new Game());
        logger.info("Game with id {} started, {} total games", game.getId(), gameRepository.count());
        return game.getId();
    }

    public long createPlayerGame(long gameId) {
        Game game = gameRepository.findById(gameId).orElseThrow(GameNotInitialized::new);
        PlayerGame playerGame = new PlayerGame();
        playerGame.setGame(game);
        PlayerGame playerGame1 = playerGameRepository.save(playerGame);
        return playerGame1.getId();
    }

}
