/**
 * Ejercicio 29
 * 
 * Escribe un programa que muestre por pantalla todos los numeros enteros positivos menores
 * a uno leido por teclado que no sean divisibles entre otro tambien leido de igual forma
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio29 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int num1 = s.nextInt();
		
		System.out.println("Introduce el segundo numero entero: ");
		int num2 = s.nextInt();
		
		for(int i = num1; i > 0; i--) {
			if(i%num2 != 0) {
				System.out.print(i+" ");
			}
		}
		s.close();
	}

}
