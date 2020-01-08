package matematicas;

public class varias {
	
	/**
	 * Devuelve verdadero si el numero n es capicua y falso si no lo es
	 * 
	 * @param n el numero entero
	 * @return verdadero si el numero es capicua y falso si no lo es
	 */
	public static boolean esCapicua(int n) {
		return n == voltea(n);
	}
	
	/**
	 * Devuelve verdadero si el numero que se pasa como parametro es primo y falso en caos contrario
	 * 
	 * @param n numero del que se quiere saber si es primo
	 * @return verdadero si el numero que se pasa es primo y falso en caso contrario
	 * 
	 */
	public static boolean esPrimo(long n) {
		if(n < 2) {
			return false;
		}else {
			for(long i = n /2; i >= 2; i--) {
				if(n%i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Devuelve el proximo numero primero del numero que se pasa como parametro
	 * 
	 * @param n el primo mas cercano al pasado por parametro
	 * @return el numero que se quiere saber
	 * 
	 */
	public static long siguientePrimo(long n) {
		do {
			n++;
		}while(!esPrimo(n));
		return n;
	}
	
	/**
	 * Devuelve la potencia de un numero dada una base y exponente por parametros
	 * 
	 * @param base, exponente la base y el exponente de la potencia 
	 * @return la potencia
	 * 
	 */
	public static int potencia(int base, int exponente) {
		if(exponente == 0) {
			return 1;
		}
		if(exponente < 0) {
			return 1/potencia(base,-exponente);
		}
		int n = 1;
		for(int i = 0; i < Math.abs(exponente); i++) {
			n *= base;
		}
		return n;
	}
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
	
	/**
	 * Devuelve la posicion de la primera vez que un digito dentro de un numero aparece. Si no
	 * encuentra ninguna, devuelve -1.
	 * 
	 * @param n el numero entero
	 * @param d el digito a buscar dentro del numero
	 * @return La posicion de la primera vez que sale ese digito dentro del numero. -1 si no.
	 */
	public static int posicionDigito(int n, int d) {
		int i;
		for(i = 0; (i < digitos(n)) && (digitoN(n, i) !=d );i++){};
		if (i == digitos(n)) {
			return -1;
		}else {
			return i;
		}
	}
	
	/**
	 * Le quita a un numero <code>n</code> digitos por detras (por la derecha).
	 * 
	 * @param n numero entero
	 * @param d numero de digitos que quiere quitar por detras
	 * @return numero inicial con d digitos menos quitado por la derecha
	 */
	public static int quitaPorDetras(int n, int d) {
		return n / (int)potencia(10,d);
	}
	
	/**
	 * Le quita a un numero n digitos por delante (Por la izquierda)
	 * 
	 * @param n el numero entero 
	 * @param d numero de digitos que quiere quitar por delante
	 * @return numero inicial n con d digitos menos quitados por la izquierda
	 */
	public static int quitaPorDelante(int n, int d) {
		n = pegaPorDetras(n,1); //Cierra el numero por si acaso termina en 0
		n = voltea(quitaPorDetras(voltea(n),d));
		n = quitaPorDetras(n,1);
		return n;
	}
	
	/**
	 * Añade un digito a un numero por detras(por la derecha)
	 * 
	 * @param n el numero entero
	 * @param d digito que se le va a pegar por la derecha
	 * @return numero inicial n con el digito d pegado por la derecha
	 */
	public static int pegaPorDetras(int n, int d) {
		return juntaNumeros(n,d);
	}

	/**
	 * Añade un digito a un numero por delante(por la izquierda)
	 * 
	 * @param n el numero entero
	 * @param d digito que se le va a pegar por la izquierda
	 * @return numero inicial n con el digito d pegado por la izquierda
	 */
	public static int pegaPorDelante(int n, int d) {
		return juntaNumeros(d,n);
	}
	
	/**
	 * Tomas como parametros las posiciones inicial y final dentro de un numero y devuelve
	 * el trozo correspondiente
	 * 
	 * @param n el numero entero
	 * @param inicio posicion inicial
	 * @param fin posicion final
	 * @return trozo de numero compuesto por todos los digitos que van desde la posicion 
	 * inicial a la posicion final incluyendo ambos
	 */
	public static int trozoDeNumero(int n, int inicio, int fin) {
		int longitud = digitos(n);
		n = quitaPorDelante(n,inicio);
		n = quitaPorDetras(n,longitud - fin -1);
		return n;
	}
	
	/**
	 * Pega dos numeros para formar uno solo
	 * 
	 * @param n trozo que se pegara por la izquierda
	 * @param y trozo que se pegara por la derecha
	 * @return numero compuesto de los trozos n e y
	 */
	public static int juntaNumeros(int n, int y) {
		return (int)(n*potencia(10, digitos(y)))+y;
	}
	
	/**
	 * Pasa un numero decimal a binario
	 * 
	 * @param decimal numero entero
	 * @return numero inicial pasado a binario
	 */
	public static long decimalABinario(int decimal) {
		if (decimal == 0) {
			return 0;
		}
		int binario = 1;
		
		while(decimal > 1) {
			binario = matematicas.varias.pegaPorDetras(binario, decimal%2);
			decimal /= 2;
		}
		
		binario = matematicas.varias.pegaPorDetras(binario, 1);
		binario = matematicas.varias.voltea(binario);
		binario = matematicas.varias.quitaPorDetras(binario, 1);
		
		return binario;
	}
	
}
	