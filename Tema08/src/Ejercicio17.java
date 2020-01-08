/**
 * Ejercicio 17
 * 
 * Escribe un programa que pase de binario a decimal
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int binario;
		int n = 0;
		
		System.out.println("Programa que pasa de binario a decimal, introduce un numero:");
		binario = s.nextInt();
		
		int digitos = matematicas.varias.digitos(binario);
		
		for(int i = 0; i < digitos; i++) {
			n += matematicas.varias.digitoN(binario, digitos-i) * matematicas.varias.potencia(2, i);
		}
		
		System.out.println(n);
		s.close();
	}

}
