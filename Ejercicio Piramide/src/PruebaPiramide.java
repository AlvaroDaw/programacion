import java.util.Scanner;
public class PruebaPiramide {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int altura;
		String caracter = "";
		
		System.out.println("Crea una piramide.");
		do {
			System.out.println("Introduce la altura inicial de la piramide (Min.2): ");
			altura = s.nextInt();
		}while(altura < 2);
		
		System.out.println("Introduce el caracter para pintar la piramide: ");
		caracter = s.next();
		
		Piramide prueba = new Piramide(altura,caracter);
		System.out.println(prueba.toString());
		
		int opcion;
		
		do {
			System.out.println("Menu:");
			System.out.println("1. Aumentar tamaño de piramide");
			System.out.println("2. Disminuir tamaño de piramide");
			System.out.println("3. Cambiar caracter de dibujo");
			System.out.println("4. Finalizar");
			System.out.println("Elija una opcion: ");
			opcion = s.nextInt();
			
			if(opcion == 1) {
				System.out.println("Introduce en cuantas filas quiere aumentar la piramide:");
				prueba.Aumenta(altura= s.nextInt());
				System.out.println(prueba.toString());
			}else if(opcion == 2) {
				System.out.println("Introduce en cuantas filas quiere disminuir la piramide:");
				prueba.Disminuye(altura = s.nextInt());
				System.out.println(prueba.toString());
			}else if(opcion == 3) {
				System.out.println("Introduce el numero caracter para dibujar: ");
				prueba.setCaracter(caracter = s.next());
				System.out.println(prueba.toString());
			}else if(opcion == 4) {
				System.out.println("Adios");
			}
		}while(opcion != 4);
		
		
	}

}
