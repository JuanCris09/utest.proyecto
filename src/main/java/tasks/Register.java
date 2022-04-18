package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestRegisterPage;

public class Register implements Task {
    private String strEmail;

    public Register(String strEmail) {
        this.strEmail = strEmail;
    }

    public static Register onThePage(String strEmail) {

        return Tasks.instrumented(Register.class, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.LOGIN_BUTTON),
                Enter.theValue("IngresarTuNombre").into(UtestRegisterPage.INPUT_NAME),
                Enter.theValue("IngresarTuApellido").into(UtestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL),
                Enter.theValue("IngresarTuMes").into(UtestRegisterPage.INPUT_MES),
                Enter.theValue("IngresarTuDia").into(UtestRegisterPage.INPUT_DAY),
                Enter.theValue("IngresarTuAnio").into(UtestRegisterPage.INPUT_YEARS)
        );
    }
}
