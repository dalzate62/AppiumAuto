package co.com.superapp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "co.com.superapp.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@inicio_sesion"
)
public class ConjuntoPruebasRunner {
}