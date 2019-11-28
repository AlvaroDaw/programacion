/**
 * Ejercicio 04
 * 
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan
 * en la pantalla con un peque�o retardo, dando la impresi�n de que el ordenador se queda pensando
 * antes de mostrar los numeros
 * 
 * @author Alvaro Ramirez
 *
 */
public class EjercicioBD04 {
	public static void main(String[] args)throws InterruptedException {
		int [][] n = new int[4][5];
		
		System.out.println("Introduce 20 numeros enteros separados por INTRO.");
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				n[i][j] = (int)(Math.random()*900+100);
			}
		}
		int columna,fila = 0;
		int sumafila = 0;
		int sumacolumna = 0;
		int sumatotal = 0;
		
		//Pinta tabla
		
		for(fila = 0; fila < 4; fila++) {
			sumafila = 0;
			sumacolumna = 0;
			
			for(columna = 0; columna <= 5; columna++) {	
				if(columna == 5) {
					Thread.sleep(500);
					System.out.printf("%-9d  ", sumafila);
				}else {
					System.out.printf("%-9d  ", n[fila][columna]);
					sumafila += n[fila][columna];
				}
				sumatotal += sumafila;
			}
			System.out.println();
			
		}
		
		for(columna = 0; columna < 5; columna++) {
			sumacolumna = 0;
			for(int i = 0; i < 4; i++) {
				sumacolumna += n[i][columna];
			}
			sumatotal += sumacolumna;
			System.out.printf("%-9d  ", sumacolumna);
			
		}
		Thread.sleep(500);
		System.out.printf("%-9d  ", sumatotal);
		//Fin tabla
	}

}
