package org.example.stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;


public class shoppingStepDefs {

    addtocartPage add = new addtocartPage();
    HomePage home = new HomePage();
    loginPage login = new loginPage();
    productPage product = new productPage();

    @Given("user can  signin")
    public void signin()
    {
        login.userName().sendKeys("j2ee");
        login.password().sendKeys("j2ee");
        login.login_button().click();
    }
    @When("user select a category")
    public void choose_category(){
        home.category().click();
    }
    @And("user select a product")
    public void choose_product(){
       product.shark().click();
       product.addtocart_button().click();
    }
    @Then("user can change amount of products")
    public void change_quantity(){
        add.quantity_input().sendKeys("2");
        add.update_button().click();
    }

}
