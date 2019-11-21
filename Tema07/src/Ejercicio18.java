/**
 * Ejercicio 18
 * 
 * Realiza un programa que genere 10 numeros aleatorios entre 0 y 200 ambos incluidos y que los
 * almacene en un array. A continuacion, el programa debe mostrar el contenido de ese array junto
 * al indice (0-9). Seguidamente el programa debe colocar de forma alterna y en orden los menores
 * o iguales a 100 y los mayores de 100: primero menor, luego mayor, luego menor; luego mayor etc
 * Cuando se acaben los menores o los mayores, se completara con los numeros que queden.
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio18 {
	public static void main(String[] args) {
		int n[] = new int[10];
		int menor[] = new int[10];
		int mayor[] = new int[10];
		int contmen = 0;
		int contmay = 0;
		
		for(int i = 0; i < 10; i++) {
			n[i] = (int)(Math.random()*201);
			if(n[i] < 100) {
				menor[contmen++] = n[i];
			}else {
				mayor[contmay++] = n[i];
			}
		}
		
		//Muestra el array 
		System.out.print(" Indice ");
		for (int i = 0; i < 10; i++) { 
			System.out.printf("│%4d ", i);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.print(" Valor  "); 
		for (int i = 0; i < 10; i++) {
			System.out.printf("│%4d ", n[i]);
			}
		System.out.println();
		//Fin de array
		
		int j = 0;
		int x = 0;
		int y = 0;
		
		do {
			if(x < contmen) {
				n[j] = menor[x++];
				j++;
			}
			if(y < contmay) {
				n[j] = mayor[y++];
				j++;
			}
			
		}while(j < 10);
		
		System.out.println();
		
		//Muestra el array 
		System.out.print(" Indice ");
		for (int i = 0; i < 10; i++) { 
			System.out.printf("│%4d ", i);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.print(" Valor  "); 
		for (int i = 0; i < 10; i++) {
			System.out.printf("│%4d ", n[i]);
			}
		System.out.println();
		//Fin de array
		
	}

}
