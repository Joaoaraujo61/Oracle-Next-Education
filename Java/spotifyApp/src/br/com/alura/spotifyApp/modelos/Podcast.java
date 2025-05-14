package br.com.alura.spotifyApp.modelos;

public class Podcast extends Audio{
    private String host;
    private int numeroEp;
    private double avaliacao;
    private int quantidadeAvaliacao;
    private int somaAvaliacoes;

    @Override
    public String exibirDetalhes(){
        return "Título: " + titulo + "\nHost: " + host  + "\nDuração: " + duracaoEmMin + " minutos" + "\nNúmero do Episódio: " + numeroEp + "\nReproduções: " + reproducoes + "\nCurtidas: " + curtidas + "\nAvaliação: " + avaliacao;
    }
    public String getHost() {
        return host;
    }

    public void avaliar(int avaliacao){
        quantidadeAvaliacao++;
        somaAvaliacoes+=avaliacao;
        this.avaliacao = (double) somaAvaliacoes/quantidadeAvaliacao;
    }

    public int getNumeroEp() {
        return numeroEp;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setNumeroEp(int numeroEp) {
        this.numeroEp = numeroEp;
    }
    public double getAvaliacao() {
        return avaliacao;
    }

    public int getQuantidadeAvaliacao() {
        return quantidadeAvaliacao;
    }
}
