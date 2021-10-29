package com.mygameslist.api.models;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import com.mygameslist.api.types.GameType;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a game
 */
@Builder
@Getter
@Setter
@EqualsAndHashCode
@Document(collection = "games")
public class Game {

    @Id
    private UUID id;

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
