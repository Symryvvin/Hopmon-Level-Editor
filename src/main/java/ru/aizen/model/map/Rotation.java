package ru.aizen.model.map;

public enum Rotation {
    EAST(0),
    WEST(180),
    NORTH(90),
    SOUTH(270);

    private int degree;

    Rotation(int degree) {
        this.degree = degree;
    }

    public int getDegree() {
        return degree;
    }
}
