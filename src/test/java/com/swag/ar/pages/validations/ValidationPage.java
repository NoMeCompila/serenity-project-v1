package com.swag.ar.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//span[@class='title']")
    protected WebElementFacade titulo_productos;

    @FindBy(tagName = "h3")
    protected WebElementFacade msg_error;
}
