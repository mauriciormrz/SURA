package com.sura.produccion.steps;

import static net.serenitybdd.core.pages.PageObject.withParameters;

import com.sura.produccion.pages.HomePage;
import com.sura.produccion.pages.SearchResultsPage;
import com.sura.produccion.utils.AmbientesUtil;
import java.util.List;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

public class BuyerStep {

  HomePage homePage;
  SearchResultsPage searchResultsPage;

  @Step
  public void opens_etsy_home_page() {
    AmbientesUtil ambienteUtils = new AmbientesUtil();
    homePage.open(ambienteUtils.getAmbiente(), withParameters(""));
  }

  @Step
  public void searches_for_items_containing(String keywords) {
    homePage.searchFor(keywords);
    homePage.clickSearchButton();
    searchResultsPage.selectPlace();
  }

  @Step
  public void should_see_items_related_to(String keywords) {
    List<String> resultTitles = searchResultsPage.getResultTitles();
    System.out.println("Titulos: " + resultTitles.size());
    MatcherAssert.assertThat("The list contains more elements than cero", resultTitles.size() > 0);
    searchResultsPage.selectProduct(keywords);
  }
}
