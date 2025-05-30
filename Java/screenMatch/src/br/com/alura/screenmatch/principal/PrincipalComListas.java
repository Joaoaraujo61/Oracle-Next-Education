package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main (String[] args){
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        Filme filmeJoao = new Filme("Dogville", 2003);
        filmeJoao.avalia(10);
        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeJoao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                //OU Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Leonardo DiCaprio");
        buscaPorArtistas.add("Bryan Cranston");
        buscaPorArtistas.add("Brad Pit");

        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing((Titulo::getAnoDeLancamento)));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}
