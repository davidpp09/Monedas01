import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Peticiones {
    private static final String DIRECCION = "https://v6.exchangerate-api.com/v6/9eba1af4a93f08adc5bed564/pair/";
    private static final String DESPEDIDA = "Gracias por cambiar con nosotros";
    public static List<ResConversiones> historial = new ArrayList<>();

    public static Record api(String direccion){
        try {
            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

          return gson.fromJson(response.body(), ResConversiones.class);

        } catch (Exception e) {
            System.out.println("❌ Error durante la conversión: " + e.getMessage());
            return null;
        }
    }
    public static void conversionDeDivisas(String v1, String v2, int cantidad) {
        String direccion = DIRECCION + v1 + "/" + v2 + "/" + cantidad;
        ResConversiones data = (ResConversiones) api(direccion);
        Random random = new Random();
        int idOperacion = random.nextInt(1000); // Genera ID aleatorio de 0 a 999
        System.out.println("🔄 ID de operación: #" + idOperacion);
        System.out.printf("✅ %d %s%n", cantidad, data.toString());
        System.out.println(DESPEDIDA);
        historial.add(data);
    }
    public static void mostrarHistorial() {
        System.out.println("📜 Historial de conversiones:");
        for (ResConversiones r : historial) {
            System.out.println(r); // usa el toString automático
        }
    }


}

