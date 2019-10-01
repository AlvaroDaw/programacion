/**
 * Ejercicio05
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir deberá
 * estar almacenada en una variable.
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio05 {
	public static void main(String[] args) {
		
		//Declarar variables y asignar valores
		int pesetas= 28701;
		
		double euros= (double)(pesetas/166.386); //Hacer casting a double para mostrar la cantidad de euros en decimales
		
		System.out.printf("%d pesetas son: %.2f€", pesetas, euros);
	}

}
