/**
 * Ejercicio 11
 * 
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con
 * numeros aleatorios entre 200 y 300. A continuación, el programa debe mostrar los numeros de la
 * diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, asi como el
 * maximo, el minimo, y la media de los numeros que hay en esa diagonal.
 * 
 * @author Alvaro Ramirez
 *
 */
public class EjercicioBD11 {
	public static void main(String[] args) {
		int array[][] = new int [10][10];
		int i;
		int j;
		int esquina = 0;
		int contador = 0;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int sumatotal = 0;
		
		//Inicia el array.
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array.length; j++) {
				array[i][j] = (int)(Math.random()*101+200);
			}
		}
		
		//Muestra el array
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array.length; j++) {
				System.out.printf("%-4d", (array[i][j]));
			}
			System.out.println();
		}
		
		//Dice los numeros de las esquinas
		System.out.print("Los numeros de la diagonal son: ");
		for(i = 0; i < array.length; i++) {
			System.out.print(array[i][esquina]+", ");
			sumatotal += array[i][esquina];
			if(array[i][esquina] > maximo) {
				maximo = array[i][esquina];
			}else if(array[i][esquina] < minimo) {
				minimo = array[i][esquina];
			}
			contador++;
			esquina++;
		}
		
		//Muestra resultado.
		System.out.println();
		System.out.println("El numero maximo es: "+maximo);
		System.out.println("El numero minimo es: "+minimo);
		System.out.println("La media de los numeros es: "+(sumatotal/contador));
	}

}
