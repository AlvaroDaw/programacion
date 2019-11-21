/**
 * Ejercicio BD02
 * 
 * Escribe un programa que pida 20 numeros enteros. Estos numeros se deben introducir en un array
 * de 4 filas por 5 columnas. El programa mostrara las sumas parciales de filas y columnas igual
 * que si de una hoja de calculo se tratara. La suma total debe aparecer en la esquina inferior
 * derecha.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class EjercicioBD02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int [][] n = new int[4][5];
		
		System.out.println("Introduce 20 numeros enteros separados por INTRO.");
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; i < 5; i++) {
				n[i][j] = s.nextInt();
			}
		}
		
		
	}

}
