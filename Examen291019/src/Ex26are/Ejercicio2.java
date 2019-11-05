/**
 * Ejercicio 2
 * 
 * Implementa un programa que dibuje piramides de una altura que oscule entre 1 y 10, que vayan
 * orientadas a voluntad del usuario. (izq, der, arriba o abajo). Ademas, el programa pedira
 * dos caracteres  con los que pintar alternando la piramide.
 * 
 * @author Alvaro Ramirez Escribano
 */
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int altura;
		String caracter = "";
		String caracter2 = "";
		String orientacion = "";
		int espacio = 0;
		int h = 1;
		int i = 0;
		int longitud = 0;
		boolean datos = true;
		
		//Comprobar datos de altura
		do {
			System.out.println("Introduce la altura: ");
			altura = s.nextInt();
			if(altura > 10 || altura < 0) {
				System.out.println("Error.");
				datos = false;
			}else {
				datos = true;
			}
		}while(!datos);
		
		//Comprobar datos de orientacion
		do {
			System.out.println("Dime la orientacion: izquierda,arriba,derecha,abajo: ");
			orientacion = s.next();
			if(orientacion.equals("derecha")) {
				datos = true;
			}else if(orientacion.equals("izquierda")){
				datos = true;
			}else if(orientacion.equals("arriba")){
				datos = true;
			}else if(orientacion.equals("abajo")){
				datos = true;
			}else {
				datos = false;
			}
		}while(!datos);

		System.out.println("Introduce el caracter: ");
		caracter = s.next();
		
		System.out.println("Introduce el otro caracter: ");
		caracter2 = s.next();
		
		//Piramide hacia arriba.
		if(orientacion.equals("arriba")) {
		espacio = altura-1;
		
		while(h <= altura) {
			for(i = 0; i < espacio; i++) {
				System.out.print(" ");
			}
			for(i = 1; i < h*2 ; i++) {
				if(i%2 == 0) {
					System.out.print(caracter2);
				}else {
				System.out.print(caracter);
				}
			}
			System.out.println();
			espacio--;
			h++;
			}
		}
		//Termina piramide arriba
		//Piramide hacia abajo
		if(orientacion.equals("abajo")) {
			espacio = 0;
			longitud = altura*2;
			
			while(h <= altura) {
				
				for(i = 0; i < espacio; i++) {
					System.out.print(" ");
				}
				
				for(i = 1; i < longitud; i++) {
					if(i%2 == 0) {
						System.out.print(caracter2);
					}else {
					System.out.print(caracter);
					}
				}
				System.out.println();
				espacio++;
				longitud -= 2;
				h++;				
			}
		}
		//Termina piramide hacia abajo
		//Piramide hacia la derecha
		if(orientacion.equals("derecha")) {
			longitud = 1;
			h = altura*2 - 1;
			espacio = 0;
			
			while(h > 0) {
				
				while( longitud <= altura) {		
					for(i = 0; i < longitud; i++) {
						if(i%2 == 0) {
							System.out.print(caracter2);
						}else {
						System.out.print(caracter);
						}
					}
					System.out.println();
					h--;
					longitud++;
				}
					longitud = altura-1;;
				while(longitud > 0) {
					for(i = 0; i < longitud; i++) {
						if(i%2 == 0) {
							System.out.print(caracter2);
						}else {
						System.out.print(caracter);
						}
					}
					System.out.println();
					h--;
					longitud--;
				}
				
				
			}
		}
		//Termina piramide derecha
		//Empieza piramide izquierda
		if(orientacion.equals("izquierda")) {
		
			espacio = altura-1;
			longitud = 1;
			h = altura*2-1;
			
			while(h > 0) {
				while(longitud <= altura) {
					for(i = 0; i < espacio; i++) {
						System.out.print(" ");
					}
					
					for(i = 0; i < longitud;i++) {
						if(i%2 == 0) {
							System.out.print(caracter2);
						}else {
						System.out.print(caracter);
						}
					}
					System.out.println();
					espacio--;
					longitud++;
					h--;
				}
				espacio = 1;
				longitud = altura-1;
				while(h > 0) {
					for(i = 0; i < espacio; i++) {
						System.out.print(" ");
					}
					
					for( i = 0; i < longitud; i++) {
						if(i%2 == 0) {
							System.out.print(caracter2);
						}else {
						System.out.print(caracter);
						}
					}
					
					System.out.println();	
					h--;
					longitud--;
					espacio++;
				}
			}
			
		}
		s.close();
	}

}
