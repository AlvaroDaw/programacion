/**
 * Ejercicio04
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en pesetas que se quiere
 * convertir debera estar almacenada en una variable
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio04 {
	public static void main(String[] args) {
		
		//Declarar variables y asignar valores
		double euros = 172.50;
		
		int pesetas = (int)(166.386 * euros);	//Hacer casting al resultado para que la cantidad de pesetas no se muestre con decimales
		
		System.out.println(euros+"€ son: "+pesetas+" pesetas");
	}

}
