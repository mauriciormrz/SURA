package com.sura.certificacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/index.html")
public class InicioDeSesionPage extends PageObject {

	// Campo username
	@FindBy(id = "user-name")
	private WebElementFacade txtUsername;
	
	//#gnav-search > div > div.search-button-wrapper.hide > button
	//button[@class='btn btn-primary']

	// Campo password
	@FindBy(id = "password")
	private WebElementFacade txtPassword;

	// Boton login
	@FindBy(css = ".btn_action")
	private WebElementFacade btnLogin;

	public void ingresarUsername(String strUsername) {
		txtUsername.clear();
		txtUsername.sendKeys(strUsername);
	}

	public void ingresarPassword(String strPassword) {
		txtPassword.clear();
		txtPassword.sendKeys(strPassword);
	}

	public void clicBtnLogin() {
		btnLogin.click();
	}
}
