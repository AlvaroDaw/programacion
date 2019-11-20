/**
 * Ejercicio 16
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n[] = new int[20];
		
		for(int i = 0; i < 20; i++) {
			n[i] = (int)(Math.random()*401);
			System.out.print(n[i]+" ");
		}
		System.out.println();
		System.out.println("Que numeros quiere resaltar?");
		System.out.println("1- Multiplos de 5, 2- Multiplos de 7:");
		int destacado = s.nextInt();
		
		if(destacado == 1) {
			for(int i = 0; i < 20; i++) {
				if(n[i]%5 == 0) {
					System.out.print("**"+n[i]+"** ");
				}
			}
		}else if(destacado == 2) {
			for(int i = 0; i < 20; i++) {
				if(n[i]%7 == 0) {
					System.out.print("**"+n[i]+"** ");
				}else {
					System.out.print(n[i]+" ");
				}
			}
		}
		s.close();
	}

}
