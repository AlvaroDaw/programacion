/**
 * Alumno.java
 * Definicion de la clase Alumno
 * @author Alvaro Ramirez
 *
 */
public class Alumno {
	
	private String nombre;
	private double notaMedia = 0.0;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

}
