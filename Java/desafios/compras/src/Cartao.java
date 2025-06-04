import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private int limite;
    private int saldo;
    private List<Produto> compras;

    public Cartao(int limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public int getLimite() {
        return limite;
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
