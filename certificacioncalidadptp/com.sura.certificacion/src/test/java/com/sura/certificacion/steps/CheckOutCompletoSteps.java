package com.sura.certificacion.steps;

import com.sura.certificacion.pageobjects.CheckOutCompletoPage;

import net.thucydides.core.annotations.Step;

public class CheckOutCompletoSteps {

	CheckOutCompletoPage checkOutCompletoPage;

	@Step
	public void finalizar_compra() {

		// a. Verificar el despacho
		checkOutCompletoPage.vericarPaginaCheckOutCompleto();
		System.out.println("  a. Verificar el despacho.");
	}
}
