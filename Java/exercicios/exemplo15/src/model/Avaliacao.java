package model;

import java.util.List;

public class Avaliacao <T>{
    private T item;
    private double nota;
    private String comentario;

    public Avaliacao(T item, double nota, String comentario){
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public static double calculaMedia(List<Avaliacao> avaliacoes){
        double somaNotas = 0;
        for(Avaliacao item: avaliacoes){
            somaNotas += item.nota;
        }
        return somaNotas / avaliacoes.size();
    }

    @Override
    public String toString() {
        return "Item: " + item +
                "\nNota: " + nota +
                "\nComentario: " + comentario;
    }
}
