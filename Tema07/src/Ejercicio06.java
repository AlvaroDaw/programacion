/**
 * Ejercicio 6
 * 
 * Escribe un programa que lea 15 numeros del teclado y que los almacene en un array. Rota los
 * elementos de ese array, es decir, el elemento de la posicion 0 debe pasar a la posicion 1,
 * el de la 1 a la 2, etc. El numero que se encuentra en ultima posicion debe pasar a la posicion 0.
 * Finalmente, muestra el contenido del array.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero[] = new int[15];
		
		System.out.println("Programa que rota un array");
		
		for(int i = 0; i < 15; i++) {
			System.out.println("Introduce nº"+(i+1)+": ");
			numero[i] = s.nextInt();
		}
		System.out.println("----------------");
		System.out.println("Array rotado:");
		
		int aux= numero[14];
		
		for(int i = 14; i > 0; i--) {
			numero[i] = numero[i-1];
		}
		numero[0] = aux;
		
		for(int i = 0; i < 15; i++) {
			System.out.print(numero[i]+" ");
		}
		s.close();
		
	}

}
 