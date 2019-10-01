/**
 * Ejercicio01
 * Realiza un programa que pida dos numeros y que luego muestre el resultado de su multiplicacion
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;			//Hay que importar la clase Scanner para poder usarla
public class Ejercicio01 {
	public static void main(String[] args) {
		
		//Declarar la clase Scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros separados por enter: ");
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("La multiplicacion de "+a+" * "+b+" es: "+a*b);
		s.close();
		
	}
	
}