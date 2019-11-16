/**
 * Ejercicio 10
 * 
 * Escribe un programa que genere 20 numeros aleatorios entre 0 y 100 y que los almacene en un
 * array. El programa debe ser capaz de pasar todos los numeros pares a las primeras posiciones del
 * array (del 0 en adelante) y todos los numeros impares a las celdas restantes. Utiliza arrays
 * auxiliares si es necesario.
 * 
 * @author Usuario
 *
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		int numero[] = new int[20];
		int aux[] = new int[20];
		int contador = 0;
		
		for(int i = 0; i < 20; i++) {
			numero[i] = (int)(Math.random()*101);
			if(numero[i]%2 == 0) {
				aux[contador] = numero[i];
				contador++;
			}
			System.out.print(numero[i]+" | ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		
		for(int i= 0; i < 20; i++) {
			if(numero[i]%2 != 0) {
				aux[contador] = numero[i];
				contador++;
			}
			System.out.print(aux[i]+" | ");
		}
	}

}
