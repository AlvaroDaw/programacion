/**
 * Ejercicio10
 * Realiza un conversor de Mb a Kb
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de Mb: ");
		int mb = s.nextInt();
		
		int kb = mb*1024;
		
		System.out.println(mb+"Mb son: "+kb+"Kb");
		s.close();
	}

}
