import java.util.Scanner;

public class Array3 {
	
	static int N = 100;	//Tamaño del array
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Crea el array de discos
		ColeccionDeDiscos[] album = new ColeccionDeDiscos[N];
		
		//Crea los discos
		for(int i = 0; i < N; i++) {
			album[i] = new ColeccionDeDiscos();
		}
		
		int opcion;
		String codigo;
		String autor;
		String titulo;
		String genero;
		int duracion;
		int primeraLibre;
		int i;
		
		do {
			System.out.println("\nCOLECCION DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado.");
			System.out.println("2. Nuevo Disco.");
			System.out.println("3. Modificar.");
			System.out.println("4. Borrar.");
			System.out.println("5. Salir.");
			System.out.print("Introduce una opcion: ");
			opcion = s.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("\n LISTADO");
				System.out.println("========");
				for(i = 0; i < N; i++) {
					if(!album[i].getCodigo().equals("LIBRE")) {
						System.out.println(album[i]);
					}
				}
				break;
				
			case 2:
				
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
				
				//Busca la primera posicion libre para crear un nuevo disco
				primeraLibre = -1;
				do {
					primeraLibre++;
				}while(!(album[primeraLibre].getCodigo().equals("LIBRE")));
				
				System.out.println("Por favor, introduce los datos.");
				System.out.print("Codigo: ");
				codigo = s.next();
				album[primeraLibre].setCodigo(codigo);
				
				System.out.print("Autor: ");
				autor = s.next();
				album[primeraLibre].setAutor(autor);
				
				System.out.print("Titulo: ");
				titulo = s.next();
				album[primeraLibre].setTitulo(titulo);
				
				System.out.print("Genero: ");
				genero = s.next();
				album[primeraLibre].setGenero(genero);
				
				System.out.print("Duracion: ");
				duracion = s.nextInt();
				album[primeraLibre].setDuracion(duracion);
				
				break;
				
			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("=========");
				System.out.print("Introduce el codigo del disco que quieres modificar: ");
				codigo = s.next();
				
				i = -1;
				
				do {
					i++;
				}while(!album[i].getCodigo().equals(codigo));
				
				System.out.println("Introduce los nuevos datos del disco o INTRO para dejarlo igual");
				
				System.out.println("Codigo: "+(album[i].getCodigo()));
				System.out.print("Codigo: ");
				codigo = s.nextLine();
				if(!codigo.equals("")) {
				album[i].setCodigo(codigo);
				}
				
				System.out.println("Autor: "+(album[i].getAutor()));
				System.out.print("Autor: ");
				autor = s.nextLine();
				if(!autor.equals("")) {
				album[i].setAutor(autor);
				}
				
				System.out.println("Titulo: "+(album[i].getTitulo()));
				System.out.print("Titulo: ");
				titulo = s.nextLine();
				if(!titulo.equals("")) {
				album[i].setTitulo(titulo);
				}
				
				System.out.println("Genero: "+(album[i].getGenero()));
				System.out.print("Genero: ");
				genero = s.nextLine();
				if(!genero.equals("")) {
				album[i].setGenero(genero);
				}
				
				System.out.println("Duracion: "+(album[i].getDuracion()));
				System.out.print("Duracion: ");
				duracion = s.nextInt();
				if(!codigo.equals("")) {
					album[i].setDuracion(duracion);
				}
				
				break;
				
			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");
				
				System.out.println("Introduce el codigo del Disco que quieres borrar:");
				codigo = s.next();
				
				i=-1;
				
				do {
					i++;
				}while(!album[i].getCodigo().equals(codigo));
				
				album[i].setCodigo("LIBRE");
				System.out.println("Album borrado.");
				
				break;
				default:
				
			}
		}while(opcion != 5);
	}

}
