package com.codecool.cucumberTest.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSingleton {
    public static WebDriver instance = null;

    private DriverSingleton() { }

    public static WebDriver getInstance(){
        if (instance == null){
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            instance = new ChromeDriver(chromeOptions);
            instance.get("https://jira.codecool.codecanvas.hu/secure/Dashboard.jspa");
        }
        return instance;
    }
}
