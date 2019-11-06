/**
 * Ejercicio 11
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la 
 * forma suspenso, suficiente, bien, notable o sobresaliente. Al final aparecera el numero de
 * suspensos, el numero de suficientes, el numero de bienes etc
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		int x;
		
		for(int i = 1; i <= 20; i++) {
			x = (int)(Math.random()*11);
			System.out.print("Nota "+i+": "+x+" ");
			
			switch(x) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				suspenso++;
				System.out.print("Suspenso");
				break;
			case 5:
			case 6:
				bien++;
				System.out.print("Bien");
				break;
			case 7:
			case 8:
				notable++;
				System.out.print("Notable");
				break;
			case 9:
			case 10:
				sobresaliente++;
				System.out.print("Sobresaliente");
				break;
				default:
					;
			}
			System.out.println();
			
		}
		System.out.println("---------------------------------------");
		System.out.println("Hay "+suspenso+" suspensos.");
		System.out.println("Hay "+suficiente+" suficientes.");
		System.out.println("Hay "+bien+" bien.");
		System.out.println("Hay "+notable+" notables.");
		System.out.println("Hay "+sobresaliente+" sobresaliente.");
		
	}
}
