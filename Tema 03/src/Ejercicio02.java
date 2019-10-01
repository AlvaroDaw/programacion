/**
 * Ejercicio02
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir
 * debe ser introducida por teclado
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		
		//Declarar clase Scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros que quiere convertir: ");
		double euros = s.nextDouble();	//Declaramos directamente la variable aqui
		
		System.out.println(euros+"€ son: "+(int)(166.386*euros)+" pesetas");
		s.close();
	}

}
