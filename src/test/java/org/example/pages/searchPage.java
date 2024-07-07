package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class searchPage {
    public WebElement search_table()
    {
        return Hooks.driver.findElement(By.xpath("//table"));
    }
}
