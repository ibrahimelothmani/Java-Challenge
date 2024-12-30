import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            HttpClient client = HttpClient.newHttpClient();
            System.out.print("Enter a Pokémon name: ");
            String namePokemon = scanner.next().toLowerCase();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://pokeapi.co/api/v2/pokemon/" + namePokemon))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
