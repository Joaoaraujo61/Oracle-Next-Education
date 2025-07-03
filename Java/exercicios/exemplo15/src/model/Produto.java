package model;

public record Produto(String nome) {
    @Override
    public String toString() {
        return nome;
    }
}
