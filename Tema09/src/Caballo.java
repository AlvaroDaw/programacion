/**
 * Caballo.java
 * Implementacion de la clase Caballo
 * @author Alvaro Ramirez
 *
 */
public class Caballo {
	
	private String nombre;
	private String raza;
	private Sexo sexo;
	private String color;
	
	//Constructor
	Caballo(String no, String ra, Sexo s, String co){
		this.nombre = no;
		this.raza = ra;
		this.sexo = s;
		this.color = co;
		
	}
	
	//Metodos
	public String getNombre() {
		return nombre;
	}
	
	public void cabalga() {
		System.out.println("Tocotoo tocotoo tocotoo");
	}
	
	public void relincha() {
		System.out.println("Hiiiieeeee");
	}
	
	public void rumia() {
		System.out.println("Ñam ñam ñam");
	}
	
	
	

}
