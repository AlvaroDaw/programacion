/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una piramide hueca.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio20 {
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
			for(i = 1; i <= espacio; i++) {
				System.out.print(" ");
			}
			System.out.print(caracter);
			
			for(i = 1; i < (h*2)-2; i++) {
				if(h != altura) {
				System.out.print(" ");
				}else {
					System.out.print(caracter);
				}
			
			}
			if(h != 1) {
			System.out.print(caracter);
			}
			
			System.out.println();
			espacio--;
			h++;
		}
		s.close();
	}

}
