package co.com.superapp.tasks.login;

import co.com.superapp.userinterface.login.PaginaLogin;
import co.com.superapp.utils.Constantes;
import co.com.superapp.utils.WebUtils;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import java.util.logging.Logger;

import static co.com.superapp.userinterface.login.PaginaLogin.*;

public class IniciarSesion implements Task {

    Logger logger = Logger.getLogger(String.valueOf(Constantes.class));


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            WebUtils.esperar(15);
            actor.attemptsTo(Click.on(POP_UP_CONDICIONES_SERVICIO));
/*
            if (Visibility.of(POP_UP_CONDICIONES_SERVICIO).viewedBy(actor).resolve()) {
                actor.attemptsTo(Click.on(POP_UP_CONDICIONES_SERVICIO));
            } else {
                logger.info("No hay pop up de Condiciones del servicio");
            }

            if (Visibility.of(ACTUALIZAR_APP_EN_OTRO_MOMENTO).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(ACTUALIZAR_APP_EN_OTRO_MOMENTO));
            } else {
                logger.info("No hay pop up de Actualizar App");
            }

            if (Visibility.of(LOCALIZACION).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(LOCALIZACION));
            } else {
                logger.info("No hay pop up de localización");
            }

            if (Visibility.of(PERMITIR_NOTIFICACIONES).viewedBy(actor).resolve()) {
                actor.attemptsTo(
                        Click.on(PERMITIR_NOTIFICACIONES));
            } else {
                logger.info("No hay pop up de Permitir notificaciones");
            }
*/
            //BotonOmitir.DoWhileForOmitir(actor);


        } catch (Exception e) {
            Serenity.takeScreenshot();
            /*ValidarRecorrido.verificacionErrores.append("- No fue posible validar el botón de " + "Devolución de equipos"
                    + " en la categoría de " + categoria);
            Serenity.recordReportData().withTitle("Error").andContents("Ocurrió un problema con el botón de " + "Devolución de equipos" +
                    " Detalle del error: " + e.getMessage());
*/
        }
    }

    public static IniciarSesion enSuperApp() {
        return Tasks.instrumented(IniciarSesion.class);
    }
}
