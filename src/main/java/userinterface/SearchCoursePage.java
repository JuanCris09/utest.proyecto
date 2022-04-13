package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_ACADEMY = Target.the("boton para ir a la academia")
            .located(By.xpath("//div[@class='nav-sidebar-item__text nav-sidebar-item__text--selected']"));
    public static final Target SELECT_COURSE = Target.the("Seleccionar el curso")
            .located(By.xpath("//a[contains(@class, 'course-track-view']"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h2[contains(text(),'3. uTest Mobile App')]"));

}
