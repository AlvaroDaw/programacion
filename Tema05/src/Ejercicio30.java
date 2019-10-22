/**
 * Ejercicio 30
 * 
 * Realiza un programa que calcule las horas transcurridas entre dos horas de dos dias de la semana.
 * No se tendran en cuenta los minutos ni los segundos. El dia de la semana se puede pedir como
 * un numero (1-7) o como una cadena (de "lunes" a "domingo"). Se debe comprobar que el usuario
 * introduce los datos correctamente y que el segundo dia es posterior al primero.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio30 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean datos = true;
		
		//Recogida de datos de dia
		System.out.println("Dia de la semana(1-7): ");
		int dia1 = s.nextInt();
		
		System.out.println("Hora: ");
		int hora1 = s.nextInt();
		
		System.out.println("Dia del segundo dia de la semana(1-7): ");
		int dia2 = s.nextInt();
		
		System.out.println("Hora: ");
		int hora2 = s.nextInt();
		
		//Comprobacion de datos
		if(dia1 < 0 || dia1 > 7) {
			System.out.println("Dia de la semana incorrecto. Solo validos 1-7");
			datos = false;
		}
		
		if(hora1 < 0 || hora1 > 23) {
			System.out.println("Hora incorrecta. Solo valida 0-23");
			datos = false;
		}
		
		if(dia2 < 0 || dia2 > 7) {
			System.out.println("Dia de la semana incorrecto. Solo validos 1-7");
			datos = false;
		}
		
		if(hora2 < 0 || hora2 > 23) {
			System.out.println("Hora incorrecta. Solo valida 0-23");
			datos = false;
		}
		
		if(dia1 > dia2) {
			System.out.println("El dia 1 no puede ser mayor que el dia 2.");
			datos = false;
		}
		
		//Salida de datos
		if(datos) {
		System.out.println("Entre las "+hora1+":00 del dia "+dia1+" y las "+hora2+":00 del dia 2 hay: ");
		System.out.println((dia2*24+hora2)-(dia1*24+hora1)+" horas");
		s.close();
		}
	}

}
