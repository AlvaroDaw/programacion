import java.util.Scanner;

public class Array5 {
	
	static int N = 100;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Gestisimal[] articulo= new Gestisimal[N];
		
		for(int i = 0; i < N; i++) {
			articulo[i] = new Gestisimal();
		}
		
		String codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		int opcion;
		int i;
		
		do {
			System.out.println("\nALMACEN");
			System.out.println("===============");
			System.out.println("1. Listado.");
			System.out.println("2. Alta.");
			System.out.println("3. Baja.");
			System.out.println("4. Modificacion.");
			System.out.println("5. Entrada de mercancia.");
			System.out.println("6. Salida de mercancia.");
			System.out.println("7. Salir.");
			System.out.print("Introduce una opcion: ");
			opcion = s.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Listado.");
				System.out.println("=======");
				for(i = 0; i < N; i++) {
					if(!articulo[i].getCodigo().equals("LIBRE")) {
						System.out.println(articulo[i].toString());
					}
				}
				
				break;
				
			case 2:
				i = -1;
				
				do {
					i++;
				}while(!articulo[i].getCodigo().equals("LIBRE"));
				
				System.out.println("Introduce los datos.");
				System.out.print("Codigo: ");
				codigo = s.next();
				articulo[i].setCodigo(codigo);
				
				System.out.print("Descripcion: ");
				descripcion = s.next();
				articulo[i].setDescripcion(descripcion);
				
				System.out.print("Precio de compra: ");
				precioCompra = s.nextDouble();
				articulo[i].setPrecioDeCompra(precioCompra);
				
				System.out.print("Precio de venta: ");
				precioVenta = s.nextDouble();
				articulo[i].setPrecioDeVenta(precioVenta);
				
				System.out.print("Stock: ");
				stock = s.nextInt();
				articulo[i].setStock(stock);
				
				break;
				
			case 3:
				System.out.println("Para dar de baja un producto, introduce su codigo: ");
				codigo = s.next();
				i = -1;
				
				do {
					i++;
				}while(!articulo[i].getCodigo().equals(codigo));
				
				System.out.print(articulo[i].toString());
				System.out.println("Vuelve a introducir el codigo para confirmar:");
				codigo = s.next();
				
				if(articulo[i].getCodigo().equals(codigo)) {
					articulo[i].setCodigo("LIBRE");
					System.out.println("Borrado con exito.");
				}
				break;
				
			case 4:
				System.out.println("MODIFICACION");
				System.out.println("============");
				System.out.println("Introduce el codigo de articulo a modificar:");
				codigo = s.next();
				i = -1;
				
				do {
					i++;
				}while(!articulo[i].getCodigo().equals(codigo));
				
				System.out.println("Introduce los nuevos datos.");
				System.out.print("Codigo: ");
				codigo = s.next();
				articulo[i].setCodigo(codigo);
				
				System.out.print("Descripcion: ");
				descripcion = s.next();
				articulo[i].setDescripcion(descripcion);
				
				System.out.print("Precio de compra: ");
				precioCompra = s.nextDouble();
				articulo[i].setPrecioDeCompra(precioCompra);
				
				System.out.print("Precio de venta: ");
				precioVenta = s.nextDouble();
				articulo[i].setPrecioDeVenta(precioVenta);
				
				System.out.print("Stock: ");
				stock = s.nextInt();
				articulo[i].setStock(stock);
				
				break;
				
			case 5:
				System.out.println("ENTRADA DE MERCANCIA");
				System.out.println("====================");
				System.out.println("Introduce el codigo del articulo: ");
				codigo = s.next();
				i = -1;
				
				do {
					i++;
				}while(!articulo[i].getCodigo().equals(codigo));
				
				System.out.println("¿Cuantas unidades entran?: ");
				stock = s.nextInt();
				articulo[i].setStock(articulo[i].getStock()+stock);
				
				System.out.println("Ahora existen "+articulo[i].getStock()+" unidades.");
				break;
				
			case 6:
				System.out.println("SALIDA DE MERCANCIA");
				System.out.println("===================");
				System.out.println("Introduce el codigo del articulo: ");
				codigo = s.next();
				i = -1;
				
				do {
					i++;
				}while(!articulo[i].getCodigo().equals(codigo));
				
				System.out.println("¿Cuantas unidades salen?: ");
				stock = s.nextInt();
				articulo[i].setStock(articulo[i].getStock()-stock);
				
				System.out.println("Ahora existen "+articulo[i].getStock()+" unidades.");
				break;
				default:
			}
			
		}while(opcion != 7);
	}

}
