import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticiones {
    public static void conversion(String v1, String v2, int cantidad) {
        try {
            Gson gson = new Gson();
            String direccion = "https://v6.exchangerate-api.com/v6/9eba1af4a93f08adc5bed564/pair/"
                    + v1 + "/" + v2 + "/" + cantidad;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ResConversiones data = gson.fromJson(response.body(), ResConversiones.class);

            System.out.printf("✅ %d %s son %.2f %s\n",
                    cantidad,
                    data.base_code(),
                    data.conversion_result(),
                    data.target_code()
            );

        } catch (Exception e) {
            System.out.println("❌ Error durante la conversión: " + e.getMessage());
        }
    }
}
