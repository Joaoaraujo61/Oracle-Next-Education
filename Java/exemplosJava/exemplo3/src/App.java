import modelos.Carro;
import modelos.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.setModelo("Fiat Idea");
        carro.setPrecoPrimeiroAno(40000);
        carro.setPrecoSegundoAno(39000);
        carro.setPrecoTerceiroAno(51000);

        System.out.println("O preço médio do " + carro.getModelo() + " é: R$ " + carro.calculaPrecoMedio() + ",00");
        System.out.println("O menor preço foi R$ " + carro.menorPreco());
        System.out.println("O menor preço foi R$ " + carro.maiorPreco());

        Gato gatin = new Gato();

        System.out.println(gatin.emitirSom());
    }
}
