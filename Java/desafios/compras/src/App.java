import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
   public static void main(String[] args) {
      Scanner leitura = new Scanner(System.in);
      List<Produto> infoProdutos = new ArrayList<>();

      System.out.println("Digite o limite do Cartão: ");
      Cartao cartao = new Cartao(leitura.nextInt());;
      leitura.nextLine();
      
      int resposta = 1;
      while (resposta == 1) {
         System.out.println("Digite a descrição da compra: ");
         String descricao = leitura.nextLine();

         System.out.println("Digite o valor da compra: ");
         int valor = leitura.nextInt();

         Produto item = new Produto(descricao, valor);

         boolean res = false;
         while (!res) {
            if (cartao.getSaldo() == 0) {
               System.out.println("Limite atingido!");
               res = true;
            }else if (valor > cartao.getSaldo()) {
               System.out.println("Seu limite é: " + cartao.getSaldo());
               System.out.println("Digite o valor da compra: ");
               valor = leitura.nextInt();
            }else{
               item.setValor(valor);
               cartao.setSaldo(cartao.getSaldo()-valor);
               res = true;
            }
         }   
      
         leitura.nextLine();
         infoProdutos.add(item);
         System.out.println("Compra finalidzada!"); 

         if (cartao.getSaldo() > 0) {
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

      System.out.println("\nLimite restante: R$ " + cartao.getSaldo() + ",00");
      System.out.println("**************************");
      leitura.close();
   }
}
