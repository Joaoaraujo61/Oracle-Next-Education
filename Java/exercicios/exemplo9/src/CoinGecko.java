import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException{
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=brl";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .GET()
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println("valor do bitcoin em reais: " + response.body());
    } 
}
