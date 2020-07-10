package co.certificacion.reqres.endpoints;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;


public class ConsumirApi {

        public static void tipoPOST( String endPoint,String body, Actor actor) {

            actor.attemptsTo(Post.to(endPoint)
                    .with(request -> request
                            .header("Content-Type", "application/json")
                            .relaxedHTTPSValidation("TLS")
                            .body(body)
                            .log().all()));

        }

    public static void tipoGET(String endPoint, Actor actor) {

        actor.attemptsTo(Get.resource(endPoint)
                .with(request -> request
                        .header("Content-Type", "application/json")));

    }

    public static void tipoDeleteId(String endPoint, String id, Actor actor) {

        actor.attemptsTo(Delete.from(endPoint)
                .with(request -> request
                        .header("Content-Type", "application/json")));
    }

    public static void tipoGetId(String endPoint, int id, Actor actor) {

        actor.attemptsTo(Get.resource(endPoint)
                .with(request -> request
                        .header("Content-Type", "application/json")
                        .queryParam("id", id)));
    }

    public static void tipoPUT( String endPoint,String body, int id, Actor actor) {

        endPoint = endPoint.replace("id", id+"");
        actor.attemptsTo(Put.to(endPoint)
                .with(request -> request
                        .header("Content-Type", "application/json")
                        .body(body)
                        .log().all()));
    }



    }

