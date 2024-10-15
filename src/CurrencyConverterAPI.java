import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyConverterAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/f707629c499b505e95c0f211/latest/";

    public static double getConversionRate(String fromCurrency, String toCurrency) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + fromCurrency))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
            return jsonResponse.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return 0;
        }
    }

}
