/**
 * Ejercicio 08
 * 
 * Escribe un programa que dada una posicion en el tablero de ajedrez, nos diga a que casillas
 * podria saltar un alfil que se encuentra en esa posicion. Como se indica en la figura, el alfil
 * se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican con
 * las letras de la "a" a la "h" y las filas se indican de 1 al 8.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class EjercicioBD08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("♝");
		String n[][] = new String[8][8];
		String fila = "";
		String espacio = "  ";
		
		System.out.println("Introduce la posicion del alfil: ");
		
		
		System.out.print("  ");
		for(int i = 0; i < 8; i++) {
			switch(i) {
			case 0:
				fila = "a ";
				break;
			case 1:
				fila = "b ";
				break;
			case 2:
				fila = "c ";
				break;
			case 3:
				fila = "d ";
				break;
			case 4:
				fila = "e ";
				break;
			case 5:
				fila = "f ";
				break;
			case 6:
				fila = "g ";
				break;
			case 7:
				fila = "h ";
				break;
			}
			System.out.print(fila);
		}
		System.out.println();
		for(int j = 7; j >= 0; j--) {
			System.out.print((j+1));
			for(int x = 0; x < 8; x++) {
				System.out.print(espacio);
			}
			System.out.println(j+1);
		}
		System.out.print("  ");
		for(int i = 0; i < 8; i++) {
			System.out.print((char)((int)'a'+i)+" ");
		}
		s.close();
		
	}

}
