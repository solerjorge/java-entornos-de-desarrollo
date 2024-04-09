package util;

public abstract class Algoritmos {
	 public static int sumatorio(int num) {
			int suma=0;
			
			for(int i = 1; i<= num; i++) {
				suma+=i;
			}
			return suma;
		 }
}
