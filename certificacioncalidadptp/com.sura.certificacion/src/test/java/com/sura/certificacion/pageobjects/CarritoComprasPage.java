package com.sura.certificacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarritoComprasPage extends PageObject {

	// Etiqueta Your Cart
	@FindBy(css = ".subheader")
	private WebElementFacade lblYourCart;

	// Boton CheckOut
	@FindBy(css = ".checkout_button")
	private WebElementFacade btnCheckOut;

	public void vericarPaginaCart() {
		String strYourCart = "Your Cart";
		assertThat(lblYourCart.getTextValue(), containsString(strYourCart));
	}

	public void clicBtnCheckOut() {
		btnCheckOut.click();
	}

}
