/**
 * ArrayDeAlumnoPrincipal.java
 * Programa que prueba un array de la clase Alumno
 * @author Alvaro
 *
 */
import java.util.Scanner;
public class ArrayDeAlumnoPrincipal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Define la estructura, un array de 5 alumnos pero no crea los objetos
		Alumno[] alum = new Alumno[5];
		
		//Pide los datos del alumno
		System.out.println("A continuacion introduce el nombre y nota media de 5 alumnos");
		
		String nombreIntroducido;
		double notaIntroducida;
		
		for(int i = 0; i <5; i++) {
			alum[i] = new Alumno();
			
			System.out.println("Alumno "+i);
			
			System.out.print("Nombre: ");
			nombreIntroducido = s.next();
			(alum[i]).setNombre(nombreIntroducido);
			
			System.out.print("Nota media: ");
			notaIntroducida = s.nextDouble();
			(alum[i]).setNotaMedia(notaIntroducida);
		}
		
		System.out.println("Los datos introducidos son los siguientes:");
		
		double sumaDeMedias = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Alumno "+i);
			System.out.println("Nombre: "+alum[i].getNombre());
			System.out.println("Nota Media: "+alum[i].getNotaMedia());
			System.out.println("-------------------------------------");
			sumaDeMedias += alum[i].getNotaMedia();
		}
		
		System.out.println("La media global de la clase es: "+sumaDeMedias/5);
	}

}
