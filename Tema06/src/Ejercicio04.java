/**
 * Ejercicio 04
 * 
 * Muestra 20 numeros enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 * 
 * @author Alvaro Ramirez
 *
 */

public class Ejercicio04 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++) {
			System.out.print((int)(Math.random()*11)+" ");
		}
	}

}
