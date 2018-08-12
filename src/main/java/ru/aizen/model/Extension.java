package ru.aizen.model;

import javafx.stage.FileChooser;

public enum Extension {
    JSON("Level data file", "*.json"),
    XML("Level graph file", "*.xml"),
    HML("Hopmon level", "*.hml"),
    HMP("Hopmon level pack", "*.hmp");

    private FileChooser.ExtensionFilter filter;

    Extension(String description, String extension) {
        this.filter = new FileChooser.ExtensionFilter(description, extension);
    }

    public FileChooser.ExtensionFilter getFilter() {
        return filter;
    }
}
