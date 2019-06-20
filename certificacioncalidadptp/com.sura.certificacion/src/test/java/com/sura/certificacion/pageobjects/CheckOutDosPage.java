package com.sura.certificacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertTrue;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

public class CheckOutDosPage extends PageObject {

	// Etiqueta Checkout: Overview
	@FindBy(css = ".subheader")
	private WebElementFacade lblCheckOutOverview;

	// Boton finish
	@FindBy(css = ".cart_button")
	private WebElementFacade btnFinish;

	public void verificarPaginaCheckOutDos() {
		String strCheckOutOverview = "Checkout: Overview";
		assertThat(lblCheckOutOverview.getTextValue(), containsString(strCheckOutOverview));
	}

	public void buscarItem(String strItem) {
		assertTrue(getDriver().findElements(By.xpath("//div[contains(text(),'" + strItem + "')]")).size() != 0);
	}

	public void clicBtnFinish() {
		btnFinish.click();
	}
}
