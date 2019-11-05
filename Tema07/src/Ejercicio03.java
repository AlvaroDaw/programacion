/**
 * Ejercicio 03
 * 
 * Escribe un programa que lea 10 numeros por teclado y que luego los muestre en orden inverso, es
 * decir, el primero que se introduce es el ultimo en mostrarse y viceversa.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] numero = new int[10];
		
		System.out.println("Introduce 10 numeros enteros: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Introduce el nº"+(i+1)+": ");
			numero[i] = s.nextInt();
		}
		
		System.out.println("Los numeros mostrados al reves son: ");
		for(int i = 9; i >= 0; i--) {
			System.out.print(numero[i]+" ");
		}
		s.close();
	}

}
