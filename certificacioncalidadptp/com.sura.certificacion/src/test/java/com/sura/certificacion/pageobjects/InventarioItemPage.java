package com.sura.certificacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InventarioItemPage extends PageObject {

	// Boton Back
	@FindBy(css = ".inventory_details_back_button")
	private WebElementFacade btnBack;

	// Boton AddRemoveToCart
	@FindBy(css = ".btn_inventory")
	private WebElementFacade btnAddRemoveToCart;

	public void clicBtnBack() {
		btnBack.click();
	}

	public void clicBtnAddRemoveToCart() {
		btnAddRemoveToCart.click();
	}
}
