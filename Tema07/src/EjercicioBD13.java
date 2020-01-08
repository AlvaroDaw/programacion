/**
 * Ejercicio 13
 * 
 * Realiza un programa que calcule la estatura media, minima y maxima en centimetros de personas de
 * diferentes paises. El array que contiene los nombres de los paises es el siguiente:
 * pais = {"España", "Rusia", "Japon","Australia"}. Los datos sobre las estaturas se deben simular
 * mediante un array de 4 filas por 10 columnas con numeros aleatorios generados al azar entre 140
 * y 210. Los decimales de la media se pueden despreciar. Los nombres de los paises se deben mostrar
 * utilizando el array de paises (No se pueden escribir directamente).
 * 
 * @author Alvaro Ramirez
 *
 */
public class EjercicioBD13 {
	public static void main(String[] args) {
		String pais[] = {"España", "Rusia", "Japon","Australia"};
		int estatura[][] = new int[4][10];
		int i;
		int j;
		int med = 0;
		
		//Inicia el array
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 10; j++) {
				estatura[i][j] = (int)(Math.random()*71+140);
			}
		}
		
		//Muestra el array
		System.out.printf("%64s ", "MED MIN MAX");
		System.out.println();
		for(i = 0; i < 4; i++) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			System.out.printf("%9s: ", pais[i]);
			for(j = 0; j < 10; j++) {
				System.out.printf("%-4d", (estatura[i][j]));
				med += estatura[i][j];
				if(estatura[i][j] > max) {
					max = estatura[i][j];
				}else if(estatura[i][j] < min) {
					min = estatura[i][j];
				}
			}
			med /= 10;
			System.out.print("| "+med+" "+min+" "+max);
			System.out.println();
			med = 0;
		}
	}

}
