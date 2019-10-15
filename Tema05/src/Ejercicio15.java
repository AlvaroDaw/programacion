/**
 * Escribe un programa que dados dos numeros, uno real (base) y un entero positivo (exponente) 
 * saque por pantalla todas las potencias con base el numero dado y exponente entre uno y el
 * exponente introducido. No se deben utilizar funciones de exponentacion. Por ejemplo, si 
 * introducimos el 2 y el 5, se deberan mostrar 2^1, 2^2, 2^3, 2^4 y 2^5
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int b;
		int exp;
		int potencia = 1;
		
		System.out.println("Introduce la base: ");
		b = s.nextInt();
		
		System.out.println("Introduce el exponente");
		exp = s.nextInt();
		
		for (int i = 1; i <= exp; i++) {
			potencia *= b;
			System.out.println(b+"^"+i+"="+potencia);
		}
		s.close();
	}

}
