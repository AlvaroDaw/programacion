/**
 * Ejercicio 05
 * Realiza un programa que resuelva una ecuacion de primer grado.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio05 {
	public static void main(String[] args) {
double a,b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un número para 'a' y 'b': ");
		a = s.nextDouble();
		b = s.nextDouble();
		
		if (a == 0) {
			System.out.println("____________________________________");
			System.out.println("El número 'a' no puede ser 0");
		}
		if (b < 0) {
			System.out.println("____________________________________");
			System.out.println("El número 'b' no puede ser negativo");
		} else {
			System.out.println("____________________________________");
			System.out.println("x = "+ (-b/a));
			
		}
		s.close();
	}

}
