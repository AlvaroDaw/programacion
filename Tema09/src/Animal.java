/**
 * Animal.java
 * Definicio de la clase Animal
 * 
 * @author Alvaro Ramirez
 *
 */
public abstract class Animal {
	private Sexo sexo;
	
	//Constructor
	public Animal() {
		sexo = Sexo.MACHO;
	}
	
	public Animal(Sexo s) {
		sexo = s;
	}
	
	//Metodo getter
	public Sexo getSexo() {
		return sexo;
	}
	
	//Otros metodos
	public String toString() {
		return "Sexo: " +this.sexo +"\n";
	}
	
	/**
	 * Hace que el animal se eche a dormir
	 */
	public void duerme() {
		System.out.println("Zzzzz");
	}

}
