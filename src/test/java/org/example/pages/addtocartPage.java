package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class addtocartPage {
    public WebElement quantity_input()
    {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]"));
    }
    public WebElement shopping_cart()
    {
        return Hooks.driver.findElement(By.xpath("//h2[.=\"Shopping Cart\"]"));
    }
    public WebElement update_button()
    {
        return Hooks.driver.findElement(By.name("update"));
    }
    public WebElement price()
    {
        return Hooks.driver.findElement(By.xpath("//tr[2]/td[6]"));
    }
    public WebElement total_price()
    {
        return Hooks.driver.findElement(By.xpath("//tr[2]/td[7]"));
    }

}
