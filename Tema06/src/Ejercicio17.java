/**
 * Ejercicio 17
 * 
 * Realiza un programa que pinte por pantalla una pecera con pececito dentro. Se debe pedir al
 * usuario el ancho y alto de la pecera, que como minimo sera de 4 unidades. No hay que comprobar
 * que los datos se introducen correctamente podemos supone que el usuario lo introduce bien.
 * Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado
 * en cualquiera de las posiciones que quedan en el hueco que forma el rectangulo.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base,altura;
		int posicion = 0;
		
		
		System.out.println("Introduce la base de la pecera(min. 4): ");
		base = s.nextInt();
		
		System.out.println("Introduce la altura de la pecera(min. 4): ");
		altura = s.nextInt();
		
		int pez = (int)(Math.random()*(base-2)*(altura-2));
		
		for(int i = 0; i < base; i++) {
			System.out.print("X");
		}
		System.out.println();
		
		for(int i = 2; i < altura; i++) {
			System.out.print("X");
			for(int j = 2; j < base; j++) {
				if(posicion == pez) {
					System.out.print("&");
				}else {
					System.out.print(" ");
				}
				posicion++;
			}
			System.out.println("X");
		}
		
		for(int i = 0; i < base; i++) {
			System.out.print("X");
		}
		s.close();
	}

}
