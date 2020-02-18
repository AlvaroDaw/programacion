/**
 * Zona.java
 * Definicion de la clase Zona
 * 
 * @author Alvaro Ramirez
 *
 */
public class Zona {
	
	private int entradasPorVender;
	
	public Zona(int n) {
		this.entradasPorVender = n;
	}
	
	public int getEntradasPorVender() {
		return this.entradasPorVender;
	}
	
	public void vender(int n) {
		if(this.entradasPorVender == 0) {
			System.out.println("Las entradas para esa zona estan agotadas");
		}else if(this.entradasPorVender < n) {
			System.out.println("Solo me quedan "+this.entradasPorVender+" entradas disponibles");
		}
		
		if(this.entradasPorVender >= n) {
			this.entradasPorVender -= n;
			System.out.println("Aqui tiene sus "+n+" entradas");
		}
	}

}
