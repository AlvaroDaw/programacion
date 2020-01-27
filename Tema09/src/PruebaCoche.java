/**
 * PruebaCoche.java
 * Programa que prueba la clase Coche
 * @author Alvaro Ramirez
 *
 */
public class PruebaCoche{
	public static void main(String[] args) {
		
		Coche cocheDeAlvaro = new Coche("Seat","Leon");
		Coche cocheDeLucia = new Coche("Renault","Clio");
		
		cocheDeAlvaro.recorre(80);
		cocheDeAlvaro.recorre(30);
		cocheDeAlvaro.recorre(40);
		cocheDeLucia.recorre(30);
		cocheDeLucia.recorre(10);
		cocheDeLucia.recorre(120);
		System.out.println("El coche de Alvaro ha recorrido "+cocheDeAlvaro.getKilometraje()+"Km");
		System.out.println("El coche de Lucia ha recorrido "+cocheDeLucia.getKilometraje()+"Km");
		System.out.println("El kilometraje total ha sido de "+Coche.getKilometrosCoche()+"Km");
		
	}

}
