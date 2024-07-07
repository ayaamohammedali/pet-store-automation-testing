package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebElement category()
    {
        return Hooks.driver.findElement(By.xpath("//img[contains(@src, '" + "category" + "_icon.gif')]"));
    }
}
