/**
 * Ejercicio 37
 * 
 * Realiza un conversor del sistema decimal al sistema de "palotes"
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio37 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero positivo: ");
		int numero = s.nextInt();
		
		long n = numero;
		long volteado = 0;
		int longitud = 0;
		
		//voltear numero
		while(n > 0) {
			volteado = (volteado * 10)+(n % 10);
			n /= 10;
			longitud++;
			}
		
		int cifra = 0;
		
		for(int i = 0; i < longitud; i++) {
			cifra = (int)(volteado%10);
			volteado /= 10;
			for(int j = 0; j < cifra; j++) {
				System.out.print("|");
			}
			if(i < longitud-1) {
				System.out.print("-");
			}
			s.close();
		}
				
	}

}
