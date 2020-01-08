package matematicas;

public class varias {
	
	
	/**
	 * Cuenta el numero de digitos que tiene un numero dado por parametro
	 * 
	 * @param n el numero dado por parametro
	 * @return x la cantidad de digitos de dicho numero
	 * 
	 */
	public static int digitos(int n) {
		int x = 0;
		
		if(n == 0) {
			return 1;
		}else {
			while(n>0) {
				n/=10;
				x++;
			}
		}
		return x;
	}
	/**
	 * Da la vuelta a un numero dado por parametro
	 * 
	 * @param n el numero al que se quiere dar la vuelta
	 * @return el numero volteado
	 * 
	 */
	public static int voltea(int n) {
		int volteado = 0;
		int contador = 0;
		contador = digitos(n);
		
		while(contador > 0) {
			volteado = (volteado*10)+(n%10);
			n/=10;
			contador--;
		}
		return volteado;
	}
	
	/**
	 * Devuelve el digito que esta en la posicion <code>n</code> de un numero entero.
	 * Se empieza contando por el 1 y de izquierda a derecha.
	 * 
	 * @param n el numero entero
	 * @param posicion la posicion del numero
	 * @return digito que está en la posicion dada por parametro
	 * 
	 */
	public static int digitoN(int n, int posicion) {
		n = voltea(n);
		
		while(posicion > 0) {
			n/=10;
			posicion--;
		}
		return(int)n%10;
	}
	
}