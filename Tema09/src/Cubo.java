/**
 * Cubo.java
 * Definicion de la clase Cubo
 * 
 * @author Alvaro Ramirez
 *
 */
public class Cubo {
	//atributos
	int capacidad;
	int contenido;
	
	//metodos
	
	//constructor
	Cubo(int c){
		this.capacidad = c;
	}
	
	//metodos getter
	int getCapacidad() {
		return this.capacidad;
	}
	
	int getContenido() {
		return this.contenido;
	}
	
	//metodos setter
	void setContenido(int litros) {
		this.contenido = litros;
	}
	
	//otros metodos
	void vacia() {
		this.contenido = 0;
	}
	
	/**
	 * Llena el cubo al maximo de su capacidad
	 */
	void llena() {
		this.contenido = this.capacidad;
	}
	
	/**
	 * Pinta el cubo en la pantalla
	 * Se muestran los bordes del cubo con el caracter  # 
	 * y el agua que contiene con el caracter ~
	 */
	void pinta() {
		for(int nivel = this.capacidad; nivel > 0; nivel--) {
			if (this.contenido >= nivel) {
				System.out.println("#~~~~#");
			}else {
				System.out.println("#    #");
			}
		}
		System.out.println("######");
	}
	
	/**
	 * Vuelca el contenido de un cubo sobre otro
	 * Antes de echar el agua se comprueba cuanto le cabe al 
	 * cubo destino
	 */
	void vuelcaEn(Cubo destino) {
		int libres = destino.getCapacidad() - destino.getContenido();
		
		if(libres > 0) {
			if(this.contenido <= libres) {
				destino.setContenido(destino.getContenido()+this.contenido);
				this.vacia();
			}else {
				this.contenido-=libres;
				destino.llena();
			}
		}
	}

}
