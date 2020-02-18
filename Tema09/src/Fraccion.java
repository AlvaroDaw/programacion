/**
 * Fraccion.java
 * Definicion de la clase Fraccion
 * 
 * @author Alvaro Ramirez
 *
 */
public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion(int num, int den) {
		if(den == 0) {
			System.out.println("El denominador no puede ser 0");
		}else {
			numerador = Math.abs(num);
			denominador = Math.abs(den);
		}

	}
	
	//Metodos get y set
	int getNumerador(){ 
		return this.numerador;
	}
	
	int getDenominador() {
		return this.denominador;
	}
	
	void setNumerador(int num) {
		this.numerador = num;
	}
	
	void setDenominador(int den) {
		this.denominador = den;
	}
	
	//Metodos
	/* Cambia de orden el numerador y el denominador
	 * 
	 * @return cambia el numerador y el denominador entre si
	 */
	public Fraccion invierte() {
		return new Fraccion(this.denominador, this.numerador);
	}
	
	/*
	 * Devuelve una fraccion nueva tras multiplicar la original por otra dada por parametro
	 * 
	 * @param La fraccion a multiplicar por la original
	 * @return fraccion resultante de multiplicar la fraccion original por otra dada como parametro
	 */
	public Fraccion multiplica(Fraccion b) {
		return new Fraccion(this.numerador*b.getNumerador(), this.denominador*b.getDenominador());
	}
	
	/*
	 * Crea una nueva fraccion diviendo la original por un numero pasado por parametro
	 * 
	 * @param el numero por el que se divide la fraccion
	 * @return La fraccion resultante de dividir la fraccion original por n
	 */
	public Fraccion divide(int n) {
		return new Fraccion(this.numerador, this.denominador * n);
	}
	
	/*
	 * Crea una nueva fraccion diviendo la original por otra dada por parametro
	 * 
	 * @param Fracion por la que se divide
	 * @return Nueva fracion resultante de la division entre las dos
	 */
	public Fraccion divide(Fraccion b) {
		return new Fraccion(this.numerador*b.getDenominador(), this.denominador*b.getNumerador());
	}

}
