/**
 * Dada una cantidad en Bytes, conviertase a "forma completa", expresando su
 * equivalencia en Mb, KB y B.
 * 
 * Ejemplo:
 * 45896 B = ???? Mb + ???? Kb + ???? B
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class ConversorGbKb {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b,kb,mb;
		
		System.out.println("Introduce la cantidad en bytes: ");
		b = s.nextInt();
		
		kb = b/1024;
		mb = kb/1024;
		
		System.out.println(mb+" Mb | "+(kb-(mb*1024))+" Kb | "+(b-(kb*1024))+" Bytes");
		s.close();
	}

}
