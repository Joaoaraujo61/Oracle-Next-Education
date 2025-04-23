import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "João Pedro de A. Dias";
        String tipoConta = "Corrente";
        int opcao = 0;
        double saldo = 0;

        System.out.println(String.format("""
               *****************************************
               Dados iniciais do cliente:
               
               Nome:             %s
               Tipo conta:       %s
               Saldo inicial:    R$ %.2f
               *****************************************
               
               
               """, nome, tipoConta, saldo));
        String operacoes = """
                Operações
               
               1- Consultar saldo
               2- Depositar valor
               3- Sacar valor
               4- Sair
               
               Digite a opção desejada:
                """;
        while(opcao !=4){
            System.out.println(operacoes);
            opcao = leitura.nextInt();
            if (opcao==1){
                System.out.println("Seu saldo atual é " + saldo);
            }else if(opcao==2){
                System.out.println("Qual valor deseja depositar?");
                double valorDeposito = leitura.nextDouble();
                saldo += valorDeposito;
                System.out.println("Seu novo saldo é " + saldo);
            }else if(opcao==3){
                System.out.println("Qual valor deseja sacar?");
                double valorSaque = leitura.nextDouble();
                if (valorSaque <= saldo){
                    saldo -= valorSaque;
                    System.out.println("Seu novo saldo é " + saldo);
                }else {
                    System.out.println("Saldo inferior a " + valorSaque);
                }

            }else {
                System.out.println("Opção Inválida!");
            }
        }
        System.out.println("Operação finalizada");
    }
}
