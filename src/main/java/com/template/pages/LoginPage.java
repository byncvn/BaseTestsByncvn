package com.template.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.template.utils.WebUtils;

public class LoginPage {
    private final WebUtils webUtils;

    // Locators
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.webUtils = new WebUtils(driver);
    }

    public void login(String username, String password) {
        webUtils.sendKeys(usernameField, username);
        webUtils.sendKeys(passwordField, password);
        webUtils.click(loginButton);
    }
}