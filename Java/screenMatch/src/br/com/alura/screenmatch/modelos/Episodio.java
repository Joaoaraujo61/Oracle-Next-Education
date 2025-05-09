package br.com.alura.screenmatch.modelos;

public class Episodio{
    private int numero;
    private String nome;
    private Serie serie;


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
