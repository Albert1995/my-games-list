package com.mygameslist.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a category
 */
@Builder
@Getter
@Setter
public class Category {

    private long id;
    private String name;
    
}
