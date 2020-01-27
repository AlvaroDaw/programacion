/**
 * Prueba las clases Vehiculo, Coche y Bicicleta
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Coche cochePrueba = new Coche();
		Bicicleta bicicletaPrueba = new Bicicleta();
		
		int opcion;
		
		do {
			System.out.println("Vehiculos: ");
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la Bicicleta");
			System.out.println("6. Ver kilometraje del Coche");
			System.out.println("7. Ver kilometraje Total");
			System.out.println("8. Salir");
			System.out.println("Elige una opción: ");
			opcion = s.nextInt();
			
			if(opcion == 1) {
				System.out.println("Cuantos kilometros?");
				int km = s.nextInt();
				bicicletaPrueba.recorre(km);
				System.out.println("Has andado "+km+" Km");
			}else if(opcion == 2) {
				bicicletaPrueba.hazElCaballito();
			}else if(opcion == 3) {
				System.out.println("Cuantos kilometros?");
				int km = s.nextInt();
				cochePrueba.recorre(km);
			}else if(opcion == 4) {
				cochePrueba.quemaRueda();
			}else if(opcion == 5) {
				System.out.println("Has recorrido "+Bicicleta.getKilometrosBicicleta()+" km con la Bicicleta");
			}else if(opcion == 6) {
				System.out.println("Has recorrido "+Coche.getKilometrosCoche()+" km con el Coche");
			}else if(opcion == 7) {
				System.out.println("Has recorrido "+Vehiculo.getkilometrosTotales()+" km en total");
			}
			
		}while(opcion != 8);
		
	}

}
