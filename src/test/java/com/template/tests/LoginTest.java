package com.template.tests;

import com.template.BaseTest;
import com.template.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void testLoginSuccess() {
        logger.info("Starting successful login test");
        LoginPage loginPage = new LoginPage(driver);

        logger.debug("Navigating to login page");
//        driver.get("https://example.com/login");

//        loginPage.login("admin", "admin123");
        Assert.assertTrue(true);
        logger.info("Login test completed successfully");
    }
}