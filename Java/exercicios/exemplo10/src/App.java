

import com.google.gson.Gson;

public class App {
   public static void main(String[] args){
        String json = """
                    {
                        "idade" = 19,
                        "nome" = "Joao",
                        "cidade" = "GAMA",
                        "altura" = 1.9
                    }
                """;
       Gson gson = new Gson();
       Pessoa pessoa = gson.fromJson(json, Pessoa.class);
       System.out.println(pessoa);
   }
}
