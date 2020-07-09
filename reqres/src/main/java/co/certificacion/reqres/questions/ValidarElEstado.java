package co.certificacion.reqres.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarElEstado implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String val = actor.recall("statusCode");
        System.out.println("------------------> " + val );
        return actor.recall("statusCode");
    }

    public static ValidarElEstado deLaConsulta(){

        return new ValidarElEstado();
    }
}
