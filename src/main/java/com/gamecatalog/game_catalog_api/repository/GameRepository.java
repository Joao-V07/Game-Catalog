package com.gamecatalog.game_catalog_api.repository;

import com.gamecatalog.game_catalog_api.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
