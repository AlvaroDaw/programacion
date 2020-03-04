import java.util.ArrayList;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Alvaro Ramirez");
		a.add("Lucia Villena");
		a.add("Francisco Casasola");
		a.add("Alejandro Pacheco");
		a.add("Samuel Ramirez");
		a.add("Diego Perez");
		
		System.out.println("Contenido de la lista: ");
		
		for(String nombre : a) {
			System.out.println(nombre);
		}
	}

}
