package com.mygameslist.api.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;

import com.mygameslist.api.models.Game;
import com.mygameslist.api.repository.GameRepository;
import com.mygameslist.api.services.impl.GameServiceImpl;
import com.mygameslist.api.types.GameType;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GameServiceImplTest {

    @Mock
    GameRepository repository;

    @InjectMocks
    GameServiceImpl serviceUnderTest;

    @Test
    public void createGame() throws Exception {
        Game game = Game.builder()
            .name("Super game")
            .author("Author of the game")
            .type(GameType.BOARDGAME)
            .maximumPlayers(5)
            .minimumPlayers(2)
            .maturityRating(10)
            .releaseDate(DateUtils.parseDate("01/01/2021", "dd/MM/yyyy"))
            .playtime(10)
            .build();

        serviceUnderTest.create(game);

        assertNotNull(game.getId(), "A new game needs a new ID");
        verify(repository).save(game);
    }
    
}
