/**
 * Ejercicio05
 * Escribe un programa que calcule el area de un rectangulo 
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio05 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca la altura y base del rectangulo separados por Enter: ");
		int altura = s.nextInt();
		int base = s.nextInt();
		
		System.out.println("El area del rectangulo es: "+(altura*base));
		s.close();
	}

}
