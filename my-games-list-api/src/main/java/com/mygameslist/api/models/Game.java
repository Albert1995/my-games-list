package com.mygameslist.api.models;

import java.util.Date;
import java.util.Set;

import com.mygameslist.api.types.GameType;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a game
 */
@Builder
@Getter
@Setter
public class Game {

    private long id;
    private String name;
    private String author;
    private GameType type;
    private Date releaseDate;
    private int minimumPlayers;
    private int maximumPlayers;
    private int playtime;
    private int maturityRating;
    private Set<Category> category;
    
}
