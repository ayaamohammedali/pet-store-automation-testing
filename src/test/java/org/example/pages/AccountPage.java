package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {

    public WebElement select_language()
    {
        return Hooks.driver.findElement(By.id("languagePreference"));
    }
    public WebElement select_fav_category()
    {
        return Hooks.driver.findElement(By.id("favouriteCategoryId"));
    }
    public WebElement select_list()
    {
        return Hooks.driver.findElement(By.id("listOption1"));
    }
    public WebElement select_banner()
    {
        return Hooks.driver.findElement(By.id("bannerOption1"));
    }


}
