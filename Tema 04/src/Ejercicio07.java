/**
 * Ejercicio 07
 * Realiza un programa que calcule la media de tres notas
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("Introduzca las tres notas separadas por Enter: ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		double media = (a+b+c)/3;
		
		System.out.printf("La media es: %.2f", media);
		s.close();
	}

}
