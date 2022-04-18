package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestCompletPage extends PageObject {
    public static final Target NEXT_BUTTON = Target.the("boton para continuar el formulario")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
    public static final Target INPUT_CITY = Target.the("Donde escribimos la ciudad")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("Donde escribimos el codigo postal")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Donde escribimos el pais")
            .located(By.xpath("//span[contains(@class, 'ui-select-match-text pull-left')]"));
    public static final Target INPUT_COMPUTER = Target.the("Donde escribimos el sistema operativo del computador")
            .located(By.xpath("//input[contains(@class, 'form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched ng-hide')]"));
    public static final Target INPUT_VERSION = Target.the("Donde escribimos la version del computador")
            .located(By.xpath("//input[contains(@class, 'ui-select-match-text pull-left ui-select-allow-clear')]"));
    public static final Target INPUT_LANGUAGE = Target.the("Donde escribimos el lenguaje en ingles")
            .located(By.xpath("//input[contains(@class, 'form-control ui-select-search ng-valid ng-dirty ng-valid-parse ng-empty ng-touched')]"));
    public static final Target INPUT_MOBILE = Target.the("Donde escribimos la marca de nuestro celular")
            .located(By.xpath("//span[contains(@class, 'btn btn-default form-control ui-select-toggle')]"));
    public static final Target INPUT_MODEL = Target.the("Donde escribimos el modelo de nuestro celular")
            .located(By.xpath("//span[contains(@class, 'btn btn-default form-control ui-select-toggle')]"));
    public static final Target INPUT_OS = Target.the("Donde escribimos la version del sistema operativo de nuestro celular")
            .located(By.xpath("//span[contains(@class, 'btn btn-default form-control ui-select-toggle')]"));
    public static final Target NEXT_BUTTON2 = Target.the("boton para continuar el formulario")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
    public static final Target INPUT_PASSWORD = Target.the("Donde escribimos la contraseña")
            .located(By.id("password"));
    public static final Target INPUT_PASSWORD2 = Target.the("Donde escribimos la contraseña por esgunda vez")
            .located(By.id("confirmPassword"));
    public static final Target CLICK_BUTTON = Target.the("Boton de validacion de terminos")
            .located(By.xpath("//span[contains(@class, 'checkmark signup-consent__checkbox error')]"));
    public static final Target CLICK_BUTTON2 = Target.the("Boton de validacion de terminos")
            .located(By.xpath("//span[contains(@class, 'checkmark signup-consent__checkbox error')]"));
    public static final Target COMPLETE_BUTTON = Target.the("boton para completar el formulario")
            .located(By.xpath("//div[contains(@class, 'pull-right next-step')]"));
}






