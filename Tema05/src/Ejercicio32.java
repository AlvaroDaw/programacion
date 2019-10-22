/**
 * Ejercicio 32
 * 
 * Escribe un programa que, dado un numero entero positivo, diga cuales son y cuanto suman los
 * digitos pares. Los digitos pares se deben mostrar en orden, de izquierda a derecha. Usa long
 * en lugar de int  donde sea necesario para admitir numeros largos
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio32 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero positivo");
		long numero = s.nextInt();
		
		long n = numero;
		long volteado = 0;
		int longitud = 0;
		
		if(numero == 0) {
			longitud = 1;
		}
		
		while(n > 0) {
			volteado = (volteado * 10)+(n % 10);
			n /= 10;
			longitud++;
		}
		
		System.out.println("Los digitos pares son: ");
		
		int digito = 0;
		int suma = 0;
		
		for(int i = 0; i < longitud; i++) {
			digito = (int)(volteado%10);
			if(digito%2 == 0) {
				System.out.print(digito+" ");
				suma += digito;
			}
			volteado /= 10;
		}
		System.out.println();
		System.out.println("La suma total de pares es: "+suma);
		s.close();
	}

}
