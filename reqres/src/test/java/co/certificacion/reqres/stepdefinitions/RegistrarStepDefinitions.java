package co.certificacion.reqres.stepdefinitions;

import co.certificacion.reqres.endpoints.ApiEndPoint;
import co.certificacion.reqres.endpoints.ConsumirApi;
import co.certificacion.reqres.models.AutenticacionModels;
import co.certificacion.reqres.utils.CrearBody;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import net.thucydides.core.util.EnvironmentVariables;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;


public class RegistrarStepDefinitions {
    private EnvironmentVariables envVars;
    private Actor analista;

    @Before
    public void configurarElEscenario() {

        String baseUrl = envVars.optionalProperty("restapi.baseurl").orElseThrow(IllegalArgumentException::new);
        //SerenityRest.setDefaultProxy(new ProxySpecification("10.101.85.253", 8080, "http"));
        SerenityRest.useRelaxedHTTPSValidation("TLS");
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Analista"); //no se hace nada!!!
        analista = Actor.named("Calva la analista").whoCan(CallAnApi.at(baseUrl));

    }

    @Dado("el Analista envia la peticion con los datos:")
    public void elAnalistaEnviaLaPeticionConLosDatos(List<Map<String, String>> datos) {

        String bodyRegistrarCliente = CrearBody.conLaPlantilla(AutenticacionModels.CREAR_CLIENTE).yLosValores(datos);
        theActorInTheSpotlight().remember("bodyRegistrarCliente", bodyRegistrarCliente);
        System.out.print("----------------" + bodyRegistrarCliente);
    }

    @Cuando("que el Analista desea consumir el servicio llamado '(.*)'")
    public void queElAnalistaDeseaConsumirElServicioLlamado(String servicio) {
      String bodyCrearCliente = theActorInTheSpotlight().recall("bodyRegistrarCliente");
      ConsumirApi.tipoPOST(ApiEndPoint.obtenerEndPoint(servicio), bodyCrearCliente, analista);
    }

    @Entonces("el deberia ver que la respuesta es un codigo '(.*)'")
    public void elDeberiaVerQueLaRespuestaEsUnCodigo(int codigo) {
        analista.should(
                seeThatResponse("El usuario se registró correctamente",
                        response -> response.statusCode(codigo))
        );
    }

    @After
    public void cerrarElEscenario() {
        OnStage.drawTheCurtain();
    }

}