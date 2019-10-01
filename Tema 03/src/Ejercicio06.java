/**
 * Ejercicio06
 * Escribe un programa que calcule el area de un triangulo
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		
		//base * altura/2
		
		double b,h;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Calcular el area de un triangulo");
		System.out.println("Introduce la base: ");
		b = s.nextDouble();
		
		System.out.println("Introduce la altura: ");
		h = s.nextDouble();
		
		System.out.printf("El area del triangulo es: %.2f", (b*h)/2);
		s.close();
	}

}
