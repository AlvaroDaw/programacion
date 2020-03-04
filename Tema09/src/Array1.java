import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Gato[] gato = new Gato[4];
		
		int i;
		
		System.out.println("\n Por favor, introduce los datos de los gatos.");
		
		for(i = 0; i < 4; i++) {
			gato[i] = new Gato();
			System.out.println(" \n Gato nº "+(i+1));
			System.out.print("Nombre: ");
			gato[i].setNombre(s.next());
			System.out.print("Color: ");
			gato[i].setColor(s.next());
			System.out.print("Raza: ");
			gato[i].setRaza(s.next());
			
		}
		
		System.out.println("\n Datos de los gatos.");
		
		for(i = 0; i < 4; i++) {
			System.out.println("Gato nº "+(i+1));
			System.out.println(gato[i].toString());
		}
		
		
	}

}
