package com.fueltracker.pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class PageBase {
    public static SHAFT.GUI.WebDriver driver;

    public PageBase(SHAFT.GUI.WebDriver driver) {
        PageBase.driver = driver;
    }

    @Step("Click On Element")
    protected void clickElement(By element) {
        driver.getDriver().findElement(element).click();
    }

    @Step("Send The Text")
    protected void sendText(By element, String text) {
        driver.getDriver().findElement(element).click();
        driver.getDriver().findElement(element).clear();
        driver.getDriver().findElement(element).sendKeys(text);
    }
}