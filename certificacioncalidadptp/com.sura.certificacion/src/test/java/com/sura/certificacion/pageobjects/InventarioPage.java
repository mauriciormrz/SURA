package com.sura.certificacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;;

public class InventarioPage extends PageObject {

	// Etiqueta Products
	@FindBy(css = ".product_label")
	private WebElementFacade lblProducts;

	// Cantidad de items carrito de compras
	@FindBy(css = ".shopping_cart_badge")
	private WebElementFacade txtCantidadItemsCarrito;

	// Icono carrito de compras
	@FindBy(css = "#shopping_cart_container > a > svg")
	private WebElementFacade icnCarrito;

	public void vericarPaginaInventory() {
		String strInventary = "Products";
		assertThat(lblProducts.getTextValue(), containsString(strInventary));
	}

	public void clicProducto(String strProducto) {
		getDriver().findElement(By.xpath("//div[contains(text(),'" + strProducto + "')]")).click();
	}

	public void verificarCantidadItemsCarrito(int cantidadItems) {
		assertEquals(Integer.parseInt(txtCantidadItemsCarrito.getTextValue()), cantidadItems);
	}

	public void clicIcnCarrito() {
		icnCarrito.click();
	}
}
