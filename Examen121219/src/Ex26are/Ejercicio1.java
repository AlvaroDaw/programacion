/**
 * Ejercicio 1
 * 
 * @author Alvaro Ramirez Escribano
 */
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Introduce un numero entero:");
		x = s.nextInt();
		System.out.println("Introduce otro numero:");
		y = s.nextInt();
		
		System.out.print("El numero "+x+" en palotes es: ");
		System.out.print(LibreriaPalotes.funciones.convierteEnPalotes(x)+"\n");
		
		System.out.print("El numero "+x+" mas "+y+" en palotes es: ");
		System.out.println(LibreriaPalotes.funciones.sumaPalotes(x, y));
		
		System.out.print("El numero "+x+" menos "+y+" en palotes es: ");
		System.out.println(LibreriaPalotes.funciones.restaPalotes(x, y));
		
		System.out.print("El cociente del numero "+x+" entre "+y+" en palotes es: ");
		System.out.println(LibreriaPalotes.funciones.cocientePalotes(x, y));
		
		System.out.print("El resto del numero "+x+" entre "+y+" en palotes es: ");
		System.out.println(LibreriaPalotes.funciones.restoPalotes(x, y));
	}
}
