/**
 * Ejercicio 20
 * 
 * Implementa un programa que calcule la denominacion ordinal de los reyes de una secuencia
 * historica. El programa solicitara la cantidad de reyes que se van a introducir, y a continuacion
 * recibira los nombres de los reyes. Presentar� por pantalla dichos nombres, pero colocandoles el
 * ordinal correspondiente. Asi, por ejemplo, en los nombres de los reyes, el primero deberia 
 * aparecer como Felipe 1� y el segundo como Felipe 2�.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el numero total de reyes: ");
		int n = s.nextInt();
		
		String reyes[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nombre rey n�"+(i+1)+": ");
			reyes[i] = s.next();
		}
		
		System.out.println("---------------");
		for(int i = 0; i < n; i++) {
			int orden = 1;
			
			for(int j = 0; j < i; j++) {
				if(reyes[i].equals(reyes[j])) {
					orden++;
				}
			}
			System.out.println(reyes[i]+" "+orden+"�");
		}
		s.close();
	}

}
