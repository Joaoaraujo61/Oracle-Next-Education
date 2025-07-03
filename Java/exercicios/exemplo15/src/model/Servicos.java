package model;

public record Servicos(String nome){
    @Override
    public String toString() {
        return nome;
    }
}
