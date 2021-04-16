package automation.demo.site.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/automationdemo.feature",
        tags = "@Regression",
        glue = "automation.demo.site.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerAutomationDemo {
}
