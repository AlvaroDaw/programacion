/**
 * Ejercicio 4
 * 
 * @author Alvaro Ramirez Escribano
 */
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String palabra[] = {"libreta", "puerta", "ordenador","pizarra"};
		String desorden[] = {"teilrba", "trupea", "odorednra","raraizp"};
		int juego = (int)(Math.random()*4);
		String destacado = "";
		String random = "";
		
		for(int i = 0; i < 4; i++) {
			if(i == juego) {
				destacado = palabra[i];
				random = desorden[i];
			}
		}
		
		
		
		System.out.println("Juego de Adivina la palabra");
		System.out.println("La palabra desordenada es: "+random);
		int contador = 5;
		boolean datos = false;
		String respuesta = "";
		do {
			System.out.println("Te quedan "+contador+". Di que palabra es:");
			respuesta = s.next();
			
			if(respuesta.equals(destacado)) {
				datos = true;
				System.out.println("ENHORABUENA. Has acertado la palabra: "+destacado);
			}else {
				contador--;
				System.out.print("Palabra incorrecta.");
			}
		}while(!datos && contador != 0);
		
		if(contador == 0) {
			System.out.println("Te quedaste sin intentos. La respuesta era: "+destacado);
		}
	}

}
