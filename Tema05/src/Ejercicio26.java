/**
 * Ejercicio 26
 * 
 * Realiza un programa que pida un numero y a continuacion un digito. El programa nos debe dar
 * la posicion (o posiciones) contando de izquierda a derecha que ocupa ese digito en el numero
 * introducido
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio26 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduce un numero entero: ");
		int numero = s.nextInt();
		
		System.out.println("Indica un digito:");
		int digito = s.nextInt();
		
		int n = numero;
		int volteado = 0;
		int posicion = 1;
		
		System.out.println("El digito aparece en las siguientes posiciones: ");
		
		// Le da la vuelta al numero.
		while(n > 0) {
			volteado = (volteado * 10)+(n % 10);
			n /= 10;
		}
		
		//Con numero volteado, calculamos la posicion.
		while(volteado > 0) {
			if(volteado%10 == digito) {
				System.out.println("Posicion "+posicion);
			}
			posicion++;
			volteado /= 10;
		}
		s.close();
	}

}
