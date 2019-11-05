/**
 * Ejercicio 01
 * 
 * Define un array de 12 numeros enteros con nombre num y asigna los valores segun la tabla que
 * se muestra a continuacion. Muestra el contenido de todos los elementos del array. ¿Que sucede
 * con los valores de los elementos que no han sido inicializados?
 * R: Los valores no inicializados se muestran como 0
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int[] x = new int[12];
		
		x[0] = 39;
		x[1] = -2;
		x[4] = 0;
		x[6] = 14;
		x[8] = 5;
		x[9] = 120;
		
		for(int i = 0; i < 12; i++) {
			System.out.print(x[i] + " | ");
		}
		s.close();
		
	}

}
