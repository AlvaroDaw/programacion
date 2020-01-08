/**
 * Ejercicio 15
 * 
 * Muestra los numeros primos que hay entre 1 y 1000
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		
		System.out.println("Muestra los numeros primos entre 1 y 1000.");
		
		for(int i = 1; i <= 1000; i++) {
			if(matematicas.varias.esPrimo(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
