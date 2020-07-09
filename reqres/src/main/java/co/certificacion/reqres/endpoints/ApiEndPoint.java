package co.certificacion.reqres.endpoints;

public class ApiEndPoint {

    private  static  final String BASE = "https://reqres.in/";
    private static final String REGISTER = BASE+"api/register";


    public static String obtenerEndPoint(String endpoint) {
        switch (endpoint) {
            case "register":
                return ApiEndPoint.REGISTER;

            default:
                break;
        }
        return "";
    }
}

