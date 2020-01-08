/**
 * Ejercicio 2
 * 
 * @author Alvaro Ramirez Escribano
 *
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		int fila = (int)(Math.random()*8+1);
		int columna = (int)(Math.random()*8+1);
		int x[][] = new int[fila][columna];
		
		for(int i = 0; i < fila; i++) {
			for(int j = 0; j < columna; j++) {
				x[i][j] = (int)(Math.random()*99+1);
			}
		}
		
		System.out.print(presentaMatrizConLineas(x));
	}
	
	public static String presentaMatrizConLineas(int x[][]){
		String resultado = "";
		
			for(int i = 0; i < x.length; i++) {
				for(int y = 0; y < x[0].length; y++) {
					if(y == x[0].length-1 && i == 0) {
						resultado+= "┬──┐";
					}else if(i < 1){
						resultado += "┬──";
					}
				}
				resultado += "\n";
				for(int j = 0; j < x[0].length; j++) {
					if(x[i][j] < 10) {
						resultado += "│ "+x[i][j];
					}else {
						resultado += "│"+x[i][j];
					}
				}
				resultado += "│\n";
				
				resultado += "├";
				for(int y = 0; y < x[0].length; y++) {
					if(y == x[0].length-1 ) {
						resultado += "──┤";
					}else {
						resultado += "──┼";
					}
				}
				
				
			}
		return resultado;
	}

}
