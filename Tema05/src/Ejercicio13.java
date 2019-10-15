/**
 * Escribe un programa que lea una lista de diez numeros y determine cuantos son positivos,
 * y cuantos son negativos.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int neg = 0;
		int pos = 0;
		
		System.out.println("Introduce 10 numeros negativos o positivos: ");
		
		for(int i=0; i < 10; i++) {
		int n = s.nextInt();
		if( n >= 0) {
			pos++;
		} else if (n < 0) {
			neg ++;
			}
		}
		System.out.println("Has introducido "+pos+" numeros positivos y "+neg+" numeros negativos.");
		s.close();
	}

}
