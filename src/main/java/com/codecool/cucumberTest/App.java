package com.codecool.cucumberTest;

import com.codecool.cucumberTest.util.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class App {
    public static void main(String[] args) {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = DriverSingleton.getInstance();

        driver.get("https://jira.codecool.codecanvas.hu/secure/Dashboard.jspa");

        driver.quit();

    }
}
