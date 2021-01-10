package com.codecool.cucumberTest;

import com.codecool.cucumberTest.util.DriverSingleton;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static WebDriver driver;


    @BeforeAll
    public static void setupTest() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver = DriverSingleton.getInstance();
    }

    @AfterAll
    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

//    @Test
//    public void test() {
//        // Your test code here
//        driver.get("https://google.com");
//    }

}
