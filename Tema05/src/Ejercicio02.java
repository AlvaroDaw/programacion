/**
 * Ejercicio 2
 * Muestra los multiplos de 5 a 0 utilizando el bucle while
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i = 0;
		
		System.out.println("Multiplos de 5 de 0 a 100 con bucle while.");
		System.out.println("------------------------------------------");
		
		while (i <= 100) {
			System.out.print(i+", ");
			i+=5;
		}
		s.close();
	}


}
