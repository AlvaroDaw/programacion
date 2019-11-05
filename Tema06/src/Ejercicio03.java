/**
 * Ejercicio 03
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizara la baraja de 40 cartas
 * 2,3,4,5,6,7,sota,caballo,rey y as
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio03 {
	public static void main(String[] args) {
		String palo = "";
		String carta;
		
		int tipopalo = (int)(Math.random()*4)+1;
		
		switch(tipopalo) {
		case 1:
			palo = "oros";
			break;
		
		case 2:
			palo = "copas";
			break;
			
		case 3:
			palo = "espadas";
			break;
		
		case 4:
			palo = "bastos";
			break;
		default:
		}
		
		int n = (int)(Math.random()*13)+1;
		
		switch(n) {
		case 11:
			carta = "sota";
			break;
			
		case 12:
			carta = "caballo";
			break;
			
		case 13:
			carta = "rey";
			break;
			
		case 1:
			carta = "as";
			break;
			
		default:
			carta = String.valueOf(n);
		}
		
		System.out.println(carta+" de "+palo);
	}

}
