package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPortemporaada;
    private  int minPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public int getEpisodiosPortemporaada(){
        return episodiosPortemporaada;
    }

    public int getMinPorEpisodio(){
        return minPorEpisodio;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public  void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void setEpisodiosPortemporaada(int episodiosPortemporaada){
        this.episodiosPortemporaada = episodiosPortemporaada;
    }

    public void setMinPorEpisodio(int minPorEpisodio){
        this.minPorEpisodio = minPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPortemporaada * minPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
