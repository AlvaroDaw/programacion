/**
 * Pizza.java
 * Definicion de la clase Pizza
 * 
 * @author Alvaro Ramirez
 *
 */
public class Pizza {
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	
	private String tamaño;
	private String tipo;
	private String estado;
	
	public Pizza(String tipo, String tamaño) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = "pedida";
		totalPedidas++;
	}
	
	public String toString() {
		return "pizza " + this.tipo + " " + this.tamaño + ", "+this.estado;
	}
	
	public static int getPedidas() {
		return totalPedidas;
	}
	
	public static int getServidas() {
		return totalServidas;
	}
	
	public void sirve() {
		if(this.estado == "servida") {
			System.out.println("Esta pizza ya se ha pedido");
		}else {
			this.estado = "servida";
			totalServidas++;
		}
	}

}
