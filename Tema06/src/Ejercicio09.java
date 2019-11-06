/**
 * Ejercicio 9
 * 
 * Realiza un programa que vaya generando numeros aleatorios pares entre 0 y 100 y que no termine 
 * de generar numeros hasta que saque el 24. El programa debera decir al final cuantos numeros ha
 * generado.
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio09 {
	public static void main(String[] args ) {
		int x;
		int contador = 0;
		
		do {
			x = (int)(Math.random()*50)*2;
			System.out.print(x+" ");
			contador++;
			
		}while(x != 24);
		
		System.out.println();
		System.out.println("Se han generado "+contador+" numeros.");
	}
}
