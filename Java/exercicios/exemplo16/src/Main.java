import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Multiplicacao multiplicacao = (a, b) -> a*b;
        System.out.println(multiplicacao.multiplica(3,5));
        
        Numero numero = (n) -> {
            if (n <= 1) {return false;}
            else{
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {return false;}
                }
            }
            return true;
        };
        var r = "s";
//        while (r.equals("s")) {
//            int n = leitura.nextInt();
//            leitura.nextLine();
//            System.out.println("É primo? " + numero.verificaPrimo(n) + "\nDeseja continuar?");
//            r = leitura.nextLine();
//        }
//        leitura.close();

        Expressao conversor = (expr) -> expr.toUpperCase();
        System.out.println(conversor.converteParaMaiusculo("JoAO pedrO"));

        Palindromo palindromo = (str) -> {
            str = str.toLowerCase().replaceAll("\\s", "");
            StringBuilder sb = new StringBuilder(str);
            return str.toLowerCase().equals(sb.reverse().toString());
        };
        System.out.println(palindromo.verificaPalindromo("A grama é amarga"));

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(4);
        listaNumeros.add(12);
        Lista listaMultiplicada = (lista) -> lista.replaceAll(n -> n * 3);
        listaMultiplicada.multiplicaLista(listaNumeros);
        System.out.println(listaNumeros);

        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Joao");
        listaNomes.add("Pedro");
        listaNomes.add("Ana");

        ListaString listaOrdenada = (Collections::sort);
        listaOrdenada.ordenaLista(listaNomes);
        System.out.println(listaNomes);
    }
}