package modelos;

public class Circulo {
    private double PI = 3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularDiametro() {
        return 2 * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


