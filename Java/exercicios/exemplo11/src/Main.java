import excecao.MaxLengthKeyException;
import modelos.Senha;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int numeroUm = leitura.nextInt();

        System.out.println("Segundo Número: ");
        int numeroDois = leitura.nextInt();
        leitura.close();

        try {
            int resultado = numeroUm/numeroDois;
            System.out.println(resultado);

            Senha senha = new Senha(123456782);
            System.out.println(senha.getSenha());
        }catch (ArithmeticException e){
            System.out.println("Divisor '" + numeroDois + "' inválido!");
        }catch (MaxLengthKeyException e){
            System.out.println(e.getMessage());
        }

    }
}