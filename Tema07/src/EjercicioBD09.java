/**
 * Ejercicio BD 09
 * 
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una posicion
 * en el sentido de las agujas de reloj. La matriz debe tener 12 filas por 12 columnas y debe contener
 * numeros generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
 * resultado, ambas con los numeros convenientemente alineados.
 * 
 * @author Alvaro Ramirez
 *
 */
public class EjercicioBD09 {
	public static void main(String[] args) {
		int n[][] = new int[12][12];
		int aux1;
		int aux2;
		int capa = 0;
		
		System.out.println("Array original: ");
		for(int i = 0; i < 12; i++) {
			for(int y = 0; y < 12; y++) {
				n[i][y] = (int)(Math.random()*101);
				System.out.printf("%-4d", (n[i][y]));
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Array resultante");
		
		for(capa = 0; capa < 6; capa++) {
			//Rota parte de arriba
			aux1 = n[capa][11-capa];
			for(int i = 11-capa; i > capa; i--) {
				n[capa][i] = n[capa][i-1];
			}
			
			
			//Rota parte derecha
			aux2 = n[11-capa][11-capa];
			for(int i = 11 - capa; i > capa+1; i--) {
				n[i][11-capa] = n[i-1][11-capa]; 
			}
			n[capa+1][11-capa] = aux1;
			
			//Rota por abajo
			aux1 = n[11-capa][capa];
			for(int j = capa; j < 11-capa; j++) {
				n[11-capa][j] = n[11-capa][j+1];
			}
			n[11-capa][11-capa-1] = aux2;
			
			//Rota por la izquierda
			for(int j = capa; j< 11-capa-1; j++) {
				n[j][capa] = n[j+1][capa];
			}
			n[11-capa-1][capa] = aux1;
		
		}
		
		
		for(int i = 0; i < 12; i++) {
			for(int y = 0; y < 12; y++) {
				System.out.printf("%-4d", (n[i][y]));
			}
			System.out.println();
		}
		
	}

}
