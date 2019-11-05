/**
 * Ejercicio 43
 * 
 * Escribe un programa que permite partir de un numero introducido por teclado en dos partes. 
 * Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario
 * introduce correctamente los datos, es decir, el numero introducido tiene dos digitos como minimo
 * y la posicion en la que se parte el numero esta entre 2 y la longitud del numero. No se permite
 * en este ejercicio el uso de funciones de manejo de String.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio43 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero positivo: ");
		long numero = s.nextInt();
		
		System.out.println("Posicion por la que quiere partir el numero: ");
		long posicion = s.nextLong();
		
		long n = numero;
		int longitud = 0;
		
		while(n > 0) {
			n /= 10;
			longitud++;
			}
		
		long pi = numero/(long)(Math.pow(10, longitud - posicion +1));
		long pd = numero%(long)(Math.pow(10, longitud - posicion +1));
		
		System.out.println("El numero partido es "+pi+" y "+pd);
		s.close();
	}

}
