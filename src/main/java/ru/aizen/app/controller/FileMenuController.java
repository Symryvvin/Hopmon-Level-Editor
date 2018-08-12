package ru.aizen.app.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import ru.aizen.app.config.AppConfig;
import ru.aizen.model.Extension;
import ru.aizen.model.FileChooserBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileMenuController {
    private static final String WORK_FOLDER = ".";
    private static final String LEVEL_FOLDER = AppConfig.getGamePath() + "/Data/Levels";
    private static final String LEVEL_PACK_FOLDER = LEVEL_FOLDER + "/Packs";
    private FileChooser workFileChooser;
    private FileChooser hmlFileChooser;
    private FileChooser hmpFileChooser;
    private Stage openStage;

    public void initialize() {
        workFileChooser = FileChooserBuilder.newInstance()
                .title("Level Work Files")
                .directory(WORK_FOLDER)
                .filters(Extension.JSON.getFilter(), Extension.XML.getFilter())
                .build();
        hmlFileChooser = FileChooserBuilder.newInstance()
                .title("Hopmon Level")
                .directory(LEVEL_FOLDER)
                .filters(Extension.HML.getFilter())
                .build();
        hmpFileChooser = FileChooserBuilder.newInstance()
                .title("Hopmon Level Pack")
                .directory(LEVEL_PACK_FOLDER)
                .filters(Extension.HMP.getFilter())
                .build();
        openStage = new Stage();
    }

    @FXML
    private void onClickNew() {
    }

    @FXML
    private void onClickOpen() {
        File file = workFileChooser.showOpenDialog(openStage);
        if (file != null) {
            //TODO perform open file
        }
    }

    @FXML
    private void onClickSave() {
        //TODO save both files with exist name
    }

    @FXML
    private void onClickSaveAs() throws IOException {
        File file = workFileChooser.showSaveDialog(openStage);
        if (file != null) {
            // save dummy file
            Files.write(file.toPath(), new byte[]{00, 00});
        }
    }

    @FXML
    private void onClickImportHml() {
        File file = hmlFileChooser.showOpenDialog(openStage);
        if (file != null) {
            //TODO perform open file
        }
    }

    @FXML
    private void onClickImportHmp() {
        File file = hmpFileChooser.showSaveDialog(openStage);
        if (file != null) {
            //TODO perform open file
        }
    }

    @FXML
    private void onClickExportHml() {
        File file = hmlFileChooser.showOpenDialog(openStage);
        if (file != null) {
            //TODO perform open file
        }
    }

    @FXML
    private void onClickExportHmp() {
        File file = hmpFileChooser.showSaveDialog(openStage);
        if (file != null) {
            //TODO perform open file
        }
    }

    @FXML
    private void onClickQuit() {
        Platform.exit();
    }
}
