/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule
 * la potencia
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b;
		int exp;
		int potencia = 1;
		
		System.out.println("Introduce la base: ");
		b = s.nextInt();
		
		System.out.println("Introduce el exponente: ");
		exp = s.nextInt();
		
		for(int i = 0; i < exp; i++) {
			potencia *= b;
		}
		System.out.println("La potencia es: "+potencia);
		s.close();
	}

}
