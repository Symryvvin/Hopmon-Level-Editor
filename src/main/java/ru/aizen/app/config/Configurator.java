package ru.aizen.app.config;

import java.io.IOException;
import java.util.Properties;

public final class Configurator {
    private Properties properties;

    public Configurator() {
        this.properties = new Properties();
    }

    public void load(String path) throws IOException {
        properties.load(Configurator.class.getResourceAsStream(path));
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }
}
