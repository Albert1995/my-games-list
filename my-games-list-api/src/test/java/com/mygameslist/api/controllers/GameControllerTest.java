package com.mygameslist.api.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mygameslist.api.models.Game;
import com.mygameslist.api.services.GameService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GameControllerTest {

    @Mock
    GameService service;

    @InjectMocks
    GamesController controllerUnderTest;

    @Test
    public void callCreateGameEndpoint() {
        Game gameExpected = Game.builder().build();
        Game gameActual = controllerUnderTest.create(gameExpected);
        assertEquals(gameExpected, gameActual);
    }
    
}
