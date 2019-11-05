/**
 * Ejercicio 4
 * 
 * Implemente un programa que codifique los digitos de un numero con su letra similar. La tabla
 * de codificacion es la siguiente.
 * 
 * El programa pedira reiteradamente numeros, tras lo cual debera mostrarlos en su codificacion de
 * letras similares. El programa finalizara cuando se introduzca el numero 0.
 * 
 * @author Alvaro Ramirez Escribano
 */
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int numero;
		int digito;
		int volteado = 0;
		int n;
		
		
		System.out.println("Este programa codifica en `letras similares`");
		
		do {
		
		System.out.println("Introduzca un numero entero (0 para salir): ");
		numero = s.nextInt();
		
		digito = 0;
		volteado = 0;
		n = numero;
		
		//Vuelta al numero
		while(n > 0) {
			volteado = (volteado*10)+(n%10);
			n /= 10;
		}
		
		//Comprobamos si el numero no es 0
		if(numero != 0) {
		System.out.println("El valor codificado es: ");
		//Transforma numeros en letras
		while(volteado > 0) {
			digito = volteado%10;
			
				if(digito == 1) {
					System.out.print("l");
				}else if(digito == 2) {
					System.out.print("Z");
				}else if(digito == 3) {
					System.out.print("E");
				}else if(digito == 4) {
					System.out.print("A");
				}else if(digito == 5) {
					System.out.print("S");
				}else if(digito == 6) {
					System.out.print("b");
				}else if(digito == 7) {
					System.out.print("J");
				}else if(digito == 8) {
					System.out.print("B");
				}else if(digito == 9) {
					System.out.print("g");
				}else if(digito == 0) {
					System.out.print("O");
				}
			volteado /= 10;
			
			}
		//Fin de transformar numeros
		//Muestra un mensaje si el numero introducido es 0.
		}else {
			System.out.println("Fin del programa.");
		}
		
		System.out.println();
		}while(numero != 0);
		//Fin del bucle Do
		s.close();
	}

}
