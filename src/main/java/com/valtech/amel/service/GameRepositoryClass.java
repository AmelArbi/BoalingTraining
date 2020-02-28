package com.valtech.amel.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.valtech.amel.controller.GameController;
import com.valtech.amel.controller.GameNotInitialized;
import com.valtech.amel.controller.PlayerNotFound;
import com.valtech.amel.model.PlayerGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GameRepositoryClass {
    static final Logger logger = LoggerFactory.getLogger(GameController.class);
    private Map<String, Map<String, PlayerGame>> games = new HashMap<>();

    public PlayerGame getGame(String gameId, String playerId) {
        Map<String, PlayerGame> spielerGames = games.get(gameId);
        if (spielerGames == null) {
            logger.error("Game with id : {} not Initialized.",gameId);
            throw new GameNotInitialized();
        }
        PlayerGame game = spielerGames.get(playerId);
        if (game == null) {
            logger.error("Player not found.");
            throw new PlayerNotFound();
        }
        return game;
    }

    public String createGame(){
        Map<String, PlayerGame> playerGames = new HashMap<>();
        String gameId = UUID.randomUUID().toString();
        games.put(gameId,playerGames);
        logger.info("Game with id {} started, {} total games", gameId, games.size());
        return gameId;
    }

    public void addGame(String gameId, String playerId, PlayerGame game){
        games.get(gameId).put(playerId, game);
    }

    public String createPlayerGame(String gameId) {
        checkIfGameExist(gameId);
        PlayerGame game = new PlayerGame();
        String playerId = UUID.randomUUID().toString();
        addGame(gameId, playerId, game);
        return playerId;
    }

    private void checkIfGameExist(String gameId) {
        if (!games.containsKey(gameId)) {
            logger.error("game with id {} not exist ", gameId);
            throw new GameNotInitialized();
        }
    }


}
