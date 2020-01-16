
public class Piramide {
	
	private String caracter = "X";
	private int altura;
	
	//Constructor

	public Piramide(int a, String c) {
		altura = a;
		caracter = c;
	}
	
	//Metodos
	public int getAltura() {
		return altura;
	}
	
	public void setCaracter(String c) {
		this.caracter = c;
	}
	
	public void Aumenta(int a) {
		this.altura += a;
	}
	
	public void Disminuye(int a) {
		if(this.altura - a < 1) {
			this.altura = 1;
		}else {
			this.altura -= a;
		}
	}
	
	public String toString() {
		String resultado = "";
		int espacios = this.altura -1;
		int h = 1;
		
		for(int i = 0; i < this.altura; i++) {
			for(int j = espacios; j > 0; j--) {
				resultado += " ";
			}
			
			for(int j = 0; j < h; j++) {
				resultado += caracter;
			}
			espacios --;
			h += 2;
			resultado += "\n";
		}
		return resultado;
	}
	
	
}
