/**
 * Ejercicio 38
 * 
 * Realiza un programa que pinte un reloj de arena relleno de asteriscos. El programa debe 
 * pedir la altura. Se debe comprobar que la altura sea un numero impar mayor o igual que 3,
 * en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio38 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int alturaIntroducida;
		boolean datos = true;
		
		System.out.println("Programa que pinta un reloj de arena.");
		
		do {
			System.out.println("Introduzca la altura del reloj: ");
			alturaIntroducida = s.nextInt();
			if((alturaIntroducida < 3) || (alturaIntroducida%2 == 0)) {
				System.out.println("Datos incorrectos.");
				datos = false;
			}else {
				datos = true;
			}
		}while(datos == false);
		
		int h = 1;
		int espacios = 0;
		int longitud = alturaIntroducida;
		
		while(h < alturaIntroducida) {
			//while parte de arriba
			while(h < alturaIntroducida/2+1) {
				for(int i = 0; i < espacios; i++) {
					System.out.print(" ");
				}
				for(int i = 0; i < longitud; i++) {
					System.out.print("*");
				}
				System.out.println();
				h++;
				espacios++;
				longitud -= 2;
			}
			
			//while parte de abajo
			while(h <= alturaIntroducida) {
				for(int i = 0; i < espacios; i++) {
					System.out.print(" ");
				}
				for(int i = 0; i < longitud; i++) {
					System.out.print("*");
				}
				System.out.println();
				h++;
				espacios--;
				longitud += 2;
			}
			s.close();
		}
	}

}
