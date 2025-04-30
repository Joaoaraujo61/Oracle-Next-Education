public class Main {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.olaMundo();

        Calculadora novaCalculadora = new Calculadora();
        System.out.println(novaCalculadora.retornaDobro(5));

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Unholy Wars";
        minhaMusica.artista = "ANGRA";
        minhaMusica.anoLancamento = 2001;

        minhaMusica.exibeFicha();
        minhaMusica.avaliaMusica(4);
        minhaMusica.avaliaMusica(6);
        minhaMusica.avaliaMusica(8);
        minhaMusica.exibeMediaAvaliacao();

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Siena";
        meuCarro.ano = 2015;
        meuCarro.cor = "Preto";

        meuCarro.exibeFichaTecnica();
        System.out.println(meuCarro.calculaIdade());

        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 19;

        aluno1.exibeInfoAluno();
    }
}
