/**
 * Ejercicio 6
 * Muestra los numeros del 320 al 160 contando de 20 en 20 hacia atras
 * usando el bucle do-while
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 320;
		
		do {
			System.out.print(i+", ");
			i-=20;
		}while(i >= 160);
		s.close();
	}

	
}
