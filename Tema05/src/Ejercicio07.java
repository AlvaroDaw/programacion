/**
 * Ejercicio 7
 * Realiza el control de acceso a una caja fuerte. La combinacion será un numero de 4 cifras.
 * El programa nos pedira una combinacion para abrirla. Si no acertamos dirá " Lo siento, esa
 * no es la combinacion" y si acertamos se nos dirá " La caja fuerte se ha abierto satisfactoriamente
 * Tendremos 4 oportunidades para abrir la caja fuerte
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int pass = 1010;
		int i = 0;
		int intentos = 4;
		
		do {
			System.out.println("Introduzca la combinacion: ");
			i = s.nextInt();
			if(i == pass) {
				System.out.println("La caja se ha abierto satisfactoriamente.");
			}else {
				System.out.println("Lo siento. La combinacion no es correcta.");
				intentos --;
			}
		}while( i != pass && intentos > 0);
		
		s.close();
		
		
	}

}
