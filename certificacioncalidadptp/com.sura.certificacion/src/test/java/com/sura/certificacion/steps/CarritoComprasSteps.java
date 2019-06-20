package com.sura.certificacion.steps;

import com.sura.certificacion.pageobjects.CarritoComprasPage;

import net.thucydides.core.annotations.Step;

public class CarritoComprasSteps {

	CarritoComprasPage carritoComprasPage;

	@Step
	public void hacer_checkout_carrito_compras() {

		// a. Hacer clic en el botón checkout.
		carritoComprasPage.clicBtnCheckOut();
		System.out.println("  a. Hacer clic en el botón checkout.");
	}
}
