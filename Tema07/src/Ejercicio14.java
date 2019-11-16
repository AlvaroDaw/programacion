/**
 * Ejercicio 14
 * 
 * Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
 * correspondientes a colores se deben almacenar al comienzo y las que no son colores a 
 * continuacion. Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el
 * programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja,
 * rosa, negro, blanco y morado.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] color = {
				"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"
		};
		String[] palabra = new String[8];
		String[] aux = new String[8];
		int j = 0;
		
		System.out.println("Escribe 8 palabras separadas por INTRO, se ordenaran por colores");
		for(int i = 0; i < 8; i++) {
			palabra[i] = s.next();
			
			//Comprueba si es color y lo mete en el array aux
			for (String c : color) {
				if (palabra[i].equals(c)) {
				aux[j++] = c;
				}
			}
		}
		
		//Mete las demas palabras en la otra mitad del array
		for(int i=0; i < 8; i++) {
			boolean esColor = false;
			for (String c : color) {
				if (palabra[i].equals(c)) {
				esColor = true;
				}
			}
			if(!esColor) {
				aux[j++] = palabra[i];
			}
		}
		
		//Tabla para array
		System.out.print(" Índice ");
		for (int i = 0; i < 8; i++) { 
			System.out.printf("│%10d ", i);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.print(" Valor  "); 
		for (int i = 0; i < 8; i++) {
			System.out.printf("│%10s ", aux[i]);
			}
		System.out.println();
		//Fin de tabla array
		s.close();
	}

}
