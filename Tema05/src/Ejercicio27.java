/**
 * Ejercicio 27
 * 
 * Escribe un programa que muestre, cuente y sume los multiplos de 3 que hay entre 1 y un
 * numero leido por teclado
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();
		
		System.out.println("Los multiplos de 3 entre 1 y "+n+" son los siguientes: ");
		
		int contador = 0;
		int suma = 0;
		
		for(int i = 2; i < n; i++) {
			if(i%3 == 0) {
				System.out.print(i+" ");
				contador++;
				suma += i;
			}
		}
		System.out.println();
		System.out.println("Hay "+contador+" multiplos de 3 y en total suman "+suma);
		s.close();
	}

}
