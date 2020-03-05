import java.util.ArrayList;

public class Ejercicio07 {
	public static void main(String[] args) {
		
		ArrayList<Moneda> a = new ArrayList<Moneda>();
		
		Moneda coin = new Moneda();
		
		a.add(coin);
		
		String ultpos = coin.getPosicion();
		String ultcan = coin.getCantidad();
		
		for(int i = 0; i < 6; i++) {
			do {
				coin = new Moneda();
			}while(!(coin.getPosicion().equals(ultpos) || coin.getCantidad().equals(ultcan)));
			
			a.add(coin);
			ultpos = coin.getPosicion();
			ultcan = coin.getCantidad();
		}
		
		for(Moneda moneda : a) {
			System.out.println(moneda);
		}
	}
}