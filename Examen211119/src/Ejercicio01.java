/**
 * Ejercicio 01
 * 
 * @author Alvaro Ramirez Escribano
 *
 */
import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int altura;
		int margen;
		int h = 1;
		int i = 0;
		int caracter = 1;
		boolean datos = false;
		
		do {
			datos = true;
			System.out.println("Introduce la altura: ");
			altura = s.nextInt();
			if(altura < 3) {
				System.out.println("Lo siento, la altura no es correcta");
				datos = false;
			}
		}while(!datos);
		
		do {
			datos = true;
			System.out.println("Introduce el margen: ");
			margen = s.nextInt();
			if(margen < 1) {
				System.out.println("Lo siento, el margen no es correcto.");
				datos = false;
			}
		}while(!datos);
		
		int espacio = altura-1;
		int espacioscentro = 1;
		
		while(h <= altura) {
			for(i = 0; i < espacio; i++) {
				System.out.print(" ");
			}
			
				if(h > margen && h <= altura-margen) {
					for(int j = 0; j < margen;j++) {
						System.out.print("*");
					}
					for (int j = 0; j < espacioscentro; j++) {
						System.out.print(" ");
					}
					for(int j = 0; j < margen;j++) {
						System.out.print("*");
					}
					espacioscentro+=2;
					System.out.println();
				}else {
					for(int j = 0; j < caracter; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			
			
			espacio--;
			h++;
			caracter+=2;
		}
		s.close();
		
		
		
	}

}
