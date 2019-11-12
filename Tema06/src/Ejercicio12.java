/**
 * Ejercicio 12
 * 
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el 
 * codigo ASCII entre el 32 y el 126. Puedes hacer casting con char para convertir un entero
 * en un caracter
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio12 {
	public static void main(String[] args)
		throws InterruptedException {
		
		int linea = 0;
	    
	   

	    for(int i = 0; i < 800; i++) {
	    	System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
	    	 Thread.sleep(10);

	      if (linea++ == 60) {
	        linea = 0;
	        Thread.sleep(10);
	        System.out.println();
	      }
	    }
	}
}
