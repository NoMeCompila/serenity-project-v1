package com.swag.ar.definitions;

import com.swag.ar.steps.login.LoginSteps;
import com.swag.ar.steps.validations.ValidationSteps;
import com.swag.ar.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginSteps login;

    @Steps(shared = true)
    ValidationSteps validate;

    @Given("^el usuario navega al sitio web$")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/");
    }

    @When("^ingresa (.*) y (.*)$")
    public void userLoginWithValidCred(String user, String password){
        login.typeUser(user);
        login.typePassword(password);
        login.clickLogin();
    }

    @Then("^la app muestra el homepage$")
    public void invalidateLogin(){
        //Assert.assertTrue(validate.titleIsVisible());
        System.out.println(validate.getTitle());
    }

    /*
    @When("ingresa credenciales incorrectas")
    public void userLoginWithInvalidCred(){
        login.typeUser("standard_user");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("la app muestra un mensaje de error")
    public void validateLogin(){
        Assert.assertTrue(validate.errorMesage());
    }

     */
}
