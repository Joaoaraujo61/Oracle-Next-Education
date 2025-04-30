public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibeFicha(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
    }
    void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliacao++;
    }
    void exibeMediaAvaliacao(){
        System.out.println("Avaliação: " + avaliacao/numAvaliacao);
    }
}
