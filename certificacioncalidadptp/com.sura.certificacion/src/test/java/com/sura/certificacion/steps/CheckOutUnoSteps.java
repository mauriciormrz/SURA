package com.sura.certificacion.steps;

import java.util.List;

import com.sura.certificacion.pageobjects.CheckOutDosPage;
import com.sura.certificacion.pageobjects.CheckOutUnoPage;

import net.thucydides.core.annotations.Step;

public class CheckOutUnoSteps {

	CheckOutUnoPage checkOutUnoPage;
	CheckOutDosPage checkOutDosPage;

	@Step
	public void diligenciar_formulario(List<List<String>> data, int i) {

		// a. Ingresar Nombre.
		checkOutUnoPage.ingresarNombre(data.get(i).get(0).trim());
		System.out.println("  a. Ingresar Nombre.");

		// b. Ingresar Apellido.
		checkOutUnoPage.ingresarApellido(data.get(i).get(1).trim());
		System.out.println("  b. Ingresar Apellido.");

		// c. Ingresar Zona Postal.
		checkOutUnoPage.ingresarZonaPostal(data.get(i).get(2).trim());
		System.out.println("  c. Ingresar Codigo Postal.");

		// d. Hacer clic en el boton continue
		checkOutUnoPage.clicBtnContinue();
		System.out.println("  d. Hacer clic en el boton continue");

		// e. Verificar ingreso a la pagina checkout_step_two.
		checkOutDosPage.verificarPaginaCheckOutDos();
		System.out.println("  e. Verificar ingreso a la pagina checkout_step_two");
	}
}
