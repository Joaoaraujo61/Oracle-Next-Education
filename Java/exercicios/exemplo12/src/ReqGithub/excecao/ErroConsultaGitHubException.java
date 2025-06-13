package ReqGithub.excecao;

public class ErroConsultaGitHubException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Digite um nome de usuário válido!";
    }
}
