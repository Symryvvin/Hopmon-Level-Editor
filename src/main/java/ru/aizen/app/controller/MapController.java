package ru.aizen.app.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import ru.aizen.app.control.TileControl;

public class MapController {
    private static final int MAX_TILES = 35;
    private static final double SPACE = 0.5;
    private static final double TILE_ZISE = 26;

    @FXML private GridPane map;

    public void initialize() {
        map.setHgap(SPACE);
        map.setVgap(SPACE);
        map.getColumnConstraints().forEach(column -> column.setPrefWidth(TILE_ZISE));
        map.getRowConstraints().forEach(row -> row.setPrefHeight(TILE_ZISE));
        fillWithEmptyTiles(MAX_TILES);
    }

    public void fillWithEmptyTiles(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map.add(new TileControl(i + 1, j + 1), i, size - j);
            }
        }
    }
}
