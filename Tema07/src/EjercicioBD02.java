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
			for(int j = 0; j < 5; j++) {
				n[i][j] = s.nextInt();
			}
		}
		int columna,fila = 0;
		int sumafila = 0;
		int sumacolumna = 0;
		int sumatotal = 0;
		
		//Pinta tabla
		
		for(fila = 0; fila < 4; fila++) {
			sumafila = 0;
			sumacolumna = 0;
			
			for(columna = 0; columna <= 5; columna++) {	
				if(columna == 5) {
					System.out.printf("%-9d  ", sumafila);
				}else {
					System.out.printf("%-9d  ", n[fila][columna]);
					sumafila += n[fila][columna];
				}
				sumatotal += sumafila;
			}
			System.out.println();
			
		}
		
		for(columna = 0; columna < 5; columna++) {
			sumacolumna = 0;
			for(int i = 0; i < 4; i++) {
				sumacolumna += n[i][columna];
			}
			sumatotal += sumacolumna;
			System.out.printf("%-9d  ", sumacolumna);
			
		}
		System.out.printf("%-9d  ", sumatotal);
		//Fin tabla
		s.close();
		
		
	}

}
