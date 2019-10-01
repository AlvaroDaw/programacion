/**
 * Ejercicio 09
 * Realiza un programa que resuelva una ecuacion de segundo grado
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio09 {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		

		System.out.println("Este programa resuelve ecuaciones de segundo grado.");
		System.out.println("ax2 + bx + c = 0");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Por favor, introduzca los valores.");
		
		System.out.print("a = ");
		double a;
		a = s.nextDouble();
		
		System.out.print("b = ");
		double b;
		b = s.nextDouble();
		
		System.out.print("c = ");
		double c;
		c = s.nextDouble();
		
		if ((a == 0) && (b == 0) && (c == 0)) {
			System.out.println("Error. Infinitos resultados.");
    }
		
		if ((a == 0) && (b == 0) && (c != 0)) {
			System.out.println("Error. No existe solucion.");
    }
		
		if ((a != 0) && (b != 0) && (c == 0)) {
			System.out.println("x1 = 0");
			System.out.println("x2 = " + (-b / a));
    }
		
		if ((a == 0) && (b != 0) && (c != 0)) {
			System.out.println("x1 = x2 = " + (-c / b));
    }

		if ((a != 0) && (b != 0) && (c != 0)) {	
				
			double discriminante = b*b - (4 * a * c);
			
			if (discriminante < 0) {
					System.out.println("Error. La ecuacion no tiene soluciones reales");
			}	else {
        System.out.println("x1 = " + (b*(-1) + Math.sqrt(discriminante))/(2*a));
        System.out.println("x2 = " + (b*(-1) - Math.sqrt(discriminante))/(2*a));
      }
    }
		s.close();
	}

}
