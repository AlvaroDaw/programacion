/**
 * Ejercicio 1
 * Muestra los numeros multiplos de 5 de 0 a 100 utilizando el bucle for
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Multiplos de 5 de 0 a 100 con bucle for.");
		System.out.println("----------------------------------------");
		
		for (int i = 0; i <= 100; i++) {
			System.out.print(i+", ");
			i+=4;
		}
		s.close();
	}

}
