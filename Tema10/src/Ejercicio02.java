import java.util.ArrayList;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		int suma = 0;
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		int tamaño = (int)(Math.random()*11+10);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 0; i < tamaño; i++) {
			a.add((int)(Math.random()*101));
		}
		
		System.out.println("Lista generada: "+a);
		
		for(int n : a) {
			suma += n;
			
			if(n > maximo) {
				maximo = n;
			}
			
			if(n < minimo) {
				minimo = n;
			}
		}
		
		System.out.println("La suma total es: "+suma);
		System.out.println("El maximo es: "+maximo);
		System.out.println("El minimo es : "+minimo);
		System.out.println("La media es: "+(suma/tamaño));
		
		
	}

}
