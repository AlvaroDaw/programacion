import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		System.out.println("Introduce 10 numeros: ");
		for(int i = 0; i < 10; i++) {
			a.add(s.nextInt());
		}
		
		Collections.sort(a);
		
		System.out.println(a);
		
	}

}
