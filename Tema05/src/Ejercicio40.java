/**
 * Ejercicio 40
 * 
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos. El programa
 * debe pedir la altura. Se debe comprobar que la altura sea un numero impar mayor o igual a 3,
 * en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int alturaIntroducida;
		boolean datos = true;
		
		System.out.println("Programa que pinta un rombo hueco.");
		
		do {
			System.out.println("Introduzca la altura del rombo: ");
			alturaIntroducida = s.nextInt();
			if((alturaIntroducida < 3) || (alturaIntroducida%2 == 0)) {
				System.out.println("Datos incorrectos.");
				datos = false;
			}else {
				datos = true;
			}
		}while(datos == false);
		
		int h = 1;
		int espacios = alturaIntroducida/2;
		int hueco = 1;
		
		while(h < alturaIntroducida) {
			//while parte de arriba
			while(h < alturaIntroducida/2+1) {
				for( int i = 0; i < espacios; i++) {
					System.out.print(" ");
				}
				System.out.print("X");
				for(int i = 0; i < hueco; i++) {
					System.out.print(" ");
				}
				if(h > 1) {
					System.out.print("X");
				}
				System.out.println();
				h++;
				espacios--;
				
				if(h > 2) {
				hueco+=2;
				}
			}
			//while parte de abajo
			while(h <= alturaIntroducida) {
				for(int i = 0; i < espacios; i++) {
					System.out.print(" ");
				}
				System.out.print("X");
				for(int i = 0; i < hueco; i++) {
					System.out.print(" ");
				}
				if(h != alturaIntroducida) {
					System.out.print("X");
				}
				System.out.println();
				h++;
				espacios++;
				hueco -= 2;
			}
		}
		s.close();
		
	}

}
