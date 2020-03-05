import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		ArrayList<Carta> a = new ArrayList<Carta>();
		HashMap<String,Integer> b = new HashMap<String,Integer>();
		int puntos = 0;
		
		b.put("as", 11);
		b.put("dos", 0);
		b.put("tres", 10);
		b.put("cuatro", 0);
		b.put("cinco", 0);
		b.put("seis", 0);
		b.put("siete", 0);
		b.put("sota", 2);
		b.put("caballo", 3);
		b.put("rey", 4);
		
		Carta carta = new Carta();
		
		a.add(carta);
		
		for(int i = 0; i < 5; i++) {
			do {
				carta = new Carta();
			}while(a.contains(carta));
			
			a.add(carta);
		}
		
		System.out.println("Cartas.");
		for(Carta mostrar : a) {
			System.out.println(mostrar);
			puntos+= b.get(mostrar.getFigura());
		}
		
		System.out.println("Tienes "+puntos+" puntos");
		
	}

}
