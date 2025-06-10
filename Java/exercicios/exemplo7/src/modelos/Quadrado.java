package modelos;

public class Quadrado implements Forma{
    private double lado;
    private double area;
    
    public Quadrado(double lado){
        this.lado =lado;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getArea(){
        return area;
    }
    
    @Override
    public void calcularArea(){
        setArea(lado*lado);
    }
}
