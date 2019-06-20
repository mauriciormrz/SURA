package com.sura.produccion.pages;

import java.util.List;
import java.util.stream.Collectors;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends PageObject {

  @FindBy(xpath = "//h2[contains(text(),'Wool')]")
  List<WebElement> listingCards;

  @FindBy(xpath = "//span[@class='wt-radio__label'][contains(text(),'Colombia')]")
  private WebElementFacade place;

  public void selectPlace() {
    if (!place.isSelected()) {
      place.click();
    }
  }

  public List<String> getResultTitles() {
    return listingCards.stream().map(element -> element.getText()).collect(Collectors.toList());
  }

  public void selectProduct(String keywordToFind) {
    List<String> lstProductTitle =
        listingCards.stream().map(element -> element.getText()).collect(Collectors.toList());
    for (String title : lstProductTitle) {
      MatcherAssert.assertThat(
          "The [" + title + "] product do not include the value: [" + keywordToFind + "]",
          title.toLowerCase().contains(keywordToFind.toLowerCase()));
    }
  }
}
