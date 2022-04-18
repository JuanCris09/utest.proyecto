package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UtestRegisterPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("boton que nos muestra el formulario de crear cuenta")
            .located(By.xpath("//a[contains(@class, 'unauthenticated-nav-bar__sign-up')]"));
    public static final Target INPUT_NAME = Target.the("Donde escribimos nuestro nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Donde escribimos nuestro nombre")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Donde escribimos nuestra correo")
            .located(By.id("email"));
    public static final Target INPUT_MES = Target.the("Donde escribimos el mes de nuestro nacimiento")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Donde escribimos el dia de nuestro nacimiento")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEARS = Target.the("Donde escribimos el año de nuestro nacimiento")
            .located(By.id("birthYear"));


}
