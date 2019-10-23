/**
 * Ejercicio 35
 * 
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se
 * debe comprobar que la altura sea un numero impar mayor o igual a 3, en caso contrario se debe
 * mostrar un mensaje de error.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int alturaintroducida;
		int altura = 1;
		int espacios = 0;
		
		//Repetimos captura de datos hasta que altura sea impar y > 3
				do {
				System.out.println("Introduce la altura del reloj de arena: ");
				alturaintroducida = s.nextInt();
					if(alturaintroducida %2 == 0 || alturaintroducida < 3) {
						System.out.println("Error. El valor debe ser impar y mayor de 3");
				}
				}while(alturaintroducida %2 == 0 || alturaintroducida < 3);
				
		int relleno = alturaintroducida-2;
		
		//Parte de arriba
		//Espacios
		while(altura <= alturaintroducida/2+1) {
			for(int i = 0; i < espacios; i++) {
				System.out.print(" ");
			}
			
			if(altura != alturaintroducida) {
			System.out.print("X");
			}
			
			//Espacios del centro
			for(int i = 0; i < relleno; i++) {
				System.out.print(" ");
			}
			
			if(altura != alturaintroducida/2+1) {
			System.out.print("X");
			}
			
			System.out.println();
			relleno -= 2;
			espacios++;
			altura++;
		}
		//Parte de abajo
		relleno = 1;
		espacios = alturaintroducida/2-1;
		altura = 1;
		//Espacios
		while(altura <= alturaintroducida/2) {
			for(int i = 0; i < espacios; i++) {
				System.out.print(" ");
			}
		System.out.print("X");
		
		//Espacios del centro
		for(int i = 0; i < relleno; i++) {
			System.out.print(" ");
		}
		System.out.print("X");
		System.out.println();
		altura++;
		relleno += 2;
		espacios--;
		}
		s.close();
	}

}
