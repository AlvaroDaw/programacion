/**
 * Escribe un programa que lea un numero n e imprima una piramide de numeros con n filas
 * como en la figura.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce altura:");
		int altura = s.nextInt();

		int h = 1;
		int i = 0;
		int espacios = altura -1;

		while(h <= altura) {
			
			for (i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}
			
			for(i = 1; i < h; i++) {
				System.out.print(i);
			}
			
			for(i = h; i > 0; i--) {
				System.out.print(i);
			}
			System.out.println();
			h++;
			espacios--;
		}
		s.close();
	}

}
