/**
 * Ejercicio 15
 * 
 * Realiza un generador de melodia con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Con las 7 notas musicales.
 * b) Una melodia esta formada por notas mayor o igual a 4, menor o igual a 28 y multiplos de 4.
 * c) Cada grupo de 4 notas será un compas y estará separado del siguiente compas mediante la 
 * 		barra lateral | El final de la melodia se marca con ||
 * d) La ultima nota de la melodia debe coincidir con la primera.
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		int nota;
		int cancion = 4*(int)(Math.random()*7+1);
		int linea = 0;
		int compas = 1;
		String nota1 = "";
		String caracter = "";
		
		System.out.println("Generando cancion");
		
		for(int i = 0; i < cancion; i++) {
			
			nota = (int)(Math.random()*7);
			
			switch(nota) {
			case 0:
				caracter = "do ";
				break;
			case 1:
				caracter = "re ";
				break;
			case 2:
				caracter = "mi ";
				break;
			case 3:
				caracter = "fa ";
				break;
			case 4:
				caracter = "sol ";
				break;
			case 5:
				caracter = "la ";
				break;
			case 6:
				caracter = "si ";
				break;
				default:
			}
			
			if( i == 0) {
				nota1 = caracter;
			}
			
			if (i == cancion -1) {
				caracter = nota1;
			}
			
			System.out.print(caracter);
			
			
			if(i == cancion-1) {
				System.out.print("||");
			}else if(compas == 4) {
				System.out.print("| ");
				compas = 0;
			}
			
			if(linea == 15) {
				System.out.println();
				linea = 0;
			}
			
			compas++;
			linea++;
		}
		
		
	}

}
