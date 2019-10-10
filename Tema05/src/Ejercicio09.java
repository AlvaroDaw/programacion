/**
 * Ejercicio 9
 * Realiza un programa que nos diga cuantos digitos tiene un numero introducido por teclado.
 * Este ejercicio es equivalente a otro realiza anteriormente, con la salvedad de que el anterior
 * estaba limitado a numeros de 5 cifras como maximo. En esta ocasion, hay que realizar el ejercicio
 * utilizando bucles; de esta manera, la unica limitacion en el numero de digitos la establece el 
 * tipo de dato que se utilice (int O long).
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,r;
		int cont = 1;
		System.out.println("Introduce un numero: ");
		x = s.nextInt();
		r = x;
		
		while(r>10) {
			r /= 10;
			cont++;
		}
		
		System.out.println("El numero "+x+" tiene: "+cont+" digitos.");
		s.close();
	}

}
