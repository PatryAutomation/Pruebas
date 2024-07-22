package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)


@CucumberOptions(
        features= "src/test/java/features",
        glue = "seleniumGlueCode",
        snippets=CAMELCASE
)

public class testRunner {
}
