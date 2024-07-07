package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class categoryPage {

    public WebElement select_fish()
    {
        return Hooks.driver.findElement(By.xpath("//h2[.=\"Fish\"]"));
    }
    public WebElement select_dog()
    {
        return Hooks.driver.findElement(By.xpath("//h2[.=\"Dogs\"]"));
    }
}
