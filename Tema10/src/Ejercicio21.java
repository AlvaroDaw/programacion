import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		HashMap <String,String> habitat = new HashMap<String,String>();
		HashMap <String,String> alimentacion = new HashMap<String,String>();
		
		habitat.put("rana", "En los tropicos y cerca de las zonas humedas y acuaticas");
		habitat.put("salamandra", "Ecosistemas humedos");
		habitat.put("sapo", "En cualquier sitio salvo el desierto y la antartida");
		habitat.put("triton", "America y Africa");
		alimentacion.put("rana", "Larvas e insectos");
		alimentacion.put("salamandra", "Pequeños crustaceos e insectos");
		alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores");
		alimentacion.put("triton", "Insectos");
		
		String respuesta = "";
		
		do {
			System.out.print("Introduce un tipo de anfibio: ");
			respuesta = s.next();
			
			if(!respuesta.equals("salir")) {
				if(habitat.containsKey(respuesta) && alimentacion.containsKey(respuesta)) {
					System.out.println("Habitat: "+habitat.get(respuesta));
					System.out.println("Alimentacion: "+alimentacion.get(respuesta));
				}else {
					System.out.println("No conozco ese anfibio");
				}
			}
			
		}while(!respuesta.equals("salir"));
	}

}
