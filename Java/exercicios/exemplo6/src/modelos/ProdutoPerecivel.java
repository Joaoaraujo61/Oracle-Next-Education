package modelos;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString(){
        return nome + " é " + preco + " tem " + quantidade + " disponíveis" + " vence em: " + dataValidade;
    }

}
