import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Carro: "+ modelo);
        System.out.println(ano);
        System.out.println(cor);
    }
    int calculaIdade(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }
}
