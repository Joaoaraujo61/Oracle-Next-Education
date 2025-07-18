import model.NumeroPrimo;
import model.Pessoa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //------------------Exemplo 1------------------

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        numeros.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

        //------------------Exemplo 2------------------

        List<String> palavras = Arrays.asList("Java", "stream", "lambda");
        List<String> palavrasMaiusculas = palavras.stream()
                .map(p -> p.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(palavrasMaiusculas);

        //------------------Exemplo 3------------------

        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n%2 != 0)
                .collect(Collectors.toList());

        numerosImpares.forEach(System.out::println);

        //------------------Exemplo 4------------------

        List<String> outrasPalavras = Arrays.asList("apple","banana", "apple");
        outrasPalavras.stream()
                .distinct()
                .forEach(System.out::println);

        //------------------Exemplo 5------------------

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );
        NumeroPrimo primo = new NumeroPrimo();
        List<Integer> numerosPrimos = listaDeNumeros.stream()
                .flatMap(Collection::stream)
                .filter(n -> primo.verificaPrimo(n) == true)
                .sorted()
                .collect(Collectors.toList());

        numerosPrimos.forEach(System.out::println);

        //------------------Exemplo 6------------------

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Charlie", 19),
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17)
        );
        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .forEach(System.out::println);
    }
}