/**
 * Ejercicio 12
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
 * se mostrará el contenido de ese array junto al indice (0-9). Seguidamente el programa pedirá dos
 * posiciones a las que llamaremos "inicial" y "final". Se debe comprobar que inicial es menos que
 * final y que ambos numeros estan entre 0 y 9. El programa deberá colocar el numero de la posicion
 * inicial en la posicion final, rotando el resto de numeros para que no se pierda ninguno. Al final
 * se debe mostrar el array resultante
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero[] = new int[10];
		int inicial;
		int fin;
		boolean datos = false;
		
		System.out.println("Introduce 10 numeros enteros separados por INTRO");
		for(int i = 0; i < 10; i++) {
			numero[i] = s.nextInt();
		}
		
		//Tabla para array
		System.out.print(" Índice ");
		for (int i = 0; i < 10; i++) { 
			System.out.printf("│%7d ", i);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.print(" Valor  "); 
		for (int i = 0; i < 10; i++) {
			System.out.printf("│%7d ", numero[i]);
			}
		System.out.println();
		//Fin de tabla array
		
		do {
		System.out.println("Introduce el valor inicial:");
		inicial = s.nextInt();
		
		System.out.println("Introduce el valor final (Mayor que el inicial):");
		fin = s.nextInt();
		
		if(inicial < fin) {
			datos = true;
		}else {
			System.out.println("Error, los valores no son correctos.");
			datos = false;
			}
		}while(!datos);
		
		int aux;
		
		//rota el array las posiciones que se indiquen
		for(int j = inicial; j < fin; j++) {
			aux = numero[9];
			for(int i = 9; i > 0; i--) {
				numero[i] = numero[i-1];
			}
			numero[0] = aux;
		}
		
		//Tabla para array resultante
				System.out.print(" Índice ");
				for (int i = 0; i < 10; i++) { 
					System.out.printf("│%7d ", i);
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------------------");
				System.out.print(" Valor  "); 
				for (int i = 0; i < 10; i++) {
					System.out.printf("│%7d ", numero[i]);
					}
				System.out.println();
				//Fin de tabla array
	
				s.close();
	}

}
