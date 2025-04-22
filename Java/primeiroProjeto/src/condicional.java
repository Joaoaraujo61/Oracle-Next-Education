public class condicional {
    public static void main(String[] args){
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo");
        }else{
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar alocação");
        }
    }
}
