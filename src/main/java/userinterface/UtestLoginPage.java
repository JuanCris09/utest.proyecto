package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UtestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("boton que nos muestra el formulario de iniciar sesion")
            .located(By.xpath("//a[contains(@class, 'unauthenticated-nav-bar__link')]"));
    public static final Target INPUT_USER = Target.the("Donde escribimos nuestro usuario")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Donde escribimos nuestra contraseña")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Boton de confirmacion de inicio de sesion")
            .located(By.xpath("//button[contains(@class, 'btn')]"));

}
