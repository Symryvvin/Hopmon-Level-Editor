package ru.aizen.model;

import javafx.stage.FileChooser;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileChooserBuilder {
    private String title;
    private Path directory;
    private List<FileChooser.ExtensionFilter> filters;

    private FileChooserBuilder() {
    }

    public static FileChooserBuilder newInstance() {
        return new FileChooserBuilder();
    }

    public FileChooserBuilder title(String title) {
        this.title = title;
        return this;
    }


    public FileChooserBuilder directory(String directory) {
        this.directory = Paths.get(directory);
        return this;
    }

    public FileChooserBuilder filters(FileChooser.ExtensionFilter... filters) {
        this.filters = Arrays.stream(filters).collect(Collectors.toList());
        return this;
    }

    public FileChooser build() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle(title);
        chooser.getExtensionFilters().addAll(filters);
        chooser.setInitialDirectory(directory.toFile());
        return chooser;
    }
}