package br.com.alura.screenmatch.calculo;

public class FiltroDeRecomendacao {
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >=4){
            System.out.println("Está entre ps preferidos do momento");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado no momento");
        }else {
            System.out.println("Coloque na lista e assista depois");
        }
    }
}
