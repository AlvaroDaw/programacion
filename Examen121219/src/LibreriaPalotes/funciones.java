package LibreriaPalotes;

public class funciones {
	
	/**
	 * Convierte un numero dado por parametro en el sistema de palotes
	 * 
	 * @param n el numero entero
	 * @return un string con el numero convertido en palotes
	 */
	public static String convierteEnPalotes(int n) {
		String resultado = "";
	
		for(int i = 0; i < matematicas.varias.digitos(n); i++) {
			for(int j = 0; j < matematicas.varias.digitoN(n, i); j++) {
				resultado += "|";
			}
			if(i < matematicas.varias.digitos(n)-1) {
				resultado += "-";
			}
		}
		
		return resultado;
	}
	
	/**
	 * Suma dos numeros dados como parametro y los convierte al sistema de palotes
	 * 
	 * @param x el primer numero entero
	 * @param y el segundo numero entero
	 * @return un string con el numero sumado convertido en palotes
	 */
	public static String sumaPalotes(int x, int y) {
		String resultado = "";
		int n = x+y;
		
		resultado = convierteEnPalotes(n);
		
		return resultado;
	}
	
	/**
	 * Resta dos numeros dados como parametro y los convierte al sistema de palotes
	 * 
	 * @param x el primer numero entero
	 * @param y el segundo numero entero
	 * @return un string con el numero restado convertido en palotes
	 */
	public static String restaPalotes(int x, int y) {
		String resultado = "";
		int n = x-y;
		
		resultado = convierteEnPalotes(n);
		
		return resultado;
	}
	
	/**
	 * Multiplica dos numeros dados como parametro y los convierte al sistema de palotes
	 * 
	 * @param x el primer numero entero
	 * @param y el segundo numero entero
	 * @return un string con el numero convertido en palotes
	 */
	public static String multiplicaPalotes(int x, int y) {
		String resultado = "";
		int n = x*y;
		
		resultado = convierteEnPalotes(n);
		
		return resultado;
	}
	/**
	 * Divide dos numeros dados como parametro y los convierte al sistema de palotes
	 * 
	 * @param x el primer numero entero
	 * @param y el segundo numero entero
	 * @return un string con el numero convertido en palotes
	 */
	public static String cocientePalotes(int x, int y) {
		String resultado = "";
		int n = x/y;
		
		resultado = convierteEnPalotes(n);
		
		return resultado;
	}
	
	/**
	 * Saca el resto de una division entre dos numeros
	 * 
	 * @param x el primer numero entero
	 * @param y el segundo numero entero
	 * @return un string con el resto de la division convertido al sistema de palotes
	 */
	public static String restoPalotes(int x, int y) {
		String resultado = "";
		int n = x%y;
		if(n == 0) {
			return "-";
		}else {
		resultado = convierteEnPalotes(n);
		return resultado;
		}
	}




}
