import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio08 {
	public static void main(String[] args) {
		
		ArrayList<Carta> a = new ArrayList<Carta>();
		
		Carta carta = new Carta();
		
		a.add(carta);
		
		for(int i = 0; i < 10; i++) {
			do {
				carta = new Carta();
			}while(a.contains(carta));
			
			a.add(carta);
		}
		
		Collections.sort(a);
		
		for(Carta Carta :a) {
			System.out.println(Carta);
		}
		
	}

}
