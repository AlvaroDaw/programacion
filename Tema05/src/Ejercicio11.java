/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
 * numeros enteros a partir de uno que se introduce por teclado.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce un numero: ");
		n = s.nextInt();
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("Numero: "+n+"	Cuadrado:	"+n*n+"	Cubo: "+n*n*n);
			n++;
		}
		s.close();
	}

}
