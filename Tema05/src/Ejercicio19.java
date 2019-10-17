/**
 * Realiza un programa que pinte una piramide por pantalla. La altura se debe pedir por teclado.
 * El caracter con el que se pinta la piramide tambien se debe pedir por teclado.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio19 {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		int altura;
		String caracter = "";
		int h = 1;
		int i = 0;
		
		System.out.println("Introduce la altura: ");
		altura = s.nextInt();
		
		System.out.println("Introduce el caracter: ");
		caracter = s.next();
		
		int espacio = altura-1;
		
		while(h <= altura) {
			for(i = 0; i < espacio; i++) {
				System.out.print(" ");
			}
			for(i = 1; i < h*2 ; i++) {
				System.out.print(caracter);
			}
			System.out.println();
			espacio--;
			h++;
		}
		s.close();
		
	}			
}
