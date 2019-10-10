/**
 * Ejercicio 8
 * Muestra la tabla de multiplicar de un numero introducido por teclado.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int x = s.nextInt();
		
		for(int i = 0; i < 11; i++) {
			System.out.println(x+" * "+i+" = "+(x*i));
		}
		s.close();
	}

}
