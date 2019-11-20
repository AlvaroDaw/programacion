/**
 * Ejercicio 15
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int mesa[] = new int[10];
		int grupo = 0;
		
		for(int i = 0; i < 10; i++) {
			mesa[i] = (int)(Math.random()*5);
		}
		
		do {
		//Muestra la mesa 
		System.out.print(" Mesa nº   ");
		for (int i = 0; i < 10; i++) { 
			System.out.printf("│%5d ", i+1);
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print(" Ocupacion "); 
		for (int i = 0; i < 10; i++) {
			System.out.printf("│%5d ", mesa[i]);
			}
		System.out.println();
		//Fin de mesa 
		
		System.out.println("¿Cuantos son?(Introduce -1 para salir): ");
		grupo = s.nextInt();
		if(grupo > 4) {
			System.out.println("Lo siento, no admitimos grupos de 6, haga grupo de 4 personas maximo");
		}else if(grupo > 0) {
			int vacia = 0;
			boolean hayVacia = false;
			for(int i = 9; i >= 0; i--) {
				if(mesa[i] == 0) {
					vacia = i;
					hayVacia = true;
					}
				}
			if(hayVacia) {
				mesa[vacia] = grupo;
				System.out.println("Por favor, sientese en la mesa "+(vacia+1));
				}
			int hueco = 0;
			boolean hayHueco= false;
			for(int i = 9; i >= 0; i--) {
				if(mesa[i] + grupo <= 4) {
					hueco = i;
					hayHueco = true;
					}
				}
			if(hayHueco) {
				mesa[hueco] += grupo;
				System.out.println("Por favor, sientese en la mesa "+(hueco+1));
				}else {
					System.out.println("Lo siento, en estos momentos no quedan mesas.");
				}
			}
		}while(grupo != -1);
		s.close();

	}
}