/**
 * Ejercicio 01
 * Escribe un programa que pida por teclado un dia de la semana y diga que asignatura toca a primera hora
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dia;
		String nombAsig ="";
		
		System.out.println("Introduce un dia de la semana: ");
		dia = s.nextInt();
		
		switch(dia) {
			case 1:
				nombAsig = "ED";
				break;
			case 2:
				nombAsig = "Programacion";
				break;
			case 3:
				nombAsig = "LM";
				break;
			case 4:
				nombAsig = "Programacion";
				break;
			case 5:
				nombAsig = "FOL";
				break;
			default:
					System.out.println("Introduce un dia valido.");
					
		}
		
		System.out.println("El dia "+dia+" hay "+nombAsig);
		
		s.close();
	}

}
