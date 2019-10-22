/**
 * Ejercicio 28
 * 
 * Escribe un programa que calcule el factorial de un numero entero leido por teclado
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio28 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero para calcular su factorial: ");
		int numero = s.nextInt();
		
		int n = numero;
		
		for(int i = 1; i < numero; i++) {
			 n = n*i;
		}
		
		System.out.println(numero+"! = "+n);
		s.close();
	}

}
