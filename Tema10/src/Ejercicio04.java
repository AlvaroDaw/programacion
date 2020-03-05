import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<String>();
		
		System.out.println("Introduce 10 palabras: ");
		for(int i = 0; i < 10; i++) {
			a.add(s.next());
		}
		
		System.out.println("Lista original: "+a);
		
		Collections.sort(a);
		
		System.out.println("Lista ordenada: "+a);
	
	}

}
