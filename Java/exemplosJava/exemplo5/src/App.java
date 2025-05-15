import java.util.ArrayList;

import modelos.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa joao = new Pessoa();
        Pessoa pedro = new Pessoa();

        joao.setIdade(19);
        joao.setNome("João");
        pedro.setIdade(18);
        pedro.setNome("Pedro");

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>(); 
        listaDePessoas.add(pedro);
        listaDePessoas.add(joao);
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(1).getNome());;

        System.out.println(listaDePessoas.toString());
    }
}
