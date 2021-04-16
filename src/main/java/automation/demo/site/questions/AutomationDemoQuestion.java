package automation.demo.site.questions;

import automation.demo.site.userinterface.AutomationDemoRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AutomationDemoQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AutomationDemoRegisterPage.LABEL_VALIDATION).viewedBy(actor).asString();
    }

    public static Question is(){
        return new AutomationDemoQuestion();
    }
}
