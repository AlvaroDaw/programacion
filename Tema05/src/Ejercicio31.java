/**
 * Ejercicio 31
 * 
 * Realiza un programa que pinta la letra L por pantalla hecha con asteriscos. El programa pedira
 * la altura. El palo horizontal de la L tendra una longitud de la mitad (division entera entre 2)
 * de la altura mas uno.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio31 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Programa que pinta una L.");
		System.out.println("Introduce la altura: ");
		int altura = s.nextInt();
	
		//parte vertical
		for(int i= 1; i < altura; i++ ) {
			System.out.println("x");
		}
		//parte horizontal
		for(int i = 0; i < altura/2+1; i++ ) {
			System.out.print("x");
		}
		s.close();
	}

}
