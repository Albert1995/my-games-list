package com.mygameslist.api.services;

import com.mygameslist.api.models.Game;

import org.springframework.stereotype.Service;

public interface GameService {

    /**
     * Validate the game and save
     * @param game
     */
    public void create(Game game);
    
}