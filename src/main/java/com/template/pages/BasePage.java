package com.template.pages;

import com.template.utils.WebUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    protected WebDriver driver;
    protected WebUtils webUtils;
    protected final Logger logger;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webUtils = new WebUtils(driver);
        this.logger = LoggerFactory.getLogger(getClass());
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        logger.info("Page initialized: {}", getClass().getSimpleName());
    }
}