package ru.aizen.app.control;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ru.aizen.model.map.Position;
import ru.aizen.model.map.Tile;

public class TileControl extends ImageView {
    private Tile tile;
    private static final Image INITIAL_IMAGE = new Image("/empty.png");

    public TileControl(int x, int y) {
        tile = Tile.empty(new Position(x, y));
        setImage(INITIAL_IMAGE);
        setOnMouseEntered(event -> System.out.println(tile));
    }

    public void insertTile() {

    }

    public void clearTile() {

    }
}
