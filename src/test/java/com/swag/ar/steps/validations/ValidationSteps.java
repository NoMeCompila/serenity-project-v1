package com.swag.ar.steps.validations;

import com.swag.ar.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationSteps extends ValidationPage {

    @Step("Validar que el título sea visible")
    public Boolean titleIsVisible(){
        return titulo_productos.isDisplayed();
    }

    @Step("validar usuario erroneo")
    public Boolean errorMesage(){
        return msg_error.isDisplayed();
    }
}
