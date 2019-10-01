/**
 * Ejercicio08
 * Escribe un programa que calcule el salario semanal de un empleado en base a las horas
 * trabajadas, a razon de 12 euros la hora
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce las horas trabajadas esta semana: ");
		int h = s.nextInt();
		
		System.out.println("Por "+h+" horas trabajadas le corresponde: "+h*12+"€");
		s.close();
	}

}
