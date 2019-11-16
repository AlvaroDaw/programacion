/**
 * Ejercicio 8
 * 
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado
 * año y que muestre a continuacion un diagrama de barras horizontales con esos datos. Las barras
 * del diagrama se pueden dibujar a base de asteriscos o cualquier otro caracter.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int temperatura[] = new int[12];
		
		System.out.println("Introduce la temperatura media de cada mes.");
		
		for(int i = 1; i <= 12; i++) {
			System.out.println("Mes nº"+i+": ");
			temperatura[i-1] = s.nextInt();
		}
		System.out.println("------------------------------");
		
		for(int i = 0; i < 12; i++) {
			for( int j = temperatura[i]; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
