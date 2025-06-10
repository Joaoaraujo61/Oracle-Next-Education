import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelos.Titulo;

public class App {
   public static void main(String[] args) {
       List<Integer> listaNumeros = new ArrayList<>();

       listaNumeros.add(3);
       listaNumeros.add(5);
       listaNumeros.add(2);
       Collections.sort(listaNumeros);
       System.out.println(listaNumeros);

       Titulo titulo2 = new Titulo("Dark");
       Titulo titulo1 = new Titulo("Breaking Bad");
       List<Titulo> listaTitulos = new ArrayList<>();
       listaTitulos.add(titulo1);
       listaTitulos.add(titulo2);

       Collections.sort(listaTitulos);
       for(Titulo item: listaTitulos){
        System.out.println(item.getNome());
       }
       
   }
}
