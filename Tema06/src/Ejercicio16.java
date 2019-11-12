/**
 * Ejercicio 16
 * 
 * Simulador de maquina tragaperras
 * 
 * @author Alvaro Ramirez
 *  
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		int x;
		int figura1 = 0;
		int figura2 = 0;
		int figura3 = 0;
	
		for(int i = 0; i < 3; i++) {
			x = (int)(Math.random()*3);
			
			switch (x){
			case 0:
				System.out.print("Corazon |");
				break;
			case 1:
				System.out.print("Diamante |");
				break;
			case 2:
				System.out.print("Herradura |");
				break;
			case 3:
				System.out.print("Campana |");
				break;
			case 4:
				System.out.print("Limon |");
				break;
				default:
			}//fin del switch(x)
			
			switch (i) {
			case 0:
				figura1 = x;
				break;
			case 1:
				figura2 = x;
				break;
			case 2:
				figura3 = x;
				break;
			}//fin del switch(i)
		}//fin del bucle for
		
		System.out.println();
		
		if((figura1 != figura2) && (figura1 != figura3)&& (figura2 != figura3)) {
			System.out.println("Lo siento, has perdido.");
		}else if((figura1 == figura2) && (figura1 == figura3)&&(figura2 == figura3)) {
			System.out.println("Bien! Has ganado 10 monedas.");
		}else {
			System.out.println("Has recuperado tu moneda.");
		}
		
	}

}
