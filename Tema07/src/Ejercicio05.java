/**
 * Ejercicio 5
 * 
 * Escribe un programa que pida 10 numeros por teclado y que luego nos muestre los numeros
 * introducidos junto con las palabras "maximo" y "minimo" al lado del maximo y del minimo.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero [] = new int[10];
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce nº"+(i+1)+"= ");
			numero[i] = s.nextInt();
			if(numero[i] > maximo) {
				maximo = numero[i];
			}
			if(numero[i] < minimo) {
				minimo = numero[i];
			}
		}
		System.out.println("--------------------------------------");
		
		for(int i = 0; i < 10; i++) {
			if(numero[i] == maximo) {
				System.out.println(maximo+" Max");
			}else if(numero[i] == minimo) {
				System.out.println(minimo+" Min");
			}else {
				System.out.println(numero[i]);
			}
		}
		s.close();
		
	}

}
