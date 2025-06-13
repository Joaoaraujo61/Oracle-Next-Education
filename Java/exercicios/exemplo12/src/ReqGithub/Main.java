package ReqGithub;

import ReqGithub.excecao.ErroConsultaGitHubException;
import ReqGithub.modelos.User;
import ReqGithub.modelos.UserRequest;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o usuário que deseja pesquisar: ");
        String userName = leitura.nextLine();
        leitura.close();

        String endereco = "https://api.github.com/users/" + userName;
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body().toString();

            Gson gson = new Gson();
            UserRequest userRequest = gson.fromJson(json, UserRequest.class);
            User user = new User(userRequest, userName);
            System.out.println(user);
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}