package br.com.alura.spotifyApp.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String adicionarPlaylist(String playlist){
        return "Adicionado a playlist: " + playlist;
    }

    @Override
    public String exibirDetalhes() {
        return "Título: " + titulo + "\nDuração: " + duracaoEmMin +  " minutos" + "\nArtista: " + artista + "\nReproduções: " + reproducoes + "\nCurtidas: " + curtidas + "\nÁlbum: " + album + "\nGênero: " + genero;

    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
