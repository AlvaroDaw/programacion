/**
 * Villancico.java
 * Definicion de la clase Villancico
 * @author Alvaro Ramirez
 *
 */
import javax.sound.sampled.*;
public class Villancico {
	
	public static float SAMPLE_RATE = 8000f;
	
	public static void tone (int hz, int msecs) 
		throws LineUnavailableException
		{
		tone(hz,msecs,1.0);
	}
	
	public static void tone(int hz, int msecs,double vol) throws LineUnavailableException{
		byte[] buf = new byte[1];
		AudioFormat af = 
			new AudioFormat(
					SAMPLE_RATE,	//samplerata
					8,				//sampleSizeInBits
					1,				//channels
					true,			//signed
					false);			//bigEndian
		SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
		sdl.open(af);
		sdl.start();
		for(int i = 0; i < msecs*8; i++) {
			double angle = i / (SAMPLE_RATE / hz)*2.0 *Math.PI;
			buf[0] = (byte)(Math.sin(angle)*127.0 * vol);
			sdl.write(buf,0,1);
		}
		sdl.drain();
	    sdl.stop();
	    sdl.close();
	}
	
	public static void tocarNota (int octava, String nota, String figura, int velocidad) throws Exception{
		String notas[] = {      "dob", "do", "do#", "reb","re", "re#","mib","mi","mi#","fab", "fa","fa#","solb","sol","sol#","lab","la","la#","sib","si","si#"};
		int semitonosAlLa [] = {-10,   -9,   -8,    -8,   -7,   -6,   -6,   -5,  -4,  -5,     -4,   -3,   -3,   -2,   -1,     -1,   0,    1,  1,    2,    3};
		
		String figuras[] = {"cuadrada","redonda","redondaP","blanca","blancaP","negra","negraP","corchea","corcheaP","semicorchea","semicorcheaP","fusa","fusaP","semifusa","semifusaP"};
	   int duracion[] =  {256,128,192,64,96,32,48,16,24,8,12,4,6,2,3};
	   
	   int pos=-1;
	    for (int i=0; i<notas.length; i++) {
	      if (notas[i].equals(nota)) {
	        pos = i;
	      }
	    }
	    
	    int posFig=-1;
	    for (int i=0; i<figuras.length; i++) {
	      if (figuras[i].equals(figura)) {
	        posFig = i;
	      }
	    }
	    
	    int tonoFrecuencia = 0;
	    if (pos != -1) {
	      tonoFrecuencia = (int)(440*Math.pow(1.0594630943592953,(octava-4)*12+semitonosAlLa[pos]));
	    }
	    System.out.println(tonoFrecuencia);
	    
	    int tiempoSonando = duracion[posFig]*velocidad;
	    
	    tone(tonoFrecuencia,tiempoSonando);
	    Thread.sleep(0);
	  
	}
	
	public static void main(String[] args) throws Exception {
	    
	    String escala[] = {"do","re","mi","fa","sol","la","si"};
	    
	    int octavas[] = {5,5,5,5,5,5,5,5,5,5,0,
	                      5,5,5,5,5,5,5,5,5,5,5,5,0,
	                      0,5,5,5,5,5,5,5,5,5,5,5,5,0,
	                      0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
	                      5,5,5,5,5,5,5,5,5,5,5,0,5,5,5,5,5,0};
	    String notas[] = {"do","re","mi","mi","mi","fa","mi","fa","mi","mi","silencio-negra",
	                      "do","do","re","mi","mi","mi","mi","fa","mi","fa","mi","mi","silencio-negra",
	                      "silencio-negra","re","mi","fa","sol","sol","sol","la","sol","fa","mi","re","re","silencio-negra",
	                      "silencio-negra","re","mi","fa","sol","sol","sol","la","sib","la","sol","fa","la","sol","fa","mi","sol","fa","mi","re","re","silencio-negra",
	                      "do","re","mi","mi","mi","mi","fa","mi","fa","mi","mi","silencio-negra","re","do","re","do","do","silencio-negra"};
	    String figuras[] = {"blancaP","negra","blanca","negra","negra","corchea","corchea","negra","blanca","blancaP","negra",
	                      "negra","negra","negra","negra","negra","negra","negra","corchea","corchea","negra","blanca","blancaP","negra",
	                      "negra","negra","negra","negra","negra","negra","negra","negra","corchea","corchea","negra","blanca","blancaP","negra",
	                      "negra","negra","negra","negra","negra","negra","negra","negra","corchea","corchea","negra","blanca","corchea","corchea","negra","blanca","corchea","corchea","negra","blanca","blancaP","negra",
	                      "blancaP","negra","negra","negra","negra","negra","corchea","corchea","negra","blanca","blancaP","negra",   "corchea","corchea","negra","blanca","blancaP","negra"};
	  
	    for (int i=0; i<notas.length; i++) {
	        tocarNota (octavas[i],notas[i],figuras[i],8);
	      }
	      
	   
	    }
	

}
