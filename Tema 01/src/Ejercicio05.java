/**
 * Ejercicio 05
 * 
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente
 * 
 * @author Alvaro Ramirez
 *
 */
public class Ejercicio05 {
	public static void main(String[] args) {
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";

		System.out.println("LUNES   MARTES    MIERCOLES    JUEVES    VIERNES");
		System.out.println("");
		System.out.println(rojo+"EED"+verde+    "PRO"+naranja+       "PRO"+naranja+      "PRO"+rojo+   "FOL");
		System.out.println(rojo+"LM"+verde+    "PRO"+azul+       "PRO"+verde+           "PRO"+rojo+       "FOL");
		System.out.println(rojo+"LM"+verde+    "PRO"+azul+       "EED"+verde+           "PRO"+rojo+       "FOL");
		System.out.println("");
		System.out.println("SINF"+morado+     "BBDD"+verde+      "EED"+morado+          "BBDD"+azul+      "SINF");
		System.out.println("SINF"+morado+     "BBDD"+verde+      "LM"+morado+          "BBDD"+azul+      "SINF");
		System.out.println("SINF"+morado+     "BBDD"+verde+      "LM"+morado+          "BBDD"+azul+      "SINF");
	}

}
