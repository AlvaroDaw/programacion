/**
 * Ejercicio 01
 * 
 * Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores
 * 144 y 999 respectivamente. A continuacion, muestra por pantalla el valor de cada variable, la suma,
 * la resta, la division y la multiplicacion
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio01 {
	public static void main(String[] args) {
		
		//Declarar variables y asignar valores
		int x=144;
		int y=999;
		
		//Mostrar por pantalla resultados
		System.out.println("El valor de x es: "+x);
		System.out.println("El valor de y es: "+y);
		System.out.println("La suma de "+x+" e "+y+" es: "+(x+y));
		System.out.println("La resta de "+x+" e "+y+" es: "+(x-y));
		System.out.println("La division de x e y es: "+((double)x/(double)y)); //Hacer casting a Double para poder mostrar decimales
		System.out.println("La multiplicacion de x e y es: "+(x*y));
	}

}
