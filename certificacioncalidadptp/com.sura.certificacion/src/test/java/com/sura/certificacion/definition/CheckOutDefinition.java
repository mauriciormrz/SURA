package com.sura.certificacion.definition;

import java.util.List;

import com.sura.certificacion.steps.CarritoComprasSteps;
import com.sura.certificacion.steps.CheckOutCompletoSteps;
import com.sura.certificacion.steps.CheckOutDosSteps;
import com.sura.certificacion.steps.CheckOutUnoSteps;
import com.sura.certificacion.steps.InicioDeSesionSteps;
import com.sura.certificacion.steps.InventarioProductosSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckOutDefinition {

	@Steps
	InicioDeSesionSteps inicioDeSesionSteps;

	@Steps
	InventarioProductosSteps inventarioProductosSteps;

	@Steps
	CarritoComprasSteps carritoComprasSteps;

	@Steps
	CheckOutUnoSteps checkOutUnoSteps;

	@Steps
	CheckOutDosSteps checkOutDosSteps;

	@Steps
	CheckOutCompletoSteps checkOutCompletoSteps;

	@Given("^que ingreso a la URL con usuario  y contrasegna$")
	public void que_ingreso_a_la_URL_con_usuario_y_contrasegna(DataTable dtDatosFeture) {

		List<List<String>> data = dtDatosFeture.raw();
		for (int i = 0; i < data.size(); i++) {
			System.out.println("");
			System.out.println("1.Realizar inicio de sesion en la pagina web:");
			inicioDeSesionSteps.realizar_inicio_de_sesion_en_la_pagina_web(data, i);
		}
	}

	@When("^selecciono los productos$")
	public void selecciono_los_productos(DataTable dtDatosFeture) {

		List<List<String>> data = dtDatosFeture.raw();
		for (int i = 0; i < data.size(); i++) {
			System.out.println("");
			System.out.println("2.Seleccionar productos:");
			inventarioProductosSteps.seleccionar_productos(data, i);
		}
	}

	@When("^hago checkout en el carrito de compras$")
	public void hago_checkout_en_el_carrito_de_compras() {
		System.out.println("");
		System.out.println("3.Hacer checkout carrito de compras:");
		carritoComprasSteps.hacer_checkout_carrito_compras();
	}

	@When("^diligencio el formulario$")
	public void diligencio_el_formulario(DataTable dtDatosFeture) {

		List<List<String>> data = dtDatosFeture.raw();
		for (int i = 0; i < data.size(); i++) {
			System.out.println("");
			System.out.println("4. Diligencior el formulario");
			checkOutUnoSteps.diligenciar_formulario(data, i);
		}
	}

	@Then("^verifico la informacion del checkout$")
	public void verifico_la_informacion_del_checkout(DataTable dtDatosFeture) {

		List<List<String>> data = dtDatosFeture.raw();
		for (int i = 0; i < data.size(); i++) {
			System.out.println("");
			System.out.println("5. Verificar la informacion del checkout");
			checkOutDosSteps.verificar_informacion_checkout(data, i);
		}
	}
	
	@Then("^finalizo la compra$")
	public void finalizo_la_compra()  {
		System.out.println("");
		System.out.println("6. Finalizar compra");
		checkOutCompletoSteps.finalizar_compra();
	}
}
