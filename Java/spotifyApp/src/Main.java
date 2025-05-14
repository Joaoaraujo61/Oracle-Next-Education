import br.com.alura.spotifyApp.modelos.Musica;
import br.com.alura.spotifyApp.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica rebirth = new Musica();
        rebirth.curtir();
        rebirth.curtir();
        rebirth.reproduzir();
        rebirth.reproduzir();
        rebirth.setTitulo("Rebirth");
        rebirth.setDuracaoEmMin(5);
        rebirth.setAlbum("Rebirth");
        rebirth.setArtista("ANGRA");
        rebirth.setGenero("Metal Espadinha");
        System.out.println(rebirth.exibirDetalhes());

        Podcast compilado = new Podcast();
        compilado.curtir();
        compilado.curtir();
        compilado.curtir();
        compilado.reproduzir();
        compilado.setTitulo("Compilado do Código Fonte TV");
        compilado.setNumeroEp(30);
        compilado.setDuracaoEmMin(62);
        compilado.setHost("Gabriel Froes");
        compilado.avaliar(5);
        compilado.avaliar(10);
        compilado.avaliar(9);
        compilado.avaliar(7);
        System.out.println("\n" + compilado.exibirDetalhes());
    }
}