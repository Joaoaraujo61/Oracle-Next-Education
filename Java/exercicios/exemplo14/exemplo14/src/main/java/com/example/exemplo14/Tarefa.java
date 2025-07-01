package com.example.exemplo14;

public class Tarefa {
    private String descricao;
    private String pessoaResponsavel;
    private boolean concluida;

    public Tarefa() {
        // construtor vazio necessário para o Jackson
    }
    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }



    @Override
    public String toString() {
        return "Descrição: " + descricao +
                "\nConcluida? " + concluida +
                "\nResponsável: " + pessoaResponsavel;
    }
}
