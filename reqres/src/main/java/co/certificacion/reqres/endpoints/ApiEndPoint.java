package co.certificacion.reqres.endpoints;

public class ApiEndPoint {

    //private static final String BASE = "reqres.in/";
    private static final String REGISTER =  "register";
    private static final String CLIENTES =  "users";
    private static final String ELIMINAR_CLIENTE =  "clients/id/delete";
    private static final String CLIENTE_ID =  "users";

    public static String obtenerEndPoint(String endpoint) {
        switch (endpoint) {
            case "register":
                return ApiEndPoint.REGISTER;
            case "cliente":
                return ApiEndPoint.CLIENTES;
            case "eliminar":
                return ApiEndPoint.ELIMINAR_CLIENTE;
            case "cliente_id":
                return ApiEndPoint.CLIENTE_ID;
            default:
                break;
        }
        return "";
    }
}

