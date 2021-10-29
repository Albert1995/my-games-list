package com.mygameslist.api.repository.impl;

import com.mongodb.client.MongoClient;
import com.mygameslist.api.models.Game;
import com.mygameslist.api.repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GameMongoRepository implements GameRepository {

    @Autowired
    MongoTemplate template;

    @Override
    public void save(Game game) {
        template.save(game);
    }

}
