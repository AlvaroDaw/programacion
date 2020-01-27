/**
 * Vehiculo.java
 * Implementacion de la clase vehiculo
 * @author Alvaro Ramirez
 *
 */
public class Vehiculo {
	//atributos de clase
	private static int kilometrosTotales = 0;
	private static int vehiculosCreados = 0;
	
	//atributos
	private int kilometrosRecorridos;
	
	//constructor
	public Vehiculo() {
		this.kilometrosRecorridos = 0;
		vehiculosCreados++;
	}
	
	//metodos
	public int getKilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}
	
	public int getvehiculosCreados() {
		return vehiculosCreados;
	}
	
	public static int getkilometrosTotales() {
		return kilometrosTotales;
	}
	
	public void recorre(int km) {
		this.kilometrosRecorridos += km;
		kilometrosTotales += km;
	}

}
