/**
 * Ejercicio 36
 * 
 * Escribe un programa que diga si un numero es capicua. Los numeros capicua se leen igual
 * hacia delante que hacia atras. El programa debe aceptar numeros de cualquier longitud siempre 
 * que lo permita el tipo, en caso contrario el ejercicio no se dara por bueno. Se recomienda usar 
 * long en lugar de int ya que el primero admite numeros mas largos.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio36 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero positivo: ");
		long numero = s.nextLong();
		
		long n = numero;
		long volteado = 0;
		boolean capicua = false;
		
		//voltear numero
		while(n > 0) {
			volteado = (volteado * 10)+(n % 10);
			n /= 10;
		}
		//Comprobamos numeros		
		if(volteado == numero) {
			capicua = true;
		}
		
		if(capicua) {
		System.out.println("El "+numero+" es capicua");
		}else {
			System.out.println("El "+numero+" no es capicua");
		}
		s.close();
	}

}
