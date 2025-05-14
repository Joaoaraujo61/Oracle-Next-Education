import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double media = scanner.nextDouble();
        scanner.close();
        
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        }else if(media >= 5){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
