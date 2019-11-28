/**
 * Ejercicio 05
 * 
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con numeros enteros positivos
 * comprendidos entre 0 y 1000. A continuacion el programa debera dar la posicion tanto del maximo
 * como del minimo.
 * 
 * @author Alvaro Ramirez
 *
 */
public class EjercicioBD05 {
	public static void main(String[] args) {
		int n[][] = new int[6][10];
		int fila,columna;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				n[i][j] = (int)(Math.random()*1001);
				if(n[i][j] > maximo) {
					maximo = n[i][j];
				}else if(n[i][j] < minimo) {
					minimo = n[i][j];
				}
			}
		}
		
		for(fila = 0; fila < 6; fila++) {
			for(columna = 0; columna < 10; columna++) {	
					System.out.printf("%-9d  ", n[fila][columna]);
			}
		System.out.println();	
		}
		
		System.out.println();
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				if(n[i][j] == maximo) {
					System.out.println("La posicion del maximo es: fila "+i+" columna "+(j));
				}else if(n[i][j] == minimo) {
					System.out.println("La posicion del minimo es: fila "+i+" columna "+(j));
				}
			}
		}
		
	}

}
