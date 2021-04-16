package automation.demo.site.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemoRegisterPage extends PageObject {
    public static final Target INPUT_FIELD_FULLNAME =
            Target.the("Input field full name")
                    .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));

    public static final Target INPUT_FIELD_LASTNAME =
            Target.the("Input field last name")
                    .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));

    public static final Target INPUT_FIELD_ADDRESS =
            Target.the("input field address")
                    .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));

    public static final Target INPUT_FIELD_EMAIL_ADDRESS =
            Target.the("input field email address")
                    .located(By.xpath("//*[@id=\"eid\"]/input"));

    public static final Target INPUT_FIELD_PHONE =
            Target.the("input fiel phone number")
                    .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));

    public static final Target RADIO_BUTTON_MALE_OPTION =
            Target.the("comobox male option")
                    .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));

    public static final Target RADIO_BUTTON_FEMALE_OPTION =
            Target.the("comobox female option")
                    .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));

    public static final Target CHECK_BOX_CRICKET =
            Target.the("checkbox cricket option").located(By.id("checkbox1"));

    public static final Target CHECK_BOX_MOVIES =
            Target.the("checkbox movies option").located(By.id("checkbox2"));

    public static final Target CHECK_BOX_HOCKEY =
            Target.the("checkbox hockey option").located(By.id("checkbox3"));

    /*Combobox multiple*/
    public static final Target LI_COMPONENT_ENGLISH =
            Target.the("li component english")
                    .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
    public static final Target LI_COMPONENT_DANISH =
            Target.the("li dropdown danish")
                    .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[6]/a"));


    public static final Target DROPDOWN_SKILLS =
            Target.the("dropdown skills").located(By.id("Skills"));

    public static final Target DROPDOWN_COUNTRY =
            Target.the("dropdown country element").located(By.id("countries"));

    public static final Target DROPDOWN_SELECT_COUNTRY =
            Target.the("dropdown select country").located(By.id("country"));

    //Date Of Birth
    public static final Target DATE_BIRTH_YEAR_ELEMENT =
            Target.the("date birth year element").located(By.id("yearbox"));

    public static final Target DATE_BIRTH_MONTH_ELEMENT =
            Target.the("date month month element").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));

    public static final Target DATE_BIRTH_DAY_ELEMENT =
            Target.the("date day day element").located(By.id("daybox"));

    public static final Target INPUT_FIELD_PASSWORD =
            Target.the("password component").located(By.id("firstpassword"));

    public static final Target INPUT_FIELD_CONFIRM_PASSWORD =
            Target.the("confirm password").located(By.id("secondpassword"));

    public static final Target VALIDATE_BUTTON =
            Target.the("validate button").located(By.id("submitbtn"));

    public static final Target LABEL_VALIDATION =
            Target.the("header h4 Double Click on Edit Icon to EDIT the Table Row").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));

    public static final Target MULTIPLE_SELECT =
            Target.the("multiple element").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select"));
}
