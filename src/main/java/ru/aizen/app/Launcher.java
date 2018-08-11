package ru.aizen.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage) throws Exception {
        Injector injector = Guice.createInjector(new DepInjectionModule());
        Parent view = FXMLLoader.load(
                getClass().getResource("/fxml/main.fxml"),
                null,
                new JavaFXBuilderFactory(),
                injector::getInstance);
        primaryStage.setScene(new Scene(view));
        primaryStage.show();
    }
}
