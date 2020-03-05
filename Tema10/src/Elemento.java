
public class Elemento {
	private String producto;
	private double precio;
	private int cantidad;
	
	public Elemento(String pro, double pre, int cant) {
		producto = pro;
		precio = pre;
		cantidad = cant;
	}
	
	public String getProducto(){
		return producto;
	}
	
	public void setProducto(String pro) {
		producto = pro;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(int pre) {
		precio = pre;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int can) {
		cantidad = can;
	}
	
	public String toString() {
		return producto+" PVP: "+ String.format("%.2f", precio)+" Unidades: "+cantidad+" Subtotal: "+String.format("%2.f", precio*cantidad);
	}

}
