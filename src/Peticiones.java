import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticiones {
    private static final String DIRECCION = "https://v6.exchangerate-api.com/v6/9eba1af4a93f08adc5bed564/pair/";
    private static final String DESPEDIDA = "Gracias por cambiar con nosotros,";
    public static void api(String direccion){
        try {
            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ResConversiones data = gson.fromJson(response.body(), ResConversiones.class);

            System.out.printf("son %.2f %s\n",
                    data.conversion_result(),
                    data.target_code()
            );

        } catch (Exception e) {
            System.out.println("❌ Error durante la conversión: " + e.getMessage());
        }
    }
    public static void conversionDeDivisas(String v1, String v2, int cantidad) {
        String direccion = DIRECCION + v1 + "/" + v2 + "/" + cantidad;
        System.out.println(v1 +" "+cantidad);
        api(direccion);
        System.out.println(DESPEDIDA);

    }
    public void conversionDemxn(String dv, int cantidad){
        String direccion = DIRECCION + "MXN/" + dv +"/"+cantidad;
        api(direccion);
        System.out.println(DESPEDIDA+"que tengas un buen viaje, Exito :)");
    }
    public void conversionDeamxn(String dv, int cantidad){
        String direccion = DIRECCION + dv + "/MXN/" + cantidad;
        System.out.println(DESPEDIDA+"Esperemos que tengas una buena estancia en la escuela :)");
    }
    public void divisasDisponibles(){
        String direccion = "https://v6.exchangerate-api.com/v6/9eba1af4a93f08adc5bed564/latest/USD";
        api(direccion);
    }
}

