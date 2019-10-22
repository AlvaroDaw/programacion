/**
 * Ejercicio 25
 * Realiza un programa que pida un numero por teclado y que luego muestre ese numero
 * al reves
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int numero = s.nextInt();
		
		int n = numero;
		int volteado = 0;
		
		while(n > 0) {
			volteado = (volteado * 10)+(n % 10);
			n /= 10;
		}
		
		System.out.println("El numero introducido al reves es: "+volteado);
		s.close();
	}

}