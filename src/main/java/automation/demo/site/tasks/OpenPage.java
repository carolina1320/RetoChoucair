package automation.demo.site.tasks;

import automation.demo.site.userinterface.AutomationDemoRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {
    private AutomationDemoRegisterPage automationdemoregisterPage;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(automationdemoregisterPage));
    }

    public static OpenPage automationDemoRegister(){
        return Tasks.instrumented(OpenPage.class);
    }

}
