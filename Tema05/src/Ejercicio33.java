/**
 * Ejercicio 33
 * 
 * Realiza un programa que pinta la letra U por pantalla hecha con asteriscos. El programa pedirá
 * la altura. Fijate que el programa inserta un espacio y pinta dos asteriscos menos en la base
 * para simular la curvatura de las esquinas inferiores.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio33 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce la altura de la U: ");
		int altura = s.nextInt();
		
		int h = 1;
		int espacio = altura -2;
		
		//Parte de arriba
		while(h < altura) {
			System.out.print("*");
			for(int i = 0; i < espacio; i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			h++;
		}
		
		//Parte de abajo
		System.out.print(" ");
		for(int i = 0; i < espacio; i++) {
			System.out.print("*");
		}
		System.out.print(" ");
		s.close();
	}

}
