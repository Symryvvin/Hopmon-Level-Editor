package ru.aizen.app.config;

import java.io.IOException;

public class AppConfig {
    private static final String GAME_PATH = "game.path";

    private static Configurator configurator;

    public static void config() throws IOException {
        configurator = new Configurator();
        configurator.load("/config.properties");
    }

    public static String getGamePath() {
        return configurator.getProperty(GAME_PATH);
    }
}
