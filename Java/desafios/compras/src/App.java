import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
   public static void main(String[] args) {
      Scanner leitura = new Scanner(System.in);
      List<Produto> infoProdutos = new ArrayList<>();

      int limite;
      int resposta = 1;
      

      System.out.println("Digite o limite do Cartão: ");
      limite = leitura.nextInt();
      leitura.nextLine();
      int restanteLimite = limite;

      while (resposta == 1) {
         Produto item = new Produto();
         System.out.println("Digite a descrição da compra: ");
         item.setDescricao(leitura.nextLine());

         System.out.println("Digite o valor da compra: ");
         int valor = leitura.nextInt();

         boolean res = false;
         while (!res) {
            if (restanteLimite == 0) {
               System.out.println("Limite atingido!");
               res = true;
            }else if (valor > restanteLimite) {
               System.out.println("Seu limite é: " + restanteLimite);
               System.out.println("Digite o valor da compra: ");
               valor = leitura.nextInt();
            }else{
               item.setValor(valor);
               restanteLimite -=valor;
               res = true;
            }
         }   
      
         leitura.nextLine();
         infoProdutos.add(item);
         System.out.println("Compra finalidzada!"); 

         if (restanteLimite > 0) {
            System.out.println("Digite 0 para sair ou 1 para continuar");
            resposta = leitura.nextInt();
            leitura.nextLine();
         } else {
            System.out.println("Limite esgotado! Finalizando compras.");
            resposta = 0;
         }
      }

      System.out.println("""
            **************************
               COMPRAS REALIZADAS:
            """);
      for(Produto i: infoProdutos){
         System.out.println(i.getDescricao() + " - R$ " + i.getValor() + ",00");
      }

      System.out.println("\nLimite restante: R$ " + restanteLimite + ",00");
      System.out.println("**************************");
      leitura.close();
   }
}
