package ru.aizen.model.map;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private String name;
    private Integer number;
    private Integer size;
    private List<Tile> tiles;

    public Level(String name, Integer size) {
        this.name = name;
        this.size = size;
        this.tiles = new ArrayList<>();
    }
}
