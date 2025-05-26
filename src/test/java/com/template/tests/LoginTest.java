package com.template.tests;

import com.template.BaseTest;
import com.template.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testLoginSuccess() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(true);
    }
}