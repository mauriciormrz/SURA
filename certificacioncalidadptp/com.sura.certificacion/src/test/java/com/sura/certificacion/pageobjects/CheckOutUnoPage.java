package com.sura.certificacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckOutUnoPage extends PageObject {

	// Campo First Name
	@FindBy(id = "first-name")
	private WebElementFacade txtNombre;

	// Campo Last Name
	@FindBy(id = "last-name")
	private WebElementFacade txtApellido;

	// Campo Zip/Postal Code
	@FindBy(id = "postal-code")
	private WebElementFacade txtCodigoPostal;

	// Boton continue
	@FindBy(css = ".cart_button")
	private WebElementFacade btnContinue;

	public void ingresarNombre(String strNombre) {
		txtNombre.clear();
		txtNombre.sendKeys(strNombre);
	}

	public void ingresarApellido(String strApellido) {
		txtApellido.clear();
		txtApellido.sendKeys(strApellido);
	}

	public void ingresarZonaPostal(String strCodigoPostal) {
		txtCodigoPostal.clear();
		txtCodigoPostal.sendKeys(strCodigoPostal);
	}

	public void clicBtnContinue() {
		btnContinue.click();
	}
}
