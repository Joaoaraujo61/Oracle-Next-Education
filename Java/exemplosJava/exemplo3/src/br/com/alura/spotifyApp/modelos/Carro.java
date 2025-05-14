package br.com.alura.spotifyApp.modelos;

public class Carro {
    private String modelo;
    private int precoMedio;
    private int precoPrimeiroAno;
    private int precoSegundoAno;
    private int precoTerceiroAno;
    private int maiorPreco;
    private int menorPreco;

    public String getModelo(){
        return modelo;
    }
    public int getPrecoMedio(){
        return precoMedio;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPrecoPrimeiroAno(int preco){
        this.precoPrimeiroAno = preco;
    }
    public void setPrecoSegundoAno(int preco){
        this.precoSegundoAno= preco;
    }
    public void setPrecoTerceiroAno(int preco){
        this.precoTerceiroAno = preco;
    }

    public int calculaPrecoMedio(){
        precoMedio = (precoPrimeiroAno + precoSegundoAno + precoTerceiroAno)/3;
        return precoMedio;
    }

    public int menorPreco(){
        menorPreco = precoPrimeiroAno;
        if (precoSegundoAno < menorPreco) {
            menorPreco = precoSegundoAno;
        }
        if (precoTerceiroAno < menorPreco) {
            menorPreco = precoTerceiroAno;
        }

        return menorPreco;
    }

    public int maiorPreco(){
        maiorPreco = precoPrimeiroAno;
        if(precoSegundoAno > maiorPreco){
            maiorPreco = precoSegundoAno;
        }
        if(precoTerceiroAno > maiorPreco){
            maiorPreco = precoTerceiroAno;
        }

        return maiorPreco;
    }
}
