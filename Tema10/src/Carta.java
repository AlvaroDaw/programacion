import java.util.Objects;

/**
 * Carta.java
 * Definicion de la clase Carta
 * @author Alvaro
 *
 */

public class Carta implements Comparable<Carta>{
	private static String[] n = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
	private static String[] p = {"copa","basto","oro","espada"};
	
	private Integer numero;
	private String palo;
	
	public Carta() {
		this.numero = (int)(Math.random()*10);
		this.palo = p[(int)(Math.random()*4)];
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getFigura() {
		return n[numero];
	}
	
	public String getPalo() {
		return palo;
	}
	
	public String toString() {
		return n[numero]+" de "+palo;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		final Carta other = (Carta) obj;
		
		if(!Objects.equals(this.numero, other.numero))  {
			return false;
		}
		
		if(!Objects.equals(this.palo, other.palo)) {
			return false;
		}
		return true;
	}
	
	public int compareTo(Carta a) {
		if(palo.equals(a.getPalo())) {
			return numero.compareTo(a.getNumero());
		}else {
			return palo.compareTo(a.getPalo());
		}
	}

}
