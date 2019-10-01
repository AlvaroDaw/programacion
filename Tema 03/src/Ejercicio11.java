/**
 * Ejercicio 11
 * Realiza un conversor de Kb a Mb
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de Kb: ");
		int kb = s.nextInt();
		
		int mb = kb/1024;
		
		System.out.println(kb+"kb son: "+mb+"mb");
		s.close();
	}

}
