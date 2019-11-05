/**
 * Ejercicio 41
 * 
 * Escribe un programa que diga cuantos digitos pares y cuantos digitos impares hay dentro de un
 * numero. Se recomienda usar long en lugar de int ya que el primero admite numeros mas largos
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero positivo:");
		long numero = s.nextLong();
		
		long n = numero;
		int pares = 0;
		int impares = 0;
		
		while( n != 0) {
			int digito = (int)n%10;
			if(digito%2 == 0) {
				pares++;
			}else {
				impares++;
			}
			n /= 10;
		}	
		System.out.println("El numero "+numero+" tiene "+pares+" pares y "+impares+" impares");
		s.close();
	}

}
