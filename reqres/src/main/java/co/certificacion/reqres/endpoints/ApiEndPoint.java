package co.certificacion.reqres.endpoints;

public class ApiEndPoint {

    private static final String BASE = "https://reqres.in/";
    private static final String REGISTER = BASE + "api/register";
    private static final String CLIENTES = BASE + "api/users";
    private static final String ELIMINAR_CLIENTE = BASE + "/clients/id/delete";

    public static String obtenerEndPoint(String endpoint) {
        switch (endpoint) {
            case "register":
                return ApiEndPoint.REGISTER;
            case "cliente":
                return ApiEndPoint.CLIENTES;
            case "eliminar":
                return ApiEndPoint.ELIMINAR_CLIENTE;
            default:
                break;
        }
        return "";
    }
}

