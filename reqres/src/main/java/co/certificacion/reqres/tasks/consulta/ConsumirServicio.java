package co.certificacion.reqres.tasks.consulta;

import co.certificacion.reqres.tasks.RegistrarUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;

public class ConsumirServicio implements Task {
	private String endpoint;

	public ConsumirServicio(String endpoint) {

		this.endpoint = endpoint;
	}

	public static ConsumirServicio conElSiguienteEndPoint(String endpoint) {
		return Tasks.instrumented(ConsumirServicio.class, endpoint);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		switch (endpoint) {

		case "register":
			String registrarUsuarioNuevo = OnStage.theActorInTheSpotlight().recall("bodyRegistrarCliente");
			System.out.print(registrarUsuarioNuevo);
			actor.attemptsTo(RegistrarUsuario.conLaInformacionDel(registrarUsuarioNuevo).yElEndPoint(endpoint));

			break;
		}

	}

}
