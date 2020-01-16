/**
 * Pinguino.java
 * Definicion de la clase pinguino
 * @author Alvaro Ramirez
 *
 */
public class Pinguino extends Ave{
	
	public Pinguino() {
		super();
	}
	
	public Pinguino(Sexo s) {
		super(s);
	}
	
	/**
	 * El pinguino se siente triste porque no puede volar
	 */
	@Override
	public void vuela() {
		System.out.println("No puedo volar");
	}
	

}
