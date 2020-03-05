import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
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
		
		System.out.print("Introduce una palabra en español: ");
		String palabra = s.next();
		
		if(a.containsKey(palabra)) {
			System.out.println(a.get(palabra));
		}else {
			System.out.println("No conozco esa palabra");
		}
		
	}

}
