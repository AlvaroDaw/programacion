/**
 * Perro.java
 * Definicion de la clase perro
 * 
 * @author Alvaro Ramirez
 *
 */
public class Perro extends Mamifero{
	
	private String raza = "";
	
	public Perro() {
		super();
	}
	
	public Perro(Sexo s) {
		super(s);
	}
	
	public Perro(Sexo s, String raz) {
		super(s);
		raza = raz;
	}
	
	public String raza() {
		return this.raza;
	}
	
	public void aulla() {
		System.out.println("Aauuuu");
	}
	
	public void muerde() {
		System.out.println("Perro usó mordisco");
	}
	
	public void come() {
		System.out.println("Nom nom nom");
	}
	

}
