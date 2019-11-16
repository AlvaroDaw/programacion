/**
 * Ejercicio 13
 * 
 * Escribe un programa que rellene un array de 100 elementos con numeros enteros aleatorios
 * comprendidos entre 0 y 500 ambos incluidos. A continuación el programa mostrara el array 
 * y preguntara si el usuario quiere destacar el maximo o minimo. Seguidamente se volvera a 
 * mostrar el array escribiendo el numero destacado entre doble asteriscos.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero[] = new int [100];
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		int linea = 0;
		int dato;
		
		for(int i = 0; i < 100;i++) {
			numero[i] = (int)(Math.random()*501);
			if(linea == 20) {
				linea = 0;
				System.out.println();
			}
			System.out.print(numero[i]+" ");
			linea++;
			//Almacena el maximo y el minimo
			if(numero[i] > maximo) {
				maximo = numero[i];
			}else if(numero[i] < minimo) {
				minimo = numero[i];
			}
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Que quieres destacar? 1 = minimo, 2 = maximo:");
		dato = s.nextInt();
		int destacado;
		
		if(dato == 1) {
			destacado = minimo;
		}else {
			destacado = maximo;
		}
		
		for(int i = 0; i < 100;i++) {
			if(linea == 20) {
				linea = 0;
				System.out.println();
			}
			if(numero[i] == destacado) {
				System.out.print("**"+destacado+"** ");
			}else {
			System.out.print(numero[i]+" ");
			}
			linea++;
		}
		s.close();
	}

}
