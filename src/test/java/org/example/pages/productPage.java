package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class productPage {
    public WebElement addtocart_button()
    {
        return Hooks.driver.findElement(By.xpath("\"//tr[2]/td[5]/a\""));
    }
    public WebElement shark()
    {
        return Hooks.driver.findElement(By.xpath("//h2[.=\"Tiger Shark\"]"));
    }
}
