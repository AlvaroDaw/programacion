/**
 * GatoSimple.java
 * Definicion de la clase GatoSimple
 * 
 * @author Alvaro Ramirez
 *
 */
public class GatoSimple {
	//atributos
	String color,raza,sexo;
	int edad;
	double peso;
	
	//metodos
	
	//constructor
	GatoSimple (String s){
		this.sexo = s;
	}
	
	//getter
	String getsexo() {
		return this.sexo;
	}
	
	/**
	 * Hace que el gato maulle
	 */
	void maulla() {
		System.out.println("Miauuuu");
	}
	
	/**
	 * Hace que el gato ronronee
	 */
	void ronronea() {
		System.out.println("Mrrrr");
	}
	
	/**
	 * Hace que el gato coma
	 * A los gatos les gusta el pescado, rechazara cualquier otra cosa
	 * @param comida la comida que le ofrecemos al gato
	 * 
	 */
	void come(String comida) {
		if(comida.equals("pescado")) {
			System.out.println("Hmmm, gracias");
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
		if(this.sexo.equals("hembra")) {
			System.out.println("No me gusta pelear");
		}else if(contrincante.getsexo().equals("hembra")) {
			System.out.println("No peleo contra gatitas");
		}else {
			System.out.println("Ven aqui que te vas a enterar");
		}
	}

}
