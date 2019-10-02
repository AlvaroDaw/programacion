/**
 * Ejercicio 19
 * Realiza un programa que nos diga cuantos digitos tiene un numero entero que puede ser
 * positivo o negativo. Se permite numeros de hasta 5 cifras
 * 
 * @author Alvaro Ramirez
 *
 */

import java.util.Scanner;
public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		
		System.out.println("Programa que calcula cuantos digitos tiene un numero: ");
		System.out.println("Introduce un numero (positivo o negativo de max. 5 cifras): ");
		x = Math.abs(s.nextInt());
		
		if(x < 10) {
			System.out.println("El numero "+x+" tiene 1 digito");
		}
		
		if(x < 100 && x >= 10) {
			System.out.println("El numero "+x+" tiene 2 digitos");
		}
		
		if(x < 1000 && x >= 100) {
			System.out.println("El numero "+x+" tiene 3 digitos");
		}
		
		if(x < 10000 && x >= 1000) {
			System.out.println("El numero "+x+" tiene 4 digitos");
		}
		
		if(x < 100000 && x >= 10000) {
			System.out.println("El numero "+x+" tiene 5 digitos");
		}
	s.close();
	}

}
