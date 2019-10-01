/**
 * Ejercicio09
 * Escribe un programa que calcule el volumen de un cono usando la formula
 * V = 1/3*3.1415*r*r/h
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio09 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce la altura y el radio del cono separado por Enter: ");
		double h = s.nextDouble();
		double r = s.nextDouble();
		
		double v = (3.1415*r*r*h)/3;		//Formula para calcular el volumen
		
		System.out.printf("El volumen del cono introducido es: %.2f", v);
		s.close();
	}

}
