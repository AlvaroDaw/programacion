/**
 * Ejercicio 20
 * Realiza un programa que diga si un numero entero positivo introducido por teclado es capicua.
 * Se permite de hasta 5 cifras.
 * 
 * @author Alvaro Ramirez
 *
 */

import java.util.Scanner;
public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		boolean capicua = false;
		
		System.out.println("Programa que calcula si un numero es capicua.");
		System.out.println("Introduce un numero ( Max. 5 cifras): ");
		x = s.nextInt();
		
		if(x < 10) {
			capicua = true;
		}
		
		if(x >= 10 && x < 100) {
			if(x/10 == x%10) {
				capicua = true;
			}
		}
		
		if(x >= 100 && x < 1000) {
			if(x/100 == x%10) {
				capicua = true;
			}
		}
		
		if(x >= 1000 && x < 10000) {
			if((x/1000 == x%10) && ((x/100)%10) == ((x/10)%10)) {
				capicua = true;
			}
		}
		
		if(x >= 10000 && x < 100000) {
			if((x/10000 == x%10) && ((x/1000)%10) == ((x/10)%10)) {
				capicua = true;
			}
		}
		
		if(capicua) {
			System.out.println("El numero es capicua");
		}else {
			System.out.println("El numero no es capicua");
		}
		
		s.close();
	}

}
