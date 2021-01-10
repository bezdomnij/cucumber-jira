package com.codecool.cucumberTest;

import com.codecool.cucumberTest.pages.LoginPage;
import com.codecool.cucumberTest.util.DriverSingleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class StepDefinitions {
    WebDriver driver = DriverSingleton.getInstance();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    private final LoginPage loginPage = new LoginPage();

    public StepDefinitions() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 4), this);
    }

    @Given("I have login credentials and open jira")
    public void open_jira() {
        driver.get("https://jira.codecool.codecanvas.hu/secure/Dashboard.jspa");
    }


    @When("I give username and password")
    public void login_with_username_password() {
        loginPage.loginSuccessful();
    }


    @Then("I should be logged in, no problemo")
    public void i_log_in() {
//        WebElement userIcon = loginPage.getUserIcon();
//        wait.until(ExpectedConditions.visibilityOf(userIcon));
//        userIcon.click();
    }
}
