/**
 * Ejercicio 01
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar tambien la suma total
 * (los puntos que suman entre los tres dados).
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este programa tira 3 dados, pulsa ENTER para iniciar.");
		s.nextLine();
		
		int dado1 = (int)(Math.random()*6+1);
		int dado2 = (int)(Math.random()*6+1);
		int dado3 = (int)(Math.random()*6+1);
		
		System.out.println("Dado 1: "+dado1+" | Dado 2: "+dado2+" | Dado 3: "+dado3);
		System.out.println("Suma total: "+(dado1+dado2+dado3));
		s.close();
	}

}
