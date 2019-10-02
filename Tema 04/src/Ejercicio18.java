/**
 * Ejercicio 18
 * Escribe un programa que diga cual es la primera cifra de un numero entero introducido
 * por teclado. Se permite numeros de hasta 5 cifras.
 * 
 * @author Alvaro Ramirez
 *
 */

import java.util.Scanner;
public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		
		System.out.println("Programa que calcula la primera cifra: ");
		System.out.println("Introduzca un numero (Max. 5 cifras): ");
		x = s.nextInt();
		
		if(x >= 10000 && x < 100000) {
			System.out.println(x/10000);
		}
		else if(x >= 1000 && x < 10000) {
			System.out.println(x/1000);
		}
		else if(x >= 100 && x < 1000) {
			System.out.println(x/100);
		}
		else if(x >= 10 && x < 100) {
			System.out.println(x/10);
		}
		else if(x >=0 && x < 10) {
			System.out.println(x);
		}
		s.close();
	}

}
