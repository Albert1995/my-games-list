package com.mygameslist.api.repository;

import com.mygameslist.api.models.Game;

import org.springframework.stereotype.Repository;

public interface GameRepository {

    /**
     * Save a new game in repository
     * @param game
     */
    public void save(Game game);
    
}
