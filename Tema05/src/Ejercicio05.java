/**
 * Ejercicio 5
 * Muestra los numeros del 320 al 160 contando de 20 en 20 hacia atras
 * usando el bucle while
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 320;
		
		while(i >= 160) {
			System.out.print(i+", ");
			i-=20;
		}
		s.close();
	}

}
