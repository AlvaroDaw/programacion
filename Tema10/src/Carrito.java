import java.util.ArrayList;

public class Carrito {
	
	ArrayList<Elemento> a = new ArrayList<Elemento>();
	
	public void agrega(Elemento e) {
		a.add(e);
	}
	
	public int numeroElementos() {
		return a.size();
	}
	
	public double importeTotal() {
		double total = 0;
		for(Elemento e : a) {
			total+= e.getCantidad() * e.getPrecio();
		}
		
		return total;
	}
	
	public String toString() {
		String pinta = "Contenido del carrito\n==================\n";
		for(Elemento e : a) {
			pinta += e+"\n";
		}
		
		return pinta;
	}
	

}
