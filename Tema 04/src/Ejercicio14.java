/**
 * Ejercicio 14
 * Realiza un programa que que diga si un numero introducido por teclado es par y/o 
 * divisible entre 5
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.println("Introduce un numero para ver si es par y/o divisible entre 5: ");
		a = s.nextInt();
		
		if(a%2 == 0) {
			System.out.println("Este numero es par.");
		} 
		
		if (a%5 == 0) {
			System.out.println("Este numero es divisible entre 5");
		} 
		s.close();
		
	}

}
