package com.mygameslist.api.controllers;

import com.mygameslist.api.models.Game;
import com.mygameslist.api.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GamesController {

    @Autowired
    GameService service;
    
    @PostMapping("")
    public @ResponseBody Game create(@RequestBody Game game) {
        service.create(game);
        return game;
    }

}
