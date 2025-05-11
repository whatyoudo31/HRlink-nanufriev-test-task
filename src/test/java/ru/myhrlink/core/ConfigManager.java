package ru.myhrlink.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    private static final Properties properties = new Properties();
    private static ConfigManager instance;

    private ConfigManager() {
        try {
            properties.load(new FileInputStream("src/test/resources/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public String getBaseUrl() {
        return getProperty("base.url");
    }

    public String getDefaultUsername() {
        return getProperty("default.username");
    }

    public String getDefaultPassword() {
        return getProperty("default.password");
    }

    public int getImplicitWait() {
        return Integer.parseInt(getProperty("implicit.wait"));
    }

    public int getPageLoadTimeout() {
        return Integer.parseInt(getProperty("page.load.timeout"));
    }
}