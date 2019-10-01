/**
 * Ejercicio 12
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso.
 * Cada pregunta acertada sumara un punto. El programa mostrará al final la calificacion obtenida. Pasale el
 * minicuestionario a tus compañeros y pideles que lo hagan para ver que tal andan de conocimientos en las 
 * diferentes asignaturas del curso.
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Minicuestionario sobre entornos/lenguaje/programacion.");
    System.out.println("SE RESPONDE CON SI O NO.");
    System.out.println("------------------------------------");

    int puntuacion= 0;
    String respuesta;
    System.out.println("1¿Un software libre puede ser modificado?: ");
    respuesta = s.nextLine().toLowerCase();
        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("2¿Un software libre puede ser comercializado?: ");
    respuesta = s.nextLine().toLowerCase();
        if (respuesta.equals("no")) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("3¿Es windows mejor que linux?: ");
    respuesta = s.nextLine().toLowerCase();
        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("4¿Es Fortnite el mejor juego?: ");
    respuesta = s.nextLine().toLowerCase();
        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("5.Vas a suspender el proximo examen de programacion?: ");
    respuesta = s.nextLine().toLowerCase();
        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("6.¿Te gusta BBDD?: ");
    respuesta = s.nextLine().toLowerCase();
        if (respuesta.equals("no")) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("7.¿Es Java un lenguaje de alto nivel?: ");
    respuesta = s.nextLine().toLowerCase();
        if ((respuesta.equals("sí­")) || (respuesta.equals("si"))) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("8.¿Es Visual C un lenguaje orientado a objetos?: ");
    respuesta = s.nextLine().toLowerCase();
        if ((respuesta.equals("no"))) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("9.¿En octal escribimos en base hexadecimal?: ");
    respuesta = s.nextLine().toLowerCase();
        if ((respuesta.equals("no"))) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("10.¿Se procesa la informaciÃ³n en binario en las computadoras?: ");
    respuesta = s.nextLine().toLowerCase();
        if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
          System.out.println("La respuesta es correcta.");
          puntuacion++;
        } else {
          System.out.println("La respuesta no es correcta.");
        }
    System.out.println("------------------------------------------------");
    System.out.print("Tu puntuacion es de " + puntuacion + " puntos");
    s.close();
	}

}