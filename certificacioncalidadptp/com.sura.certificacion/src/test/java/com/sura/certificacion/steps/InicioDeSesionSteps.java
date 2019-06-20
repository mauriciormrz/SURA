package com.sura.certificacion.steps;

import java.util.List;
import com.sura.certificacion.pageobjects.InicioDeSesionPage;
import com.sura.certificacion.pageobjects.InventarioPage;

import net.thucydides.core.annotations.Step;

public class InicioDeSesionSteps {

	InicioDeSesionPage inicioDeSesionPage;
	InventarioPage inventoryPage;

	@Step
	public void realizar_inicio_de_sesion_en_la_pagina_web(List<List<String>> data, int i) {
		                                           
		// a. Abrir la url.
		inicioDeSesionPage.open();
		System.out.println("  a.Abrir la url.");
		
		// b. Ingresar username.
		inicioDeSesionPage.ingresarUsername(data.get(i).get(0).trim());
		System.out.println("  b. Ingresar username.");
		
		// c. Ingresar password.
		inicioDeSesionPage.ingresarPassword(data.get(i).get(1).trim());
		System.out.println("  c. Ingresar password.");
		
		// d. Hacer clic en el botón login.
		inicioDeSesionPage.clicBtnLogin();
		System.out.println("  d. Hacer clic en el botón login.");
		
		// e. Verificar ingreso a la plataforma.
		inventoryPage.vericarPaginaInventory();
		System.out.println("  e. Verificar ingreso a la plataforma.");
	}
}
