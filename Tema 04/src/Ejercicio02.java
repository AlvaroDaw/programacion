/**
 * Ejercicio 02
 * Realiza un programa que pida la hora por teclado y luego muestre buenos dias, tardes o noche segun la hora.
 * Se utilizaran los tramos de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente. Solo se tienen en cuenta las horas,
 * los minutos no se deben introducir por teclado
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Introduce la hora: ");
		hora = s.nextInt();
		
		if(hora >= 6 && hora <= 12) {
			System.out.println("Buenos dias.");
		}else if(hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes.");
		}else if(hora >= 21 && hora <= 24) {
			System.out.println("Buenas noches.");
		}else if(hora >= 0 && hora <= 5) {
			System.out.println("Buenas noches.");
		}else {
			System.out.println("La hora introducida no es correcta.");
	}
		s.close();
	}

}
