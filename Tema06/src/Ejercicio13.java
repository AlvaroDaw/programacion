/**
 * Ejercicio 13
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando 
 * los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,y;
		
		System.out.println("Para empezar a tirar los dados pulsa ENTER: ");
		s.nextLine();
		
		System.out.printf("%5s  %5s \n", "Dado1","Dado2");
		do {
			x = (int)(Math.random()*6+1);
			y = (int)(Math.random()*6+1);
			System.out.printf("%-5d  %-5d \n", x,y);
			
		}while(x != y);
		
		s.close();
	}

}
