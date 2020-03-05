import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		HashMap<String,String> a = new HashMap<String,String>();
		
		a.put("teclado", "keyboard");
		a.put("cigarro", "cigarette");
		a.put("mesa", "table");
		a.put("ordenador", "computer");
		a.put("raton", "mouse");
		a.put("mechero", "lighter");
		a.put("filtros", "filters");
		a.put("ojos", "eyes");
		a.put("espejo", "mirror");
		a.put("manos", "hands");
		a.put("botella", "bottle");
		a.put("zumo", "juice");
		a.put("amor", "love");
		a.put("odio", "hate");
		a.put("carpeta", "folder");
		a.put("video", "video");
		
		int i;
		int numero;
		
		//Guardo todas las claves en un array de String
		String[] claves = a.keySet().toArray(new String[0]);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for(i = 0; i < 5; i++) {
			do {
				numero = (int)(Math.random()*16);
				
			}while(b.contains(numero));
			
			b.add(numero);
		}
		
		int correctas = 0;
		int incorrectas = 0;
		String respuesta;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Introduce la traduccion de las palabras.");
			System.out.print(claves[b.get(i)]+": ");
			respuesta = s.next();
			
			if(respuesta.equals(a.get(claves[b.get(i)]))) {
				System.out.println("Respuesta correcta");
				correctas++;
			}else {
				System.out.println("Respuesta incorrecta");
				incorrectas++;
			}
		}
		
		System.out.println("Tu puntuacion es: "+correctas+" respuestas correctas y "+incorrectas+" incorrectas");
		
		
		
		
		
	}
}
