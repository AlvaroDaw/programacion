/**
 * Escribe un programa que diga si un numero introducido por teclado es o no primo. Un numero
 * primo es aquel que solo es divisible entre el mismo y 1.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		boolean primo = true;
		
		System.out.println("Introduce un numero para saber si es primo o no.");
		n = s.nextInt();
		
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				primo = false;
			}
		}
		
		if(primo) {
			System.out.println("El numero introducido es primo.");
		} else {
			System.out.println("El numero introducido no es primo.");
		}
		s.close();
	}

}