/**
 * Ejercicio 39
 * 
 * Escribe un programa que pida un numero entero positivo por teclado y que muestre a continuacion
 * los numeros desde el 1 al numero introducido junto con su factorial.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio39 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero para calcular su factorial: ");
		int numero = s.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			int factorial = i;
			
			for(int j = 1; j < i; j++) {
				factorial *= j;
			}
			System.out.println(i+"! = "+factorial);
		}
		s.close();
		
	}

}
