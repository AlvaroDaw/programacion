/**
 * Ejercicio 16
 * Realiza un programa que nos diga si hay probalidad de que nuestra pareja nos este siendo
 * infiel. El programa hará preguntas de verdadero o falso. Cada pregunta contestada como
 * verdadera sumara 3 puntos.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 System.out.println("Test de infidelidad.");
		    System.out.println("SE RESPONDE CON SI O NO.");
		    System.out.println("----------------------------");
		    
		    int puntuacion= 0;
		    String respuesta;
		    System.out.println("1.¿Tu pareja parece estar mas inquieta de lo normal sin ningun motivo aparente?");
		    respuesta = s.nextLine().toLowerCase();
		        if ((respuesta.equals("sÃ­")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		    System.out.println("2.¿Ha aumentado sus gastos de vestuario?");
		    respuesta = s.nextLine().toLowerCase();
		        if ((respuesta.equals("sÃ­")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		    System.out.println("3.¿Ha perdido el interes que mostraba anteriormente por ti?");
		    respuesta = s.nextLine().toLowerCase();
		        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		    System.out.println("4.¿Ahora se afeita y se asea con mas frecuencia (si es hombre) o ahora se arregla el pelo y se asea con mas frecuencia (si es mujer)?");
		    respuesta = s.nextLine().toLowerCase();
		        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		    System.out.println("5.¿No te deja que mires la agenda de su telefono movil?, ¿A veces tiene llamadas que dice no querer contestar cuando estas tu delante?");
		    respuesta = s.nextLine().toLowerCase();
		        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		    System.out.println("6.¿Ultimamente se preocupa mas en cuidar la linea y/o estar bronceado/a?");
		    respuesta = s.nextLine().toLowerCase();
		        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		    System.out.println("7.¿Muchos dias viene tarde despues de trabajar porque dice tener mucho mas trabajo?");
		    respuesta = s.nextLine().toLowerCase();
		        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		    System.out.println("8.¿Has notado que ultimamente se perfuma mas?");
		    respuesta = s.nextLine().toLowerCase();
		        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		    System.out.println("9.¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
		    respuesta = s.nextLine().toLowerCase();
		    
		        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
		          puntuacion += 3;
		        }
		        
		        if (puntuacion <= 10)
		        System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel."); {
		        }
		        
		        if ((puntuacion >= 11) && (puntuacion <= 21))
		        System.out.println("Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente sera algo sin importancia. No bajes la guardia."); {
		        }

		        if ((puntuacion >= 22) && (puntuacion <= 30))
		        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco mas y averigues que es lo que esta pasando por su cabeza."); {
		        }
		        s.close();
	}

}
