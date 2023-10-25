package com.swag.ar.steps.login;

import com.swag.ar.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUser(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("click en boton login")
    public void clickLogin(){
        btn_login.click();
    }

}
