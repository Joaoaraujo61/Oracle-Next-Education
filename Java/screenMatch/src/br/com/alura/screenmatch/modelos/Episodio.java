package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualizacoes;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTotalVizualizacoes(int totalVizualizacoes){
        this.totalVizualizacoes = totalVizualizacoes;
    }

    public String getNome() {
        return nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public int getNumero() {
        return numero;
    }

    public int getTotalVizualizacoes(){
        return totalVizualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVizualizacoes>100){
            return 4;
        }else {
            return 2;
        }
    }
}
