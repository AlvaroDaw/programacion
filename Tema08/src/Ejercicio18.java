/**
 * Ejercicio 18
 * 
 * Escribe un programa que pase de decimal a binario
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero.");
		int decimal = s.nextInt();
		
		System.out.println(matematicas.varias.decimalABinario(decimal));
		s.close();
	}

}
