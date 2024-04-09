package util;

public abstract class Algoritmos {
	 public static int sumatorio(int num) {
			int suma=0;
			
			for(int i = 1; i<= num; i++) {
				suma+=i;
			}
			return suma;
		 }
	 
	 public static int factorial(int num2) {
		 int contador=1;
		 for(int i=1; i<=num2; i++) {
			 contador*=i;
		 }
		 
		 return contador;
	 }
}
