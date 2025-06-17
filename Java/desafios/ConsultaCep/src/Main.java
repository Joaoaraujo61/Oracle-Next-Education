import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.plaf.IconUIResource;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu cep para consulta: ");
        String cep = leitura.nextLine();
        leitura.close();
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco(cep);

        try {
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}