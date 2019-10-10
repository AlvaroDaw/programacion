/**
 * Ejercicio 10
 * Escribe un programa que calcule la media de un conjunto de numeros positivos introducidos
 * por teclado. A priori, el programa no sabe cuantos se introduciran. El usuario indicara que ha
 * terminado de introducir los datos cuando meta un numero negativo.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int media = 0;
		int n = 0;
		int suma = 0;
		
		System.out.println("Introduzca todos los numeros que quiera, introduce uno negativo para acabar: ");
		
		while( n >= 0 ) {
			n = s.nextInt();
			
			if(n > 0) {
			media++;
			suma += n;
			}
			
		}
		System.out.println("La media es: "+(suma/media));
		s.close();
		
	}


}
