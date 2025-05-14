import java.util.Scanner;

public class ValidadorSenha {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senhaDigitada = scanner.nextInt();
        scanner.close();
        int senha = 12345;

        if (senhaDigitada==senha) {
            System.out.println("Acesso permitido.");
        }else{
            System.out.println("Acesso negado.");
        }
    }
}
