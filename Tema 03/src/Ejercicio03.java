/**
 * Ejercicio03
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de euros que se quiere convertir debe ser
 * introducida por teclado
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
		
		//Declarar la clase Scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de pesetas que quieres convertir: ");
		int pesetas = s.nextInt();
		double euros = (double)(pesetas/166.386);
		
		System.out.printf("%d pesetas son: %.2f€", pesetas, euros);
		s.close();
	}
	
}
