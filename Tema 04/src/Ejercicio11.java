/**
 * Ejercicio 11
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar
 * a la medianoche.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int h,m;
		
		System.out.println("Introduzca la hora: ");
		h = s.nextInt();
		
		System.out.println("Introduzca los minutos: ");
		m = s.nextInt();
		
		int seg = h*3600 + m*60;
		
		System.out.println("Quedan "+(86400 - seg)+" segundos para la medianoche");
		s.close();
	}

}
