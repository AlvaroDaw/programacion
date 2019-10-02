/**
 * Ejercicio 21
 * Calcula la nota de un trimestre de la asignatura Programacion. El programa pedira las dos
 * notas que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles
 * da un numero mayor o igual a 5, el alumno esta aprobado y se mostrara la media. En caso de que
 * la media sea un numero menos que 5, el alumno habra tenido que hacer el examen de recuperacion
 * que se califica como apto o no apto, por tanto se debe preguntar al usuario, ¿ Cual ha sido el
 * resultado de la recuperacion? (apto/no apto). Si el resultado de la recuperacion es apto, la nota
 * sera un 5; en caso contrario, se mantiene la nota media anterior.
 * 
 * @author Alvaro Ramirez
 *
 */

import java.util.Scanner;
public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n1,n2,nm;
		String rec = "";
		
		System.out.println("Calcula nota de programacion: ");
		System.out.println("Primero introduzca la nota de los dos examenes: ");
		System.out.print("Examen nº1: ");
		n1 = s.nextDouble();
		
		System.out.print("Examen nº2: ");
		n2 = s.nextDouble();
		
		nm = (n1 + n2)/2;
		
		if(nm >= 5) {
			System.out.println("Tu nota media es: "+nm);
			System.out.println("Estas aprobado.");
		}
		else if(nm < 5) {
			System.out.println("Cual ha sido el resultado de la recuperacion?: apto/no apto");
			rec = s.next();
			
			if(rec == "apto") {
				System.out.println("Tu nota media es un 5.");
			} else if(rec == "no apto") {
				System.out.println("Estas suspenso. Tu nota media es "+nm);
			}
		}
		
	}

}
