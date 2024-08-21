package co.com.superapp.userinterface.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin extends PageObject {

    public static final Target INPUT_NOMBRE_USUARIO =
            Target.the("Txt de nombre de usuario")
                  .located(By.id("username"));

    @FindBy(id = "password")
    public static final WebElementFacade INPUT_CONTRASENA_ELEMENTO = null;

    @FindBy(id = "username")
    public static final WebElementFacade INPUT_NOMBRE_USUARIO_ELEMENTO = null;

    public static final Target POP_UP_CONDICIONES_SERVICIO =
            Target.the("Clic en botón Aceptar del pop up Condiciones del Servicio")
            .located(By.xpath("//*[@text='Aceptar']"));
    /*
    public static final Target ACTUALIZAR_APP_EN_OTRO_MOMENTO = Target.the("Clic en botón Actualizar app en otro momento")
            .located(MobileBy.id("bt_bottom"));

    public static final Target LOCALIZACION = Target.the("Clic PARA LOCALIZACION ")
            .located(MobileBy.id("permission_allow_foreground_only_button"));

    public static final Target PERMITIR_NOTIFICACIONES= Target.the("Clic PARA LOCALIZACION ")
            .located(MobileBy.id("permission_allow_button"));
*/
}
