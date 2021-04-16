package automation.demo.site.stepdefinitions;

import automation.demo.site.model.AutomationDemoData;
import automation.demo.site.questions.AutomationDemoQuestion;
import automation.demo.site.tasks.OpenPage;
import automation.demo.site.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;

public class AutomationDemoStepDefinition {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Given("^that the actor wants to access the web automation demo site$")
    public void thatTheActorWantsToAccessTheWebAutomationDemoSite() {
        theActorCalled("carolina").wasAbleTo(OpenPage.automationDemoRegister());
    }

    @When("^he performs the registration on the page$")
    public void hePerformsTheRegistrationOnThePage(List<AutomationDemoData> automationdemodata) {
        theActorInTheSpotlight().attemptsTo(Register.automationDemoForm(automationdemodata));
    }

    @Then("^he verifies that the screen is loaded with (.*)$")
    public void heVerifiesThatTheScreenIsLoadedWithDoubleClickOnEditIconToEDITTheTableRow(String response) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AutomationDemoQuestion.is(), equalTo(response)));
        theActorInTheSpotlight().attemptsTo();

    }
}
