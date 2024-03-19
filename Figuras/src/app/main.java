package app;

import modelos.Rectángulo;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Rectángulo r1=new Rectángulo(4,2); 
		Rectángulo r2= new Rectángulo(2,1);
		System.out.println("El perimetro del rectangulo 1 es "+r1.CalcularPerimetro());
		System.out.println("El area del rectangulo 1 es "+r1.getArea());
		System.out.println("El perimetro del rectangulo 2 es "+r2.CalcularPerimetro());
		System.out.println("El area del rectangulo 2 es "+r2.getArea());
	}

}
