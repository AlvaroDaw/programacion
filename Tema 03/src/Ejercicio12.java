/**
 * Ejercicio12
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo examen
 * de la asignatura Programacion para obtener la media deseada. Hay que tener en cuenta
 * que la nota del primer examen cuenta el 40% y la del segunda examen 60%.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce la nota del primer examen: ");
		double n1 = s.nextDouble();
		System.out.println("Introduce la nota que desea sacar: ");
		double nf = s.nextDouble();
	
		double n2 = (((nf*100)-(n1*40))/60);
		
		System.out.printf("Para sacar un %.2f de media debe sacar un %.2f en el segundo examen", nf, n2);
		s.close();
	}

}
