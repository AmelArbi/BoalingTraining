package com.valtech.amel.service;

import java.util.Optional;
import com.valtech.amel.model.Game;
import com.valtech.amel.model.PlayerGame;
import org.springframework.data.repository.CrudRepository;

public interface PlayerGameRepository extends CrudRepository<PlayerGame, Long> {
    Optional<PlayerGame> findByGameAndById(Game game, long id);

}
