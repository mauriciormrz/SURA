package com.sura.certificacion.steps;

import java.util.List;

import com.sura.certificacion.pageobjects.CarritoComprasPage;
import com.sura.certificacion.pageobjects.InventarioItemPage;
import com.sura.certificacion.pageobjects.InventarioPage;

import net.thucydides.core.annotations.Step;

public class InventarioProductosSteps {

	InventarioPage inventarioPage;
	InventarioItemPage inventarioItemPage;
	CarritoComprasPage carritoComprasPage;

	@Step
	public void seleccionar_productos(List<List<String>> data, int i) {

		int cantidadItems = Integer.parseInt(data.get(i).get(0));
		int itemRemover = cantidadItems;

		for (int j = 1; j <= cantidadItems; j++) {

			// a. Hacer clic en el link del nombre del producto.
			inventarioPage.clicProducto(data.get(i).get(j).trim());
			System.out.println(
					"  a." + j + " Hacer clic en el link del nombre del producto: " + data.get(i).get(j).trim());

			// b. Hacer clic en el botón ADD TO CART.
			inventarioItemPage.clicBtnAddRemoveToCart();
			System.out.println("  b." + j + " Hacer clic en el botón ADD TO CART.");

			// c. Hacer clic en el botón BACK.
			inventarioItemPage.clicBtnBack();
			System.out.println("  c." + j + " Hacer clic en el botón BACK.");
		}

		// d. Verificar el número de ítems en el carrito de compras.
		inventarioPage.verificarCantidadItemsCarrito(cantidadItems);
		System.out.println("  d. Verificar el número de ítems en el carrito de compras.");

		// e. Remover un item del carrito de compras
		inventarioPage.clicProducto(data.get(i).get(itemRemover).trim());
		inventarioItemPage.clicBtnAddRemoveToCart();
		inventarioItemPage.clicBtnBack();
		System.out.println("  e. Remover un item del carrito de compras: " + data.get(i).get(itemRemover).trim());

		// f. Verificar el número de ítems en el carrito de compras.
		inventarioPage.verificarCantidadItemsCarrito(cantidadItems - 1);
		System.out.println("  f. Verificar el número de ítems en el carrito de compras.");

		// g. Hacer clic en el carrito de compras.
		inventarioPage.clicIcnCarrito();
		System.out.println("  g. Hacer clic en el carrito de compras.");

		// h. Verificar ingreso en el carrito de compras.
		carritoComprasPage.vericarPaginaCart();
		System.out.println("  h. Verificar ingreso en el carrito de compras.");
	}
}
