package com.gamecatalog.game_catalog_api.controller;

import com.gamecatalog.game_catalog_api.model.Game;
import com.gamecatalog.game_catalog_api.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Games")
public class GameController {
    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping
    public List<Game> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Game create(@RequestBody Game game) {
        return service.save(game);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Game gameDetails) {
        service.update(id, gameDetails);
    }
}
