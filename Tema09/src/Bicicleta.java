/**
 * Bicicleta.java
 * Definicion de la clase Bicileta
 * @author Alvaro Ramirez
 *
 */
public class Bicicleta extends Vehiculo{
	private static int kilometrosBicicleta = 0;
	
	private String marca;
	private String modelo;
	
	public Bicicleta () {
		super();
	}
	
	public Bicicleta(String ma, String mo) {
		super();
		marca = ma;
		modelo = mo;
	}
	
	public static int getKilometrosBicicleta() {
		return kilometrosBicicleta;
	}
	
	public void recorre(int km) {
		super.recorre(km);
		kilometrosBicicleta+= km;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void hazElCaballito() {
		System.out.println("Estoy haciendo el caballito");
	}

}
