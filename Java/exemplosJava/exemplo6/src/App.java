import java.util.ArrayList;

import modelos.Produto;
import modelos.ProdutoPerecivel;

public class App {
   public static void main(String[] args) {
       ProdutoPerecivel produto = new ProdutoPerecivel("Bolacha", 2800.4, 3, "12-04-2026");
       ProdutoPerecivel produto2 = new ProdutoPerecivel("Batata Palha", 1500, 7, "04-07-2026");
       
       ArrayList<Produto> listaProduto = new ArrayList<>();
       listaProduto.add(produto2);
       listaProduto.add(produto);
       System.out.println(listaProduto.size() + " " + listaProduto.get(0).getNome());

       System.out.println(listaProduto.toString());
   }
}
