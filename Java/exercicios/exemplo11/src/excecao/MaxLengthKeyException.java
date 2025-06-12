package excecao;

public class MaxLengthKeyException extends RuntimeException {
    private String mensagem;

    public MaxLengthKeyException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
