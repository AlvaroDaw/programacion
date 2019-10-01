/**
 * Ejercicio 03
 * Escribe un programa en que dado un numero del 1 al 7 escribe el correspondiente nombre del dia de la semana
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		String dia = "";
		
		System.out.println("Introduce un numero del 1 al 7: ");
		num = s.nextInt();
		
		switch(num) {
		case 1:
			dia = "Lunes";
			break;
			
		case 2:
			dia = "Martes";
			break;
			
		case 3:
			dia = "Miercoles";
			break;
			
		case 4:
			dia = "Jueves";
			break;
			
		case 5:
			dia = "Viernes";
			break;
			
		case 6:
			dia = "Sabado";
			break;
			
		case 7:
			dia = "Domingo";
			break;
		}
		System.out.println(dia);
		s.close();
	}

}
