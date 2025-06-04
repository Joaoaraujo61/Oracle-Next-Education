package br.com.alura.spotifyApp.modelos;

public class Audio {
    protected String titulo;
    protected int duracaoEmMin;
    protected int reproducoes;
    protected int curtidas;



    public void curtir(){
        curtidas++;
    }
    public void reproduzir(){
        reproducoes++;
    }

    public String exibirDetalhes(){
        return "Título: " + titulo + "\nDuração: " + duracaoEmMin + " minutos" + "\nReproduções: " + reproducoes + "\nCurtidas: " + curtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmMin() {
        return duracaoEmMin;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmMin(int duracaoEmMin) {
        this.duracaoEmMin = duracaoEmMin;
    }
}
