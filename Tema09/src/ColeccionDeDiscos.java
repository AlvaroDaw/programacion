/*
 * ColeccionDeDiscos.java
 * Gestion de una coleccion de Discos
 * @author Alvaro Ramirez
 */

public class ColeccionDeDiscos {
	
	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String toString() {
		String cadena = "\n-------------------------------------";
			cadena+= "\nCodigo: "+this.codigo;
			cadena+= "\nAutor: "+this.autor;
			cadena+= "\nTitulo: "+this.titulo;
			cadena+= "\nGenero: "+this.genero;
			cadena+= "\nDuracion: "+this.duracion;
			cadena+= "\n-------------------------------------";
			
		return cadena;
	}

}
