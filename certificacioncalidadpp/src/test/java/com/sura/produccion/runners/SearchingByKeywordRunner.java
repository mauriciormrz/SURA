package com.sura.produccion.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
  features = "src/test/resources/features/SearchingByKeyword.feature",
  glue = {"com.sura.produccion.definitions"}
)
public class SearchingByKeywordRunner {}
