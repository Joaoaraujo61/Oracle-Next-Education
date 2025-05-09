package modelos;

public class ConversorMoeda implements ConversaoFinaceira{
    @Override
    public double converterDolarParaReal(double valorDolar){
        return valorDolar/5.66;
    }
}
