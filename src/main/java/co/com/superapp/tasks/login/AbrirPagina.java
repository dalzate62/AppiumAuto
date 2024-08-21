package co.com.superapp.tasks.login;

import co.com.superapp.userinterface.login.UrlPaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private UrlPaginaInicial urlPaginaInicial;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(urlPaginaInicial));
    }

    public static AbrirPagina enElCelular() {
        return Tasks.instrumented(AbrirPagina.class);
    }
}