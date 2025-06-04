
public class Produto {
    private String descricao;
    private int valor;

    public Produto(String descricao, int valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public String getDescricao(){
        return descricao;
    }
    public int getValor(){
        return valor;
    }
}
