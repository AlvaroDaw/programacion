/**
 * Ejercicio 3
 * Pruebas
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Perro kiwi = new Perro(Sexo.MACHO, "labrador");
		
		
		System.out.println("Mi raza es "+kiwi.raza());
		System.out.println(kiwi.toString());
		kiwi.amamanta();
		kiwi.aulla();
	}

}
