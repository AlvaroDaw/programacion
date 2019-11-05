/**
 * Ejercicio 1
 * 
 * Implementa un programa que dibuje verticalmente en consola un gusano. El gusano sera dibujado 
 * interactivamente segun la voluntad del usuario, a razon de un caracter por linea, mediante el
 * control de las siguientes instrucciones:
 * Tecla J: El gusano se mueve hacia la izquierda en la siguiente linea
 * Tecla K: El gusano se queda en la misma posicion en la siguiente linea
 * Tecla L: El gusano se mueve hacia la derecha en la siguiente linea
 * 
 * El gusano siempre empezara en la parte izquierda de la consola y no podra ir mas de 10 posiciones
 * hacia la derecha, en el caso de que sucediera el programa detectara la ultima letra como una K.
 * 
 * @author Alvaro Ramirez Escribano
 */

import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este programa dibuja un gusano en la pantalla.");
		System.out.println("Controles: j-izquierda, k-abajo, l-derecha (seguido de ENTER");
		System.out.println("Para salir, pulse 's'");
		
		String x = "";
		int espacios = 0;
		boolean error = true;
		do {
			for(int i = 0; i < espacios; i++) {
				System.out.print(" ");
			}
			
			System.out.print("X 					¿j,k,l,s?:");
			x = s.next();
			
			if(x.equals("j")) {
				if(espacios > 0) {
					espacios--;
				}
			}
			
			
			if(x.equals("l")) {
				if(espacios < 10) {
					espacios++;
				}
			}
			
			if(x.equals("s")) {
				error = false;
			}else {
				x.equals("k");
			}
			
			System.out.println();
			
			
			
		}while(error);
		s.close();
	}

}
