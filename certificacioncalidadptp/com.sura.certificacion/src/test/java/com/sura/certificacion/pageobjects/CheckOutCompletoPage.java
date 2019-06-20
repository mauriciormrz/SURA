package com.sura.certificacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckOutCompletoPage extends PageObject {

	// Mensaje Your order has been dispatched, and will arrive just as fast as the
	// pony can get there!
	@FindBy(css = ".complete-text")
	private WebElementFacade txtOrdenDespachada;

	public void vericarPaginaCheckOutCompleto() {
		String strOrdenDespachada = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		assertThat(txtOrdenDespachada.getTextValue(), containsString(strOrdenDespachada));
	}
}
