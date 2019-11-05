/**
 * Ejercicio 44
 * 
 * Escribe un programa que sea capaz de insertar un digito dentro de un numero indicando la
 * posicion. El nuevo digito se colocara en la posicion indicada y el resto de digitos se
 * desplazara hacia la derecha. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos. Se recomienda usar long
 * en lugar de int ya que permite numeros largos
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio44 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un numero entero: ");
		long numero = s.nextLong();
		
		System.out.println("Introduzca la posicion donde quiere insertar: ");
		long posicion = s.nextLong();
		
		System.out.println("Introduce el digito que quiere insertar: ");
		long digito = s.nextLong();
		
		long longitud = 0;
		long n = numero;
		
		while(n > 0) {
			n /= 10;
			longitud++;
		}
		
		long pi = numero / (long)(Math.pow(10, longitud - posicion+1));
		pi = pi * 10 + digito;
		
		long pd = numero % (long)(Math.pow(10, longitud - posicion +1));
		numero = pi * (long)(Math.pow(10, longitud - posicion +1))+pd;
		
		System.out.println("El numero es: "+numero);
		s.close();
	}

}
