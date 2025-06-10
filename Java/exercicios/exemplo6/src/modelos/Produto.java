package modelos;

public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return nome + " é " + preco + " tem " + quantidade + " disponíveis";
    }
}
