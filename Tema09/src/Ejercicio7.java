
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Zona SalaPrincipal = new Zona(1000);
		Zona Compraventa = new Zona(200);
		Zona vip = new Zona(25);
		int destacado;
		
		int nentrada;
		int sala;
		
		do {
			
		System.out.println("Menú.");
		System.out.println("1. Mostrar numero de entradas libres");
		System.out.println("2. Vender entradas");
		System.out.println("3. Salir");
		System.out.println("Elige una opcion:");
		destacado = s.nextInt();
		
		if(destacado == 1) {
			System.out.println("Sala principal: "+ SalaPrincipal.getEntradasPorVender());
			System.out.println("Compra-venta: "+ Compraventa.getEntradasPorVender());
			System.out.println("Sala vip: "+ vip.getEntradasPorVender());
		}else if(destacado == 2) {
			System.out.println("¿En que zona quiere comprar su entrada?");
			System.out.println("1. Sala principal");
			System.out.println("2. Compra-venta");
			System.out.println("3. Sala vip");
			sala = s.nextInt();
			
			System.out.println("¿Cuantas entradas quiere?");
			nentrada = s.nextInt();
			
			if(sala == 1) {
				SalaPrincipal.vender(nentrada);
			}else if(sala == 2) {
				Compraventa.vender(nentrada);
			}else if(sala == 3) {
				vip.vender(nentrada);
			}
		}
		System.out.println("------------------------------------------");
		}while(destacado != 3);
	}

}
