package com.valtech.amel.service;

import com.valtech.amel.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {

}
