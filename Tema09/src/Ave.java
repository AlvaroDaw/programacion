/**
 * Ave.java
 * Definicion de la clase Ave
 * @author Alvaro Ramirez
 *
 */
public class Ave extends Animal{
	public Ave(Sexo s) {
		super(s);
	}
	
	public Ave() {
		super();
	}
	
	/**
	 * Hace que el Ave se limpie
	 */
	public void aseate() {
		System.out.println("Me estoy limpiando las plumas");
	}
	
	/**
	 * Hace que el ave levante el vuelo
	 */
	public void vuela() {
		System.out.println("Estoy volando");
	}

}