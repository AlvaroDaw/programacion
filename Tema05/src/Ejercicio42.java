/**
 * Ejercicio 42
 * 
 * Escribe un programa que pida un numero entero positivo por teclado y que muestre a continuacion
 * los 5 numeros consecutivos a partir del numero introducido. Al lado de cada numero se debe indicar
 * si se trata de un primo o no.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio42 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero positivo: ");
		int numero = s.nextInt();
		
		boolean esPrimo = true;
		
		for(int n = numero; n < numero+5; n++) {
			
		//Comprueba si es primo
		esPrimo = true;
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				esPrimo = false;
				}
			}
		
		//Muestra por pantalla si es primo
		if(esPrimo) {
			System.out.println(n+" es primo");
		}else {
			System.out.println(n+" no es primo");
		}
		}
		System.out.println();
		s.close();
	}

}
