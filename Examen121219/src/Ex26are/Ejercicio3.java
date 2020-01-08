/**
 * Ejercicio 3
 * 
 * @author Alvaro Ramirez Escribano
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		int x[] = new int[7];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = (int)(Math.random()*10);
		}
		
		int y[][] = new int[7][7];
		
		for(int i = 0; i < y.length; i++) {
			for(int j = 0; j < y[0].length; j++) {
				y[i][j] = (int)(Math.random()*10);
			}
		}
		
		System.out.println("\n\nArray Unidimensional Original:\n"); 
	 
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%5d ", x[i]);
			}
		
		int aux[] = rotarColumnaALaIzquierda(x);
		
		System.out.println("\n\nArray Unidimensional rotado:\n"); 
		 
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%5d ", aux[i]);
		}
		
		System.out.println("\n\nArray Bidimensional Original:\n"); 
		 
		for (int i = 0; i < y.length; i++) {
			for(int j = 0; j < y[0].length; j++) {
				System.out.printf("%5d ", y[i][j]);
			}
			System.out.println();
		}
		
		int aux2[][] = rotarColumnaALaIzquierda(y);
		
		System.out.println("\n\nArray Bidimensional rotado:\n"); 
		 
		for (int i = 0; i < aux2.length; i++) {
			for(int j = 0; j < aux2[0].length; j++) {
				System.out.printf("%5d ", aux2[i][j]);
			}
			System.out.println();
		}
		
	}

	public static int[] rotarColumnaALaIzquierda(int x[]) {
		int[] a = x.clone();
		int aux = a[0];
		
		for(int i = 0; i < a.length-1; i++) {
			a[i] = a[i+1];
		}
		a[a.length-1] = aux;
		return a;
	}
	
	public static int[][] rotarColumnaALaIzquierda(int matriz[][]){
		
		int[][] a = matriz.clone();
		int aux;
		
		for(int j = 0; j <a.length; j++) {
			aux = a[j][0];
			for(int i = 0; i < a[0].length-1; i++) {
				a[j][i] = a[j][i+1];
			}
			a[j][a.length-1] = aux;
		}
		return a;
	}
}
