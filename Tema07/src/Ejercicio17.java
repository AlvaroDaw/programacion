/**
 * Ejercicio 17
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n[] = new int[10];
		boolean datos = false;
		int numero;
		
		for(int i = 0; i < 10; i++) {
			n[i] = (int)(Math.random()*101);
		}
		
		//Muestra el array 
				System.out.print(" Indice ");
				for (int i = 0; i < 10; i++) { 
					System.out.printf("│%3d ", i);
				}
				System.out.println();
				System.out.println("----------------------------------------------------------");
				System.out.print(" Valor  "); 
				for (int i = 0; i < 10; i++) {
					System.out.printf("│%3d ", n[i]);
					}
				System.out.println();
				//Fin de array 
		
		System.out.println();
		do {
			System.out.println("Introduce un numero que este dentro del array: ");
			numero = s.nextInt();
			for (int c : n) {
				if (c == numero) {
				datos = true;
				}
			}
			if(!datos) {
				System.out.println("Ese numero no está en el array.");
			}
		}while(!datos);
		
		while(n[0] != numero) {
			int aux = n[9];
			for(int i = 9; i > 0; i--) {
				n[i] = n[i-1];
			}
			n[0] = aux;
		}
		
		//Muestra el array 
		System.out.print(" Indice ");
		for (int i = 0; i < 10; i++) { 
			System.out.printf("│%3d ", i);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.print(" Valor  "); 
		for (int i = 0; i < 10; i++) {
			System.out.printf("│%3d ", n[i]);
			}
		System.out.println();
		//Fin de array 
		s.close();
	}
}
