/**
 * Ejercicio 14
 * 
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
 * intentará adivinar el numero que estas pensando- un numero entre 0 y 100 - teniendo 5
 * oportunidades. En cada intento fallido, el programa debe preguntar si el numero que estas
 * pensando es mayor o menor que el que te acaba de decir.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x;
		int mayor = 100;
		int menor = 0;
		int pista;
		int contador = 5;
		boolean numero = false;
		
		System.out.println("Piensa un numero, pulsa ENTER cuando lo tengas: ");
		
		do {
			x = (int)(Math.random()*(mayor - menor)+menor);
			
			System.out.println("El "+x+" es 1.Mayor 2.Menor 3.Igual: ");
			pista = s.nextInt();
			contador--;
			
			if(pista == 1) {
				menor = x+1;
			}else if(pista == 2) {
				mayor = x-1;
			}else {
				System.out.println("Toma! He acertado");
				numero = true;
			}
			
		}while(!numero && contador > 0);
		
		if(contador < 1 && !numero) {
			System.out.println("Me quedé sin intentos");
		}
		s.close();
	}

}
