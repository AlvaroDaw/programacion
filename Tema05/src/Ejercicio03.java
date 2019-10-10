/**
 * Ejercicio 3
 * Muestra los multiplos de 5 a 100 utilizando el bucle do while
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int i = 0;
	
	do {
		System.out.print(i+", ");
		i+=5;
	} while(i <= 100);
	
	s.close();
}


}
