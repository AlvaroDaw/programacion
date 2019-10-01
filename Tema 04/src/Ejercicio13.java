/**
 * Ejercicio 13
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
int a,b,c,aux;
		
		System.out.println("Ordenar numeros de menor a mayor.");
		System.out.println("-----------------------------------");
		System.out.println("Introduce tres numeros.");
		System.out.print("a = ");
		a = s.nextInt();
		
		System.out.print("b = ");
		b = s.nextInt();
		
		System.out.print("c = ");
		c = s.nextInt();
		
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
			
		}
		
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
			
		}
		
		System.out.println("Los numeros ordenados de menor a mayor son: "+a+", "+b+", "+c+".");
		s.close();
			
	}

}
