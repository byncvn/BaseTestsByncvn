package com.template.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(id = "dashboard")
    private WebElement dashboardElement;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        logger.info("Starting login with user: {}", username);
        webUtils.sendKeys(usernameField, username);
        webUtils.sendKeys(passwordField, password);
        webUtils.click(loginButton);
        logger.info("Login completed");
    }

    public boolean isDashboardDisplayed() {
        logger.debug("Checking dashboard visibility");
        return webUtils.isDisplayed(dashboardElement);
    }
}