/**
 * Ejercicio 02
 * 
 * @author Alvaro Ramirez Escribano
 *
 */
import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long numero;
		boolean datos;
		long sumapre = 0;
		long sumapos = 0;
		
		do {
			datos = true;
			System.out.println("Indique hasta que numero desea procesar(>=1): ");
			numero = s.nextLong();
			if(numero < 1) {
				System.out.println("Ese numero no es valido");
				datos = false;
			}
			
		}while(!datos);
		
		for(long i = 2; i < numero; i++) {
			sumapre = 0;
			sumapos = 0;
			do {
				for(long j = 1; j < i; j++) {
					sumapre += j;
				}
				
				for(long j = i+1; j <= sumapre; j++) {
					sumapos += j;
					if(sumapre == sumapos) {
						System.out.println("Centro numerico: "+i+". Grupos: (1-"+(i-1)+") ("+(i+1)+"-"+j+"). Suma: "+sumapos);
					}
				}
				
			}while(sumapre == sumapos && sumapos > sumapre);
			s.close();
		}
	}

}
