/**
 * Gato.java
 * Definicion de la clase Gato
 * 
 * @author Alvaro Ramirez
 *
 */
public class Gato extends Animal{
	private String raza;
	
	public Gato(Sexo s, String r) {
		super(s);
		raza = r;
	}
	
	public Gato(Sexo s) {
		super(s);
		raza = "siames";
	}
	
	public Gato(String r) {
		super(Sexo.HEMBRA);
		raza = r;
	}
	
	public Gato() {
		super(Sexo.HEMBRA);
		raza = "siames";
	}
	
	//Metodos
	public String toString() {
		return super.toString()
				+"Raza: "+this.raza
				+"\n*************************\n";
	}
	
	/**
	 * Hace que el gato maulle
	 */
	public void maulla() {
		System.out.println("Miauuuu");
	}
	
	/**
	 * Hace que el gato ronronee
	 */
	public void ronronea() {
		System.out.println("Mrrrrr");
	}
	
	/**
	 * Hace que el gato coma
	 * A los gatos les gusta el pescado, rechazara cualquier otra cosa
	 */
	public void come(String comida) {
		if(comida.equals("pescado")) {
			System.out.println("Hmmm gracias");
		}else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}
	
	/**
	 * Pone a pelear a dos gatos
	 * Solo se van a pelear dos machos entre si
	 * @param contrincante es el gato contra el que pelear
	 * 
	 */
	void peleaCon(GatoSimple contrincante) {
		if(this.getSexo().equals("hembra")) {
			System.out.println("No me gusta pelear");
		}else if(contrincante.getsexo().equals("hembra")) {
			System.out.println("No peleo contra gatitas");
		}else {
			System.out.println("Ven aqui que te vas a enterar");
		}
	}

}
