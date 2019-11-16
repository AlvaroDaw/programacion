/**
 * Ejercicio 09
 * 
 * Realiza un programa que pida 8 numeros enteros y que luego muestre esos numeros junto con
 * la palabra par o impar segun proceda.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero[] = new int[8];
		
		System.out.println("Introduce 8 numeros enteros.");
		
		for(int i = 0; i < 8; i++) {
			System.out.println("Introduce nº"+(i+1)+": ");
			numero[i] = s.nextInt();
		}
		
		for(int i = 0; i < 8; i++) {
			if(numero[i]%2 == 0) {
				System.out.println(numero[i]+" par");
			}else if(numero[i]%2 != 0) {
				System.out.println(numero[i]+" impar");
			}
		}
		s.close();
	}

}
