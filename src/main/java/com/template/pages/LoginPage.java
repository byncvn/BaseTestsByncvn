package com.template.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    // Locators
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(id = "dashboard") // Añadir locator del dashboard
    private WebElement dashboardElement;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Métodos de la página
    public void login(String username, String password) {
        webUtils.sendKeys(usernameField, username);
        webUtils.sendKeys(passwordField, password);
        webUtils.click(loginButton);
    }

    // Método para verificar si el dashboard está visible
    public boolean isDashboardDisplayed() {
        return webUtils.isDisplayed(dashboardElement);
    }
}