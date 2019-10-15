/**
 * Realiza un programa que sume los 100 numeros siguientes a un numero entero y positivo introducido
 * por teclado. Se debe comprobar que el dato introducido es correcto (que es numero positivo).
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		int suma = 0;
		
		System.out.println("Introduce un numero entero y positivo: ");
		n = s.nextInt();
		
		for(int i = 0; i < 100; i++) {
			suma += n;
			n++;
		}
		System.out.println("La suma total es: "+suma);
		s.close();
	}

}
