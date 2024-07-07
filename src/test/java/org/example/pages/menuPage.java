package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class menuPage {

    public WebElement signin()
    {
        return Hooks.driver.findElement(By.linkText("Sign In"));
    }
    public WebElement signout()
    {
        return Hooks.driver.findElement(By.linkText("Sign Out"));
    }
    public WebElement cart_button()
    {
        return Hooks.driver.findElement(By.name("img_cart"));
    }
    public WebElement fish_button()
    {
        return Hooks.driver.findElement(By.xpath("//img[contains(@src, 'fish.gif')]"));
    }
    public WebElement search_input()
    {
        return Hooks.driver.findElement(By.name("keywords"));
    }
    public WebElement search_button()
    {
        return Hooks.driver.findElement(By.id("searchProducts"));
    }
    public WebElement account_link()
    {
        return Hooks.driver.findElement(By.linkText("My Account"));
    }

}
