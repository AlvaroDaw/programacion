
public class Incidencia {
	
	static int pendientes = 0;
	
	private int codigo;
	private String problema;
	private String estado;
	private int numero = 1;
	private String solucion;
	
	public Incidencia(int n, String s) {
		this.codigo = n;
		this.problema = s;
		this.estado = "pendiente";
		this.numero = numero;
		numero++;
		pendientes++;
		
	}
	
	public static int getpendientes() {
		return pendientes;
	}
	
	public void resuelve(String s) {
		this.estado = "resuelto";
		this.solucion = s;
		pendientes--;
	}
	
	public String toString() {
		if(estado == "resuelto") {
			return "Incidencia " + this.numero + " Puesto: " + this.codigo + " - "+this.problema+" - "+this.estado+" - "+this.solucion;	
		}else {
			return "Incidencia " + this.numero + " Puesto: " + this.codigo + " - "+this.problema+" - "+this.estado;
		}
		
	}
	
	
	

}
