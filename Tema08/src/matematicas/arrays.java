package matematicas;

public class arrays {
	
	/**
	 * Genera un array de tamaño n con numeros aleatorios cuyo intervalo se indica como parametro
	 * 
	 * @param n el tamaño del array
	 * @param min el valor minimo de los numeros aleatorios
	 * @param max el valor maximo de los numeros aleatorios
	 * @return un array de tamaño n cuyo intervalo de valores se dan como parametro
	 */
	public static int[] generaArrayInt(int n, int min, int max) {
		int array[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = (int)(Math.random()*(max-min+1)+min);
		}
		return array;
	}
	
	/**
	 * Devuelve el minimo del array que se pasa como parametro
	 * 
	 * @param a array unidimensional de numeros enteros
	 * @return el numero mas pequeño encontrado en ese array
	 */
	public static int minimoArrayInt(int[] a) {
		int min = Integer.MAX_VALUE;
		
		for(int m : a ) {
			if(m < min) {
				min = m;
			}
		}
		return min;
	}
	
	/**
	 * Devuelve el maximo del array que se pasa como parametro
	 * 
	 * @param a el array unidimensional con numeros enteros
	 * @return el numero mas grande encontrado en el array
	 */
	public static int maximoArrayInt(int[] a) {
		int max = Integer.MIN_VALUE;
		
		for(int m : a) {
			if(m > max) {
				max = m;
			}
		}
		return max;
	}
	
	/**
	 * Devuelve la media del array que se pasa como parametro
	 * 
	 * @param a el array unidimensional relleno pasado como parametro
	 * @return la media de todos los numeros que estan dentro del array
	 */
	public static int mediaArrayInt(int[] a) {
		int suma = 0;
		
		for(int m : a) {
			suma += m;
		}
		return suma / a.length;
	}
	
	/**
	 * Dice si un numero está o no dentro de un array
	 * 
	 * @param a El array unidimensional relleno pasado como parametro
	 * @param n el numero entero que se desea saber si está en el array
	 * @return true si el numero está en el array y false si no lo está
	 */
	public static boolean estaEnArrayInt(int[] a, int n) {
		for(int m : a) {
			if(m == n) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Busca un numero en un array y devuelve la posicion(el indice) en la que se encuentra
	 * 
	 * @param a el array unidimensional relleno pasado como parametro
	 * @param n el numero que se quiere buscar dentro del array
	 * @return el indice en el que se encuentra ese array y -1 si ese numero no está
	 */
	public static int posicionEnArray(int[] a, int n ) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Le da la vuelta a un array. Los primeros numeros estaran al final y viceversa
	 * 
	 * @param a el array unidimensional releno pasado como parametro
	 * @return el array volteado
	 */
	public static int[] volteaArrayInt(int[] a) {
		int[] voltea = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			voltea[a.length-i-1] = a[i];
		}
		
		return voltea;
	}
	
	

}
