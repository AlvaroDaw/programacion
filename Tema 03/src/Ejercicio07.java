/**
 * Ejercicio07
 * Escribe un programa que calcule el total de una factura a partir de la base imponible
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio07 {
	public static void main(String[] arg) {
		double euros;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce factura para calcular IVA: ");
		euros = s.nextDouble();
		
		double iva = euros * 1.21;
		
		System.out.printf("La factura total es: %.2f€",iva);
		s.close();
		
	}

}
