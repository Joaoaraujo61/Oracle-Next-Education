package ReqGithub.modelos;

import ReqGithub.excecao.ErroConsultaGitHubException;

public class User {
    private String nome;
    private String nomeDeUsuario;
    private String localizacao;
    private String bio;
    private int seguidores;
    private int seguindo;

    public User(UserRequest user, String nomeDeUsuario){
        if (user.name() == null){
            throw new ErroConsultaGitHubException();
        }
        this.nomeDeUsuario = nomeDeUsuario;
        this.nome = user.name();
        this.localizacao = user.location();
        this.bio = user.bio();
        this.seguidores = user.followers();
        this.seguindo = user.following();
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCidade: " + localizacao +
                "\nBio: " + bio +
                "\nSeguidores: " + seguidores +
                "\nSeguindo: " + seguindo;
    }
}
