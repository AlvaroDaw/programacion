/**
 * Ejercicio 08
 * Amplia el programa anterior para que diga la nota del boletin (insuficiente, suficiente...)
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
double a,b,c;
		
		System.out.println("Introduce las tres notas para calcular la media:");
		
		System.out.print("a = ");
		a = s.nextDouble();
		
		System.out.print("b = ");
		b = s.nextDouble();
		
		System.out.print("c = ");
		c = s.nextDouble();
		
		double media = (a+b+c)/3;
		
		System.out.printf("La media de las tres notas es %.2f \n", media);
		
		if (media <5) {
			System.out.println("Tu nota es 'insuficiente'.");
		}
		
		if ((media <6) && (media >= 5)) {
			System.out.println("Tu nota es 'aprobado'.");
			
		if ((media >= 6) && (media <7)) {
			System.out.println("Tu nota es 'bien'. ");
		}
		
		if ((media >= 7) && (media <9)) {
			System.out.println("Tu nota es 'notable'. ");
		}
		
		if ((media >= 9) && (media <= 10)) {
			System.out.println("Tu nota es 'sobresaliente'. ");
		}
		s.close();
		}
	}
}

