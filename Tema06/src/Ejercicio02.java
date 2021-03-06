/**
 * Ejercicio 02
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja
 * esta dividida en cuatro palos: picas, corazones, diamantes y treboles. Cada esta formado por 13
 * cartas, de las cuales 9 cartas son numerales y 4 literales: 2,3,4,5,6,7,8,9,10,J,Q,K y A.
 * Para convertir un numero en una cadena de caracteres podemos usar String.ValueOf(n).
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String palo = "";
		String carta;
		
		int tipopalo = (int)(Math.random()*4)+1;
		
		switch(tipopalo) {
		case 1:
			palo = "picas";
			break;
		
		case 2:
			palo = "corazones";
			break;
			
		case 3:
			palo = "diamantes";
			break;
		
		case 4:
			palo = "treboles";
			break;
		default:
		}
		
		int n = (int)(Math.random()*13)+1;
		
		switch(n) {
		case 11:
			carta = "J";
			break;
			
		case 12:
			carta = "Q";
			break;
			
		case 13:
			carta = "K";
			break;
			
		case 1:
			carta = "A";
			break;
			
		default:
			carta = String.valueOf(n);
		}
		
		System.out.println(carta+" de "+palo);
		s.close();
	}

}
