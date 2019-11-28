/**
 * Ejercicio 06
 * 
 * Modifica el programa anterior de tal forma que no se repita ningun numero en el array
 * 
 * @author Alvaro Ramirez
 *
 */
public class EjercicioBD06 {
	public static void main(String[] args) {
		int n[][] = new int[6][10];
		int fila,columna;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		boolean repetido = true;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				do {
					repetido = false;
					n[i][j] = (int)(Math.random()*1001);
					for(int v = 0; v < i; v++) {
						for(int q = 0; q < j; q++) {
							if(n[v][q] == n[i][j]) {
								repetido = true;
							}else {
								repetido = false;
							}
						}
					}
				}while(repetido);
				
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
