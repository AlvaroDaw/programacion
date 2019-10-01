/**
 * Ejercicio04
 * Escribe un programa que sume, reste, multiplique y divida dos numeros introducidos por teclado
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros separados por Enter: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		
		System.out.println("La suma de ambos numeros es: "+(a+b));
		System.out.println("La resta de ambos numeros es: "+(a-b));
		System.out.println("La division de ambos numeros es: "+(double)a/b);
		System.out.println("La multiplicacion de ambos numeros es: "+(a*b));
		s.close();
	}

}
