package com.mygameslist.api.repository;

import static org.mockito.Mockito.verify;

import com.mygameslist.api.models.Game;
import com.mygameslist.api.repository.impl.GameMongoRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.mongodb.core.MongoTemplate;

@ExtendWith(MockitoExtension.class)
public class GameMongoRepositoryTest {

    @Mock
    MongoTemplate template;

    @InjectMocks
    GameMongoRepository repositoryUnderTest;

    @Test
    public void saveGame() {
        Game game = Game.builder().build();
        repositoryUnderTest.save(game);
        verify(template).save(game);
    }
    
}
