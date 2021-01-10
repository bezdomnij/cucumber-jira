package com.codecool.cucumberTest.pages;

import com.codecool.cucumberTest.util.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewProfilePage {
    WebDriver driver = DriverSingleton.getInstance();

    public ViewProfilePage() {
        PageFactory.initElements(driver, this);
        driver.navigate().to("https://jira.codecool.codecanvas.hu/secure/ViewProfile.jspa");
    }

    @FindBy(id = "up-user-title-name")
    private WebElement userNameTitle;

    public String getUserNameTitle() {
        return userNameTitle.getText();
    }
}
