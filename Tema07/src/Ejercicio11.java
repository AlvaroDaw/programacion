/**
 * Ejercicio 11
 * 
 * Realiza un programa que pida 10 numeros por teclado y que los almacene en un array. A continuación
 * se mostrará el contenido de ese array junto al indice (0-9) utilizando para ello un tabla. 
 * Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de 
 * numeros(los que no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int n[] = new int[10];
		int aux[] = new int[10];
		int primos = 0;
		boolean esPrimo = true;
		
		System.out.println("Introduce 10 numeros enteros separados por INTRO.");
		
		for(i = 0; i < 10; i++) {
			n[i] = s.nextInt();
		
		
			//Comprobar si un numero es primo
			esPrimo = true;
			for(j = 2; j < n[i]; j++) {
			
				//If para ordenar los primos a la izquierda en el array aux
				if(n[i] % j == 0) {
					esPrimo = false;
				}
			}
		
			if(esPrimo) {
				aux[primos] = n[i];
				primos++;
			}
		}
		
		//If para ordenar el array
		
		//Tabla para array
		System.out.println("\n\nArray original:"); 
		System.out.println("\n┌────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐");
		System.out.print("│ Índice ");
		for (i = 0; i < 10; i++) { 
			System.out.printf("│%8d ", i);
		}
		System.out.println("│\n├────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤"); 
		System.out.print("│ Valor  "); 
		for (i = 0; i < 10; i++) {
			System.out.printf("│%8d ", n[i]);
			}
		System.out.println("│\n└────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
		//Fin de tabla array
		System.out.println();
		
		//Comprobar si un numero es primo
		for(i = 0; i < 10; i++) {
			esPrimo = true;
			for(j = 2; j < n[i]; j++) {
				
				//If para ordenar los primos a la izquierda en el array aux
				if(n[i] % j == 0) {
					esPrimo = false;
				}
			}
			if(!esPrimo) {
				aux[primos] = n[i];
				primos++;
			}
		}
		//Tabla para array resultante
		System.out.println("\n\nArray resultante:"); 
		System.out.println("\n┌────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐");
		System.out.print("│ Índice ");
		for (i = 0; i < 10; i++) { 
			System.out.printf("│%8d ", i);
		}
		System.out.println("│\n├────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤"); 
		System.out.print("│ Valor  "); 
		for (i = 0; i < 10; i++) {
			System.out.printf("│%8d ", aux[i]);
			}
		System.out.println("│\n└────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
		//Fin de tabla array
		s.close();
		}
		
	}

