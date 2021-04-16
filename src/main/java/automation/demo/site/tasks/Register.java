package automation.demo.site.tasks;

import automation.demo.site.model.AutomationDemoData;
import automation.demo.site.userinterface.AutomationDemoRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.util.List;

public class Register implements Task {
    private List<AutomationDemoData> automationdemodata;

    public Register(List<AutomationDemoData> automationdemodata) {
        super();
        this.automationdemodata = automationdemodata;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(automationdemodata.get(0).getFull_name()).into(AutomationDemoRegisterPage.INPUT_FIELD_FULLNAME),
                Enter.theValue(automationdemodata.get(0).getLast_name()).into(AutomationDemoRegisterPage.INPUT_FIELD_LASTNAME),
                Enter.theValue(automationdemodata.get(0).getAddress()).into(AutomationDemoRegisterPage.INPUT_FIELD_ADDRESS),
                Enter.theValue(automationdemodata.get(0).getEmail()).into(AutomationDemoRegisterPage.INPUT_FIELD_EMAIL_ADDRESS),
                Enter.theValue(automationdemodata.get(0).getPhone()).into(AutomationDemoRegisterPage.INPUT_FIELD_PHONE),
                Click.on(AutomationDemoRegisterPage.RADIO_BUTTON_MALE_OPTION),
                Click.on(AutomationDemoRegisterPage.CHECK_BOX_CRICKET),
                Click.on(AutomationDemoRegisterPage.CHECK_BOX_HOCKEY),
                Click.on(AutomationDemoRegisterPage.MULTIPLE_SELECT),
                Click.on(AutomationDemoRegisterPage.LI_COMPONENT_ENGLISH),
                Click.on(AutomationDemoRegisterPage.LI_COMPONENT_DANISH),
                SelectFromOptions.byVisibleText("C++").from(AutomationDemoRegisterPage.DROPDOWN_SKILLS),
                SelectFromOptions.byVisibleText("Australia").from(AutomationDemoRegisterPage.DROPDOWN_COUNTRY),
                SelectFromOptions.byVisibleText("India").from(AutomationDemoRegisterPage.DROPDOWN_SELECT_COUNTRY),
                SelectFromOptions.byVisibleText("1996").from(AutomationDemoRegisterPage.DATE_BIRTH_YEAR_ELEMENT),
                SelectFromOptions.byVisibleText("July").from(AutomationDemoRegisterPage.DATE_BIRTH_MONTH_ELEMENT),
                SelectFromOptions.byVisibleText("12").from(AutomationDemoRegisterPage.DATE_BIRTH_DAY_ELEMENT),
                Enter.theValue(automationdemodata.get(0).getPassword()).into(AutomationDemoRegisterPage.INPUT_FIELD_PASSWORD),
                Enter.theValue(automationdemodata.get(0).getConfirm_password()).into(AutomationDemoRegisterPage.INPUT_FIELD_CONFIRM_PASSWORD),
                Click.on(AutomationDemoRegisterPage.VALIDATE_BUTTON));
    }

    public static Register automationDemoForm(List<AutomationDemoData> automationdemodata){
        return Tasks.instrumented(Register.class, automationdemodata);
    }
}