/**
 * Realizar un programa en Java que solicite interactivamente el nombre, la cantidad y el precio 
 * de 4 productos, así como el tipo de IVA aplicado a cada uno de ellos.
 *
 * Una vez recogidos los datos, el programa deberá realizar los cálculos necesarios para mostrar 
 * por pantalla un Ticket de la compra.
 *
 * En dicho ticket se detallará el nombre de cada producto, la cantidad, el precio y el importe 
 * correspondiente al IVA de cada producto (un producto por línea). Después, se deberá indicar 
 * el importe total (sin IVA) y la cantidad correspondiente al IVA. Finalmente, deberá mostrarse 
 * el precio final con iva incluido.
 *
 * El programa deberá presentar alineados a la izquierda los nombres de los productos, y alineados
 * a la derecha (en columnas) las cantidades de producto, precios y cantidades asociadas al IVA. 
 * Los precios deberán mostrarse siempre con 2 decimales (céntimos de Euro).
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Factura {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String pro1,pro2,pro3,pro4 = "";
		double x1,x2,x3,x4;
		int cant1,cant2,cant3,cant4;
		double iva1,iva2,iva3,iva4;
		double total,totaliva;
		String p = "Producto";
		String c = "Cantidad";
		String pr = "Precio";
		String i = "IVA";
		
		
		System.out.println("Introduce el nombre del producto 1: ");
		pro1 = s.next();
		System.out.println("Cantidad: ");
		cant1 = s.nextInt();
		System.out.println("Precio: ");
		x1 = s.nextDouble();
		System.out.println("IVA aplicable: ");
		iva1 = s.nextDouble();
		
		System.out.println("Introduce el nombre del producto 2: ");
		pro2 = s.next();
		System.out.println("Cantidad: ");
		cant2 = s.nextInt();
		System.out.println("Precio: ");
		x2 = s.nextDouble();
		System.out.println("IVA aplicable: ");
		iva2 = s.nextDouble();
		
		System.out.println("Introduce el nombre del producto 3: ");
		pro3 = s.next();
		System.out.println("Cantidad: ");
		cant3 = s.nextInt();
		System.out.println("Precio: ");
		x3 = s.nextDouble();
		System.out.println("IVA aplicable: ");
		iva3 = s.nextDouble();
		
		System.out.println("Introduce el nombre del producto 4: ");
		pro4 = s.next();
		System.out.println("Cantidad: ");
		cant4 = s.nextInt();
		System.out.println("Precio: ");
		x4 = s.nextDouble();
		System.out.println("IVA aplicable: ");
		iva4 = s.nextDouble();
		
		total = x1+x2+x3+x4;
		totaliva = ((x1*(iva1/100))+(x2*(iva2/100))+(x3*(iva3/100))+(x4*(iva4/100)));
		
		System.out.printf("%-10s %7s %7s %7s \n", p,c,pr,i);
		System.out.printf("%-10s %7d %7.2f€ %7.2f \n", pro1,cant1,x1,iva1);
		System.out.printf("%-10s %7d %7.2f€ %7.2f \n", pro2,cant2,x2,iva2);
		System.out.printf("%-10s %7d %7.2f€ %7.2f \n", pro3,cant3,x3,iva3);
		System.out.printf("%-10s %7d %7.2f€ %7.2f \n", pro4,cant4,x4,iva4);
		System.out.println("----------------------------------------------------");
		System.out.printf("Total: %-3.2f€            IVA %5.2f€ \n", total,totaliva);
		System.out.println("Total del importe con IVA: "+(total+totaliva)+"€");
		
		s.close();
	}

}
