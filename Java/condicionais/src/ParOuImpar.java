import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        if (numero%2 == 0) {
            System.out.println(numero + " é par");
        }else{
            System.out.println(numero + " é ímpar");
        }
    }
}
