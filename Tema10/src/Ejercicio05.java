import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio05 {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 HashMap<String,Integer> a = new HashMap<String,Integer>();
		 
		 String usuario;
		 int pass;
		 int intentos = 3;
		 
		 a.put("Alvaro", 1234);
		 a.put("Lucia", 123);
		 a.put("Casasola", 12345);
		 a.put("Pacheco", 321);
		 a.put("Samu", 4321);
		 
		 do {
			 System.out.print("Introduce usuario: ");
			 usuario = s.next();
			 System.out.print("Introduce contraseña: ");
			 pass = s.nextInt();
			 
			 if(a.containsKey(usuario)) {
				 if(a.get(usuario).equals(pass)) {
					 System.out.println("Has accedido.");
					 intentos = 0;
				 }else {
					 System.out.println("Contraseña incorrecta.");
				 }
			 }else {
				 System.out.println("El usuario no existe.");
				 System.out.println("Le quedan "+(intentos-1)+" intentos");
			 }
			 
			 intentos--;
			 
		 }while(intentos > 0);
		 
		 s.close();
		 
	}

}
