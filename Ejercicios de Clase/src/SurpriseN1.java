/**Ejercicio 1 Surprise
 * 
 * @author Alvaro Ramirez
 */

import java.util.Scanner;
public class SurpriseN1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int alturaintroducida;
		int incremento;
		int espacios = 0;
		int altura = 1;
		
		//Repetimos captura de datos hasta que altura sea impar y > 3
		do {
		System.out.println("Introduce la altura del reloj de arena: ");
		alturaintroducida = s.nextInt();
			if(alturaintroducida %2 == 0 || alturaintroducida < 3) {
				System.out.println("Error. El valor debe ser impar y mayor de 3");
		}
		}while(alturaintroducida %2 == 0 || alturaintroducida < 3);
		
		System.out.println("Con que caracter quieres pintar el reloj?: ");
		String caracter = s.next();
		
		//Repetimos captura de datos hasta que incremento sea par	
		do {
		System.out.println("Introduce el incremento:");
		incremento = s.nextInt();
			if(incremento %2 != 0) {
				System.out.println("Error. El valor debe ser par.");
		}
		}while(incremento % 2 != 0);
		
		
		System.out.println("Introduzca la cantidad de veces que quiere dibujar el reloj: ");
		int cantidad = s.nextInt();
		
		int relleno = alturaintroducida;
		
		
			//while para cantidad de relojes que se tienen que dibujar
			while(cantidad != 0) {
				
			//parte de arriba//	
			while(altura < alturaintroducida /2+1) {
				//espacios
				
				for (int i = 1; i <= espacios; i++) {
					System.out.print(" ");
				}
				//inserta caracter
				for (int i = 0; i < relleno; i++) {
					System.out.print(caracter);
				}
				
				System.out.println();
				altura++;
				espacios++;
				relleno -= 2;
				
			}	//while parte de arriba
			
			//parte de abajo
			espacios = alturaintroducida / 2;
			altura = 1;
			
			while(altura <= alturaintroducida /2+1) {
				//espacios
				for (int i = 1; i <= espacios; i++) {
					System.out.print(" ");
				}
				
				//pinta caracter
				for (int i = 0; i < relleno; i++) {
					System.out.print(caracter);
				}
				
				System.out.println();
				altura ++;
				espacios --;
				relleno += 2;
			}//while parte de abajo
			
			//volver valores a original para pintar mas relojes sin que se deformen
			System.out.println();
			cantidad--;
			altura = 1;
			alturaintroducida += incremento;
			relleno = alturaintroducida;
			espacios = 0;
			}
		s.close();
		}
	}
