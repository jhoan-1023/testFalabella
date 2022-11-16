package co.com.falabella.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registrar.feature",
        glue = "co.com.falabella.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RegistrarRunner {
}
