package modelos;

import excecao.MaxLengthKeyException;

public class Senha {
    private int senha;

    public Senha(int senha){
        this.senha = senha;
        if (String.valueOf(senha).length() > 8){
            throw new MaxLengthKeyException("Digite uma senha de até 8 caractéres");
        }
    }

    public int getSenha() {
        return senha;
    }
}
