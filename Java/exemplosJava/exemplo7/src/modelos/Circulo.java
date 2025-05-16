package modelos;

public class Circulo implements Forma{
    private double raio;
    private double area;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getArea(){
        return area;
    }

    @Override
    public void calcularArea(){
        double areaCirculo = 3.14*(raio*raio);
        setArea(areaCirculo);
    }
}
