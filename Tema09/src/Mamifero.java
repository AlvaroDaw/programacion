/**
 * Mamifero.java
 * Definicion de la clase Mamifero
 * 
 * @author Alvaro Ramirez
 *
 */
public abstract class Mamifero extends Animal{
	public Mamifero() {
		super();
	}
	
	public Mamifero(Sexo s) {
		super(s);
	}
	
	public void come() {
		System.out.println("Nom nom nom");
	}
	
	public void anda() {
		System.out.println("Estoy andando");
	}
	
	public void amamanta() {
		if(this.getSexo()== Sexo.MACHO) {
			System.out.println("No puedo amamantar crias");
		}else if(this.getSexo() == Sexo.HEMBRA) {
			System.out.println("Estoy amamantando mis crias");
		}
	}

}
