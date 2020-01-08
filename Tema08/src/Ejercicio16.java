/**
 * Ejercicio 16
 * 
 * Muestra los numeros capicua que hay entre 1 y 99999
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		System.out.println("Muestra los numeros capicua entre 1 y 99999.");
		
		for(int i = 1; i < 99999; i++) {
			if(matematicas.varias.esCapicua(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
