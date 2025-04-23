import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int guess = 0;
        int tentativas = 0;

        System.out.println("1 Qual o número? ");
        guess = leitura.nextInt();
        while(tentativas < 5){
            if (numeroAleatorio < guess){
                tentativas++;
                System.out.println("O número sorteado é menor que " + guess);
                System.out.println(tentativas + " Tente novamente");
                guess = leitura.nextInt();
            } else if (numeroAleatorio > guess) {
                tentativas++;
                System.out.println("O número sorteado é maior que " + guess);
                System.out.println(tentativas + " Tente novamente");
                guess = leitura.nextInt();
            }else {
                System.out.println("Parabéns o número é " + numeroAleatorio + "!");
                break;
            }
        }

    }
}
