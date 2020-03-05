import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		HashMap<String,Double> a = new HashMap<String,Double>();
		
		a.put("avena",2.21);
		a.put("garbanzos",2.39 );
		a.put("tomate", 1.59);
		a.put("jenjibre", 3.13);
		a.put("quinoa", 4.50);
		a.put("guisantes", 1.60);
		
		ArrayList<String> producto = new ArrayList<String>();
		ArrayList<Integer> cantidad = new ArrayList<Integer>();
		
		String compra;
		int cant = 0;
		
		do {
			System.out.print("Producto: ");
			compra = s.next();
			if(!compra.equals("fin")) {
				System.out.print("Cantidad: ");
				cant = s.nextInt();
				producto.add(compra);
				cantidad.add(cant);
			}
			
		}while(!compra.equals("fin"));
		
		double total = 0;
		
		System.out.println("\n\nProducto Precio Cantidad Subtotal");
		System.out.println("=================================");
		
		for(int i = 0; i < producto.size(); i++) {
			String pro = producto.get(i);
			double pre = a.get(pro);
			int can = cantidad.get(i);
			double subtotal = pre*can;
			total += subtotal; 
			
			System.out.printf("%-8s %7.2f %6d %7.2f\n", pro, pre, can, subtotal);
		}
		System.out.println("=================================");
		System.out.printf("TOTAL: %.2f", total);
		
		
		
		
	}

}
