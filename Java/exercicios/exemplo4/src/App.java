import br.com.alura.spotifyApp.modelos.CalculadoraSalaRetangular;
import br.com.alura.spotifyApp.modelos.ConversorMoeda;
public class App {
    public static void main(String[] args) throws Exception {
        ConversorMoeda conversor = new ConversorMoeda();

        System.out.println(conversor.converterDolarParaReal(105.55));

        CalculadoraSalaRetangular calculoSala = new CalculadoraSalaRetangular();

        System.out.println("Área: " + calculoSala.calcularArea(10, 14));
        System.out.println("Perímetro: " + calculoSala.calcularPerimetro(10, 14));
    }
}
