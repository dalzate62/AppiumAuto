package co.com.superapp.stepdefinitions;

import co.com.superapp.tasks.login.AbrirPagina;
import co.com.superapp.tasks.login.IniciarSesion;
import co.com.superapp.utils.Constantes;
import co.com.superapp.utils.PropiedadesUtils;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EscenariosGeneralesStepDefinitions {

    @Before
    public void configuracionInicial() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(PropiedadesUtils.getValorPropiedades(Constantes.DATA_PROPERTIES, "actor").trim());
    }

    @Dado("que inicio sesion en la pagina Super App con los datos de sesion")
    public void queInicioSesionEnLaPaginaSuperAppConLosDatosDeSesion() {
        //theActorInTheSpotlight().wasAbleTo(AbrirPagina.enElCelular());
        theActorInTheSpotlight().wasAbleTo(IniciarSesion.enSuperApp());
    }
}
