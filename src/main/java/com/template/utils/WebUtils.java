package com.template.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Duration;

public class WebUtils {
    private static final Logger logger = LoggerFactory.getLogger(WebUtils.class);
    private final WebDriver driver;
    private final WebDriverWait wait;

    public WebUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        logger.debug("WebUtils initialized");
    }

    public void click(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            logger.debug("Clicked element: {}", element);
        } catch (TimeoutException e) {
            logger.error("Error clicking element: Element not clickable - {}", element);
            throw e;
        }
    }

    public void sendKeys(WebElement element, String text) {
        try {
            WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
            visibleElement.clear();
            visibleElement.sendKeys(text);
            logger.debug("Entered text '{}' in element: {}", text, element);
        } catch (TimeoutException e) {
            logger.error("Error entering text: Element not visible - {}", element);
            throw e;
        }
    }

    public boolean isDisplayed(WebElement element) {
        try {
            boolean displayed = wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
            logger.debug("Element visibility: {} - {}", element, displayed);
            return displayed;
        } catch (TimeoutException e) {
            logger.warn("Element not visible: {}", element);
            return false;
        }
    }
}