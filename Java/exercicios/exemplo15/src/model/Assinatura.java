package model;

public record Assinatura(String nome){
    @Override
    public String toString() {
        return nome;
    }
}
