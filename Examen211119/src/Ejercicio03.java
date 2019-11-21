/**
 * Ejercicio 03
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		String morse = "";
		
		do {
			System.out.print("Introduzca un valor entero a codificar (>=0): ");
			numero = s.nextInt();
			
			int n = numero;
			int volteado = 0;
			int longitud = 0;
			
			if(numero == 0) {
				longitud = 1;
			}
			
			while(n > 0) {
				volteado = (volteado * 10)+(n % 10);
				n /= 10;
				longitud++;
			}
			
			for(int i = 0; i < longitud; i++) {
			
				switch(volteado%10) {
				case 1:
					morse = ".----";
					break;
				case 2:
					morse = "..---";
					break;
				case 3:
					morse = "...--";
					break;
				case 4:
					morse = "....-";
					break;
				case 5:
					morse = ".....";
					break;
				case 6:
					morse = "-....";
					break;
				case 7:
					morse = "--...";
					break;
				case 8:
					morse = "---..";
					break;
				case 9:
					morse = "----.";
					break;
				case 0:
					morse = "-----";
					break;
				}
				volteado /= 10;
				
				System.out.print(morse+" ");
				}
			System.out.println();
		}while(numero >= 0);
		s.close();
		
		
	}

}
