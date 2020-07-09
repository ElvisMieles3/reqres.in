package co.certificacion.reqres.endpoints;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Post;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsumirApi {

        public static void tipoPOST( String endPoint,String body, Actor actor) {

            actor.attemptsTo(Post.to(endPoint)
                    .with(request -> request
                            .header("Content-Type", "application/json")
                            .relaxedHTTPSValidation("TLS")
                            .body(body)
                            .log().all()));

        }

    }

