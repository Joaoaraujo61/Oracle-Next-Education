import app.ContaBancaria;
public class Main {
    public static void main(String[] args) throws Exception {
        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.setNumeroConta(45);
        minhaConta.setSaldo(3005);

        System.out.println(minhaConta.getNumeroConta());
        System.out.println(minhaConta.getSaldo());
    }
}
