package com.mygameslist.api.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.mygameslist.api.models.Game;
import com.mygameslist.api.repository.GameRepository;
import com.mygameslist.api.services.GameService;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameRepository repository;

    private void validate(Game game) {
        List<String> errors = new ArrayList<>();
        
        if (StringUtils.isBlank(game.getName())) {
            errors.add("Name is required");
        }

        if (CollectionUtils.isNotEmpty(errors)) {
            throw new RuntimeException("Game is invalid");
        }
    }

    @Override
    public void create(Game game) {
        validate(game);
        game.setId(UUID.randomUUID());
        repository.save(game);
    }
    
}
