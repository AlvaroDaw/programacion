/**
 * Ejercicio 15
 * Escribe un programa que pinte una piramide rellena con un caracter introducido por teclado que
 * podra ser una letra, un numero o un simbolo. El programa debe permitir al usuario mediante un menu
 * elegir si el vertice de la piramide esta apuntando hacia arriba, abajo, izquierda o derecha.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Programa que pinta una piramide.");
	    System.out.println("-------------------------------------------");
	    System.out.println("Elige un carácter para estructurar la piramide.");
	    System.out.println("-------------------------------------------");
	    
	    String w = s.nextLine();
	    System.out.println("Elige la orientacion de la piramide:");
	    System.out.println("1. Orientada hacia arriba");
	    System.out.println("2. Orientada hacia abajo");
	    System.out.println("3. Orientada hacia la izquierda");
	    System.out.println("4. Orientada hacia la derecha");
	    int orientacion = s.nextInt();
	    
	    switch(orientacion) {
	      case 1:
	        System.out.println("    " + w);
	        System.out.println("   " + w + w + w);
	        System.out.println("  " + w + w + w + w + w);
	        System.out.println(" " + w + w + w + w + w + w + w);
	        System.out.println( w + w + w + w + w + w + w + w + w);
	        break;
	      case 2:
	        System.out.println(" " + w + w + w + w + w + w + w + w + w);
	        System.out.println("  " + w + w + w + w + w + w + w);
	        System.out.println("   " + w + w + w + w + w);
	        System.out.println("    " + w + w + w);
	        System.out.println("     " + w);
	        break;
	      case 3:
	        System.out.println("     " + w);
	        System.out.println("    " + w + w);
	        System.out.println("   " + w + w + w);
	        System.out.println("  " + w + w + w + w);
	        System.out.println(" " + w + w + w + w + w);
	        System.out.println(w + w + w + w + w + w);
	        System.out.println(" " + w + w + w + w + w);
	        System.out.println("  " + w + w + w + w);
	        System.out.println("   " + w + w + w);
	        System.out.println("    " + w + w);
	        System.out.println("     " + w);
	        break;
	      case 4:
	        System.out.println(w);
	        System.out.println(w + w);
	        System.out.println(w + w + w);
	        System.out.println(w + w + w + w);
	        System.out.println(w + w + w + w + w);
	        System.out.println(w + w + w + w + w + w);
	        System.out.println(w + w + w + w + w);
	        System.out.println(w + w + w + w);
	        System.out.println(w + w + w);
	        System.out.println(w + w);
	        System.out.println(w);
	        break;
	      default:
	    }
	    s.close();
	}

}
