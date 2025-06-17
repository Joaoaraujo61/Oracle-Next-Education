import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write("Conteúdo a ser gravado no arquivo.");
        escrita.close();

        Titulo titulo = new Titulo("1917", 90, 8.5);
        String jsonTitulo = gson.toJson(titulo);
        System.out.println(jsonTitulo);
    }
}