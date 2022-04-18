package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestCompletPage;


public class Complet implements Task{
    private String  strPassword;

    public Complet(String strPassword) {
        this.strPassword = strPassword;
    }

    public static Complet the( String strPassword){

        return Tasks.instrumented(Complet.class, strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestCompletPage.NEXT_BUTTON),
                Enter.theValue("IngresarTuCiudad").into(UtestCompletPage.INPUT_CITY),
                Enter.theValue("IngresarTuPostal").into(UtestCompletPage.INPUT_POSTAL),
                Enter.theValue("IngresarTuPais").into(UtestCompletPage.INPUT_COUNTRY),
                Enter.theValue("IngresarTuComputador").into(UtestCompletPage.INPUT_COMPUTER),
                Enter.theValue("IngresarTuVersion").into(UtestCompletPage.INPUT_VERSION),
                Enter.theValue("IngresarTuLenguaje").into(UtestCompletPage.INPUT_LANGUAGE),
                Enter.theValue("IngresarTuCelular").into(UtestCompletPage.INPUT_MOBILE),
                Enter.theValue("IngresarTuModelo").into(UtestCompletPage.INPUT_MODEL),
                Enter.theValue("IngresarTuSistemaOperativo").into(UtestCompletPage.INPUT_OS),
                Click.on(UtestCompletPage.NEXT_BUTTON2),
                Enter.theValue(strPassword).into(UtestCompletPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtestCompletPage.INPUT_PASSWORD2),
                Click.on(UtestCompletPage.CLICK_BUTTON),
                Click.on(UtestCompletPage.CLICK_BUTTON2),
                Click.on(UtestCompletPage.COMPLETE_BUTTON)
        );
    }
}

