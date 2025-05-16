import java.util.ArrayList;

import modelos.Animal;
import modelos.Cachorro;
import modelos.Circulo;
import modelos.ContaBancaria;
import modelos.Animal;
import modelos.Produto;
import modelos.Quadrado;

public class App {
   public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("joão");  
        nomes.add("mateus");
        nomes.add("marcos");
        nomes.add("pedro");

        /*for(String item:nomes){
            System.out.println(item);
        }*/
       //nomes.forEach(nome -> System.out.println(nome));
        nomes.forEach(System.out::println);

//--------------------------------------------------------------

        Cachorro cachorro = new Cachorro();
        if (cachorro instanceof Cachorro) {
            Animal cachorroAnimal = (Animal) cachorro; 
        }
    
//--------------------------------------------------------------

        Produto oHobbit = new Produto("O Hobbit", 39);
        Produto revolucaoDosBichos = new Produto("Revolucao dos bichos", 25);
        Produto oSenhorDaChuva = new Produto("O Senhor da Chuva", 46);

        ArrayList<Produto> listaLivros = new ArrayList<>();
        listaLivros.add(oHobbit);
        listaLivros.add(revolucaoDosBichos);
        listaLivros.add(oSenhorDaChuva);
        double soma = 0;

        for(int i = 0; i < listaLivros.size();i++){
            soma += listaLivros.get(i).getPreco();
        }

        
        double media = (double) soma/listaLivros.size();
            System.out.printf("Preço médio: R$%.2f", media);

//--------------------------------------------------------------

        Circulo circulo = new Circulo(5.3);
        Quadrado quadrado = new Quadrado(6.8);

        circulo.calcularArea();
        quadrado.calcularArea();

        System.out.printf("\nÁrea círculo: %.2f", circulo.getArea());
        System.out.printf("\nÁrea quadrado: %.2f\n", quadrado.getArea());

//--------------------------------------------------------------
        ContaBancaria contaJoao = new ContaBancaria(12345, 2005);
        ContaBancaria contaPedro = new ContaBancaria(19765, 807.4);
        ContaBancaria contaMateus = new ContaBancaria(13765, 6000);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(contaPedro);
        listaContas.add(contaJoao);
        listaContas.add(contaMateus);

        double maiorSaldo = listaContas.get(0).getSaldo();

        for(int i = 0; i < listaContas.size()-1; i++){
            if (listaContas.size()>1) {
                if (listaContas.get(i+1).getSaldo() > maiorSaldo) {
                    maiorSaldo = listaContas.get(i+1).getSaldo();
                }
            }else{
                System.out.println("Maior saldo: " + listaContas.get(0).getSaldo());
                break;
            }
        }
        System.out.println("Maior saldo: " + maiorSaldo);
            
    }
}
