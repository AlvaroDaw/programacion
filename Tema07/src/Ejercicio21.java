/**
 * Ejercicio 21
 * 
 * Escribe un programa que rellene un array de 15 elementos con numeros enteros comprendidos entre
 * 0 y 500 (ambos incluidos). A continuación, se mostrará el array cincuerzado, segun el siguiente
 * criterio: si el numero que hay en una posicion del array es multiplo de 5, se deja igual, y si
 * no, se cambia por el siguiente multiplo de 5 que exista a partir de el.
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		int n[] = new int[15];
		boolean multiplo = true;
		
		System.out.println("Array original:");
		for(int i = 0; i < 15; i++) {
			n[i] = (int)(Math.random()*501);
			System.out.print(n[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Array resultante:");
		
		for(int i = 0; i < 15; i++) {
			multiplo = true;
			if(n[i] % 5 == 0) {
				multiplo = true;
			}else {
				do {
					n[i]++;
				}while(n[i] % 5 != 0);
			}
			if(multiplo) {
				System.out.print(n[i]+" ");
			}
		}
	}

}
