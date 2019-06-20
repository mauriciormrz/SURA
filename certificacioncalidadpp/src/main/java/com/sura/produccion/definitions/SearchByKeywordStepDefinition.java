package com.sura.produccion.definitions;

import com.sura.produccion.steps.BuyerStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class SearchByKeywordStepDefinition {
  @Steps BuyerStep buyer;

  @Dado("I want to buy (.*)")
  public void buyerWantsToBuy(String article) {
    buyer.opens_etsy_home_page();
  }

  @Cuando("I search for items containing '(.*)'")
  public void searchByKeyword(String keyword) {
    buyer.searches_for_items_containing(keyword);
  }

  @Entonces("I should see all items that include to '(.*)' into name product")
  public void resultsForACategoryAndKeywordInARegion(String keyWord) {
    buyer.should_see_items_related_to(keyWord);
  }
}
