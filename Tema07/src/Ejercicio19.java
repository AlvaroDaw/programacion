/**
 * Ejercicio 19
 * 
 * Realiza un programa que sea capaz de insertar un numero en una posicion concreta de un array.
 * En primer lugar, el programa generará un array de 12 numeros enteros aleatorios entre 0 y 200
 * ambos incluidos. A continuacion se debe mostrar el contenido de ese array junto al indice 0-11
 * Seguidamente el programa preguntara por el numero que se quiere insertar y por la posicion donde
 * sera insertado. Los numeros del array se desplazan a la derecha para dejar sitio al nuevo. El
 * ultimo numero (el que se encuentra en la posicion 11) siempre se perdera.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n[] = new int[12];
		int numero;
		int posicion;
		
		for(int i = 0; i < 12; i++) {
			n[i] = (int)(Math.random()*201);
		}
		
		//Muestra el array 
		System.out.print(" Indice ");
		for (int i = 0; i < 12; i++) { 
			System.out.printf("│%4d ", i);
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print(" Valor  "); 
		for (int i = 0; i < 12; i++) {
			System.out.printf("│%4d ", n[i]);
			}
		System.out.println();
		//Fin de array
		
		System.out.println();
		System.out.println("Introduce el numero que quiere insertar:");
		numero = s.nextInt();
		
		System.out.println("Introduce la posicion donde quiere insertarlo: ");
		posicion = s.nextInt();
		
		for(int i = 11; i >= posicion; i--) {
			n[i] = n[i-1];
			if(i == posicion) {
				n[i] = numero;
			}
		}
		
		//Muestra el array 
		System.out.print(" Indice ");
		for (int i = 0; i < 12; i++) { 
			System.out.printf("│%4d ", i);
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print(" Valor  "); 
		for (int i = 0; i < 12; i++) {
			System.out.printf("│%4d ", n[i]);
			}
		System.out.println();
		//Fin de array
		s.close();
	}

}
