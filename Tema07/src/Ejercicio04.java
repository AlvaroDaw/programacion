/**
 * Ejercicio 04
 * 
 * Define tres arrays con 20 numeros enteros cada una, con nombres numero, cuadrado y cubo. Carga
 * el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar
 * los cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar
 * los cubos de los valores que hay en numero. A continuacion, muestra el contenido de los tres
 * arrays dispuesto en tres columnas.
 * 
 * @author Alvaro Ramirez
 *
 */

public class Ejercicio04 {
	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for(int i = 0; i < 20; i++) {
			numero[i] = (int)(Math.random()*101);
			cuadrado[i] = numero[i]*numero[i];
			cubo[i] = cuadrado[i]*numero[i];
		}
		
		System.out.println("Programa que calcula cuadrado y cubos de 20 numeros aleatorios.");
		System.out.printf("%-15s %-15s %-15s \n", "Numero","Cuadrado", "Cubo");
		
		for(int i = 0; i < 20; i++) {
			System.out.printf("%-15d %-15d %-15d \n", numero[i], cuadrado[i], cubo[i]);
		}
		
	}

}
