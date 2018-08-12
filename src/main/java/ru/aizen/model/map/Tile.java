package ru.aizen.model.map;

public class Tile {
    private String name;
    private Position position;
    private Rotation rotation;
    private World world;

    public Tile(String name, Position position, Rotation rotation) {
        this.name = name;
        this.position = position;
        this.rotation = rotation;
    }
}
