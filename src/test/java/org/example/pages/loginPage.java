package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class loginPage {

    public WebElement userName()
    {
        return Hooks.driver.findElement(By.name("username"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.name("password"));
    }
    public WebElement login_button()
    {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"login\"]"));
    }
    public WebElement login_msg()
    {
        return Hooks.driver.findElement(By.xpath("//p[1]"));
    }
}
