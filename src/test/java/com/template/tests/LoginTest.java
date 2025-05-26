package com.template.tests;

import com.template.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    // Locators
    private static final By USERNAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BUTTON = By.cssSelector("button[type='submit']");

    @Test
    public void testLoginSuccess() {
        driver.get("https://google.com");
    }
}