package com.template.pages;

import com.template.utils.WebUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePage {
    protected WebDriver driver;
    protected WebUtils webUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webUtils = new WebUtils(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }
}