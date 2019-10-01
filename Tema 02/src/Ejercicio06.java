/**
 * Ejercicio06
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base imponible
 * (precio sin IVA). La base imponible estará almacenada en una variable
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio06 {
	public static void main(String[] args) {
		
		//Declarar variables y asignar valores
		double precioSinIva = 52.50;
		double iva = precioSinIva * 0.21;
		double total = precioSinIva + iva;
		
		System.out.printf("Precio sin IVA: %.2f€\n", precioSinIva);
		System.out.printf("IVA:            %.2f€\n", iva);
		System.out.println("----------------------");
		System.out.printf("Precio final:   %.2f€", total);
		
	}

}
