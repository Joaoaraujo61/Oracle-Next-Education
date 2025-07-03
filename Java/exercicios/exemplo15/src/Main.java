import model.Assinatura;
import model.Avaliacao;
import model.Produto;
import model.Servicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static model.Avaliacao.calculaMedia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto carredor = new Produto("carregador");
        Servicos costura = new Servicos("costura");
        Assinatura netflix = new Assinatura("netflix");

        Avaliacao<Produto> avaliacaoP = new Avaliacao(carredor, 7, "Ótimo carregador!");
        Avaliacao<Servicos> avaliacaoS = new Avaliacao(costura, 9, "Ótima costureira!");
        Avaliacao<Assinatura> avaliacaoA = new Avaliacao(netflix, 4, "Muito caro!");

        List<Avaliacao> avaliacoes = new ArrayList<>();
        Collections.addAll(avaliacoes, avaliacaoA, avaliacaoP, avaliacaoS);

        System.out.println(avaliacoes + "\nMédia de notas: " + calculaMedia(avaliacoes));
    }
}