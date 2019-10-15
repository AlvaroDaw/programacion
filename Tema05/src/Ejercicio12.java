/**
 * Escribe un programa que muestre los n primeros terminos de la serie de Fibonacci. El primer termino de la serie
 * de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendriamos que
 * los terminos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El numero n se debe introducir por teclado.
 *
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		int c = 0;
		int b = 1;
		
		System.out.println("Introduce la cantidad de numero que tendra la serie fibonacci: ");
		int n = s.nextInt();
		
		System.out.print("Las primeras cifras de la serie son: 0, 1, ");
		
		for (int i=0; i<n; i++) {
			c = a+b;
			System.out.print(c+", ");
			a = b;
			b = c;
		}
		s.close();
	}

}
