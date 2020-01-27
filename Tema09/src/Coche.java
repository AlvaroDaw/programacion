/**
 * Coche.java
 * Definicion de la clase Coche
 * @author Alvaro Ramirez
 *
 */
public class Coche extends Vehiculo{
	
	private static int kilometrosCoche = 0;
	
	//metodo de clase
	private String marca;
	private String modelo;
	
	public Coche(String ma, String mo) {
		super();
		marca = ma;
		modelo = mo;
		
	}
	
	public Coche() {
		super();
	}
	
	public int getKilometraje() {
		return super.getKilometrosRecorridos();
	}
	
	public int getKilometrajeTotal() {
		return super.getkilometrosTotales();
	}
	
	public static int getKilometrosCoche() {
		return kilometrosCoche;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	/**
	 * Recorre una determinada distancia
	 * @param km distancia a recorrer en kilometros
	 */
	public void recorre(int km) {
		super.recorre(km);
		kilometrosCoche += km;
	}
	
	public void quemaRueda() {
		System.out.println("Estoy quemando rueda.");
	}

}
