import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		HashMap<String,String> paises = new HashMap<String,String>();
		
		paises.put("españa", "Madrid");
		paises.put("francia", "Paris");
		paises.put("portugal", "Lisboa");
		
		String pais = "";
		String capital = "";
		
		do {
			System.out.print("Introduce un pais: ");
			pais = s.next();
			if(paises.containsKey(pais)) {
				System.out.println("La capital es "+paises.get(pais));
			}else {
				System.out.println("No conozco ese pais, dime su capital: ");
				capital = s.next();
				paises.put(pais, capital);
				System.out.println("Vale, he aprendido un pais nuevo");
			}
		}while(!pais.equals("salir"));
		
	}

}
