/**
 * Ejercicio 10
 * 
 * Realiza el juego del tres en raya
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class EjercicioBD10 {
	static final String jugador = "X";
	static final String maquina = "O";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[][] tablero = new String[3][3];
		int i;
		int j;
		int movimiento = 0;
		boolean jugadorGana = false;
		boolean maquinaGana = false;
		String nombreFila = "cba";
		String coordenadas;
		int fila = 0;
		int columna = 0;
		
		//Inicializa el tablero
		for(i = 0; i < tablero.length; i++) {
			for(j = 0; j < tablero.length; j++) {
				tablero[i][j] = " ";
			}
		}
		
		//Juego
		do {
			
			//Pinta el tablero
			System.out.println("	");
			for(i = 0; i < tablero.length; i++) {
				System.out.print(nombreFila.charAt(i)+" ");
				for(j = 0; j < tablero.length; j++) {
					System.out.print("| "+tablero[i][j]+" ");
				}
				System.out.println("|");
				System.out.println(" --------------");
			}
			System.out.println("    1   2   3\n");
			
			//Pide las coordenadas
			System.out.print("Introduce las coordenadas, por ejemplo b2: ");
			coordenadas = s.next();
			fila = nombreFila.indexOf(coordenadas.charAt(0));
			columna = coordenadas.charAt(1)-1-48;
			tablero[fila][columna] = jugador;
			movimiento++;
			
			//Comprueba si gana el jugador
			jugadorGana = (
					(tablero[0][0] == jugador)&&(tablero[0][1] == jugador)&&(tablero[0][2] == jugador)
				||	(tablero[1][0] == jugador)&&(tablero[1][1] == jugador)&&(tablero[1][2] == jugador)
				||	(tablero[2][0] == jugador)&&(tablero[2][1] == jugador)&&(tablero[2][2] == jugador)
				||	(tablero[0][0] == jugador)&&(tablero[1][0] == jugador)&&(tablero[2][0] == jugador)
				||	(tablero[0][1] == jugador)&&(tablero[1][1] == jugador)&&(tablero[2][1] == jugador)
				||	(tablero[0][2] == jugador)&&(tablero[1][2] == jugador)&&(tablero[2][2] == jugador)
				||	(tablero[0][0] == jugador)&&(tablero[1][1] == jugador)&&(tablero[2][2] == jugador)
				||	(tablero[0][2] == jugador)&&(tablero[1][1] == jugador)&&(tablero[2][0] == jugador)
					);
			
			if(!jugadorGana && (movimiento < 9)) {
				//juega el ordenador
				do {
					fila = (int)(Math.random()*3);
					columna = (int)(Math.random()*3);
				}while(!tablero[fila][columna].equals(" "));
				
				tablero[fila][columna] = maquina;
				movimiento++;
				
				//Comprueba si gana el ordenador
				maquinaGana = (
						(tablero[0][0] == maquina)&&(tablero[0][1] == maquina)&&(tablero[0][2] == maquina)
					||	(tablero[1][0] == maquina)&&(tablero[1][1] == maquina)&&(tablero[1][2] == maquina)
					||	(tablero[2][0] == maquina)&&(tablero[2][1] == maquina)&&(tablero[2][2] == maquina)
					||	(tablero[0][0] == maquina)&&(tablero[1][0] == maquina)&&(tablero[2][0] == maquina)
					||	(tablero[0][1] == maquina)&&(tablero[1][1] == maquina)&&(tablero[2][1] == maquina)
					||	(tablero[0][2] == maquina)&&(tablero[1][2] == maquina)&&(tablero[2][2] == maquina)
					||	(tablero[0][0] == maquina)&&(tablero[1][1] == maquina)&&(tablero[2][2] == maquina)
					||	(tablero[0][2] == maquina)&&(tablero[1][1] == maquina)&&(tablero[2][0] == maquina)
						);
			}
			
		}while(!jugadorGana && !maquinaGana && (movimiento<9));
		
		//Pinta el tablero
		System.out.println("	");
		for(i = 0; i < tablero.length; i++) {
			System.out.print(nombreFila.charAt(i)+" ");
			for(j = 0; j < tablero.length; j++) {
				System.out.print("| "+tablero[i][j]+" ");
			}
			System.out.println("|");
			System.out.println(" --------------");
		}
		System.out.println("    1   2   3\n");
		
		if(jugadorGana) {
			System.out.println("Enhorabuena, has ganado.");
		}else if(maquinaGana) {
			System.out.println("Gana el ordenador");
		}else {
			System.out.println("Empate.");
		}
		s.close();
	}

}
