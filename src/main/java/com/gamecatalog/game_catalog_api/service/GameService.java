package com.gamecatalog.game_catalog_api.service;

import com.gamecatalog.game_catalog_api.model.Game;
import com.gamecatalog.game_catalog_api.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    public List<Game> findAll() {
        return repository.findAll();
    }

    public Game save(Game game) {
        return repository.save(game);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
