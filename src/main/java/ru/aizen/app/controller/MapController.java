package ru.aizen.app.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class MapController {
    private static final int MAX_TILES = 55;
    private static final double TILE_SIZE = 15.0;
    private static final double SPACE = 1.0;

    @FXML private Pane map;

    public void initialize(){
        double size = MAX_TILES * (TILE_SIZE + SPACE) - SPACE * 2;
        map.setPrefSize(size, size);
    }
}
