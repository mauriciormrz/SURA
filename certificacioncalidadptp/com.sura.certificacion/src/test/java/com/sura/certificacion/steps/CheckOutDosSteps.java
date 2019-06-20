package com.sura.certificacion.steps;

import java.util.List;

import com.sura.certificacion.pageobjects.CheckOutDosPage;
import net.thucydides.core.annotations.Step;

public class CheckOutDosSteps {

	CheckOutDosPage checkOutDosPage;

	@Step
	public void verificar_informacion_checkout(List<List<String>> data, int i) {

		int offSet = 2;
		int cantidadItems = Integer.parseInt(data.get(i).get(offSet));

		// a. Verificar items.
		for (int j = 1; j < cantidadItems; j++) {
			
			checkOutDosPage.buscarItem(data.get(i).get(j + offSet).trim());
			System.out.println("  a." + j + " Verificar items: " + data.get(i).get(j + offSet).trim());
		}
		
		// b. Hacer clic botón finish.
		checkOutDosPage.clicBtnFinish();
		System.out.println("  b. Hacer clic botón finish.");
	}
}
