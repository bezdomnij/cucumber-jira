package com.codecool.cucumberTest.pages;

import com.codecool.cucumberTest.util.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver = DriverSingleton.getInstance();
    WebDriverWait wait = new WebDriverWait(driver, 6);

    public LoginPage() {
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver, 20), this);
    }

    @FindBy(id = "login-form-username")
    private WebElement username;

    @FindBy(id = "login-form-password")
    private WebElement password;

    @FindBy(id = "login")
    private WebElement loginButton;

    @FindBy(xpath="//img[starts-with(@alt, 'User profile')]")
    private WebElement userIcon;

    public void loginSuccessful() {
//        driver.get("https://jira.codecool.codecanvas.hu/secure/Dashboard.jspa");
        driver.manage().window().maximize();
        try {
            wait.until(ExpectedConditions.visibilityOf(username));
            username.sendKeys(System.getenv("USERNAME"));
            password.sendKeys(System.getenv("PASSWORD"));
            loginButton.click();
        } catch (Exception e ) {
            System.out.println("I'm in already");
        }

    }

}
