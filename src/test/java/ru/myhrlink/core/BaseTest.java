package ru.myhrlink.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;


public abstract class BaseTest {

    protected WebDriver driver;
    protected ConfigManager config;

    @BeforeEach
    public void setUp() {
        config = ConfigManager.getInstance();
        driver = DriverManager.getDriver();
        driver.get(config.getBaseUrl());
    }

    @AfterEach
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
