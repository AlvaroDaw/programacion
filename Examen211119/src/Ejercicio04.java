/**
 * Ejercicio 04
 * 
 * @author Alvaro Ramirez
 *
 */
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dia;
		int mes;
		int a�o;
		int coesiglo=0;
		int coea�o;
		int coebisi;
		int coemes=0;
		int coedia;
		int sumacoe;
		String diasemana = "";
		
		System.out.println("Introduzca fecha, indicando dia, mes y a�o (dd mm aaaa): ");
		dia = s.nextInt();
		mes = s.nextInt();
		a�o = s.nextInt();
		
		if(a�o >= 1700 && a�o <= 1799) {
			coesiglo = 5;
		}else if(a�o >= 1800 && a�o <= 1899) {
			coesiglo = 3;
		}else if(a�o >= 1900 && a�o <= 1999) {
			coesiglo = 1;
		}else if(a�o >= 2000 && a�o <= 2099) {
			coesiglo = 0;
		}else if(a�o >= 2100 && a�o <= 2199) {
			coesiglo = -2;
		}else if(a�o >= 2200 && a�o <= 2299) {
			coesiglo = -4;
		}
		
		coea�o = a�o%100;
		int cuartaparte = (int)(coea�o/4);
		coea�o = coea�o+cuartaparte;
		
		if(a�o%4 == 0 && a�o%100 != 0 && (mes == 1 || mes == 2)) {
			coebisi = -1;
		}else {
			coebisi = 0;
		}
		
		switch(mes) {
		case 1:
			coemes = 6;
			break;
		case 2:
			coemes = 2;
			break;
		case 3:
			coemes = 2;
			break;
		case 4:
			coemes = 5;
			break;
		case 5:
			coemes = 0;
			break;
		case 6:
			coemes = 3;
			break;
		case 7:
			coemes = 5;
			break;
		case 8:
			coemes = 1;
			break;
		case 9:
			coemes = 4;
			break;
		case 10:
			coemes = 6;
			break;
		case 11:
			coemes = 2;
			break;
		case 12:
			coemes = 4;
			break;	
		}
		
		coedia = dia;
		sumacoe = coesiglo+coea�o+coebisi+coemes+coedia;
		sumacoe %=7;
		
		switch(sumacoe) {
		case 1:
			diasemana = "Lunes";
			break;
		case 2:
			diasemana = "Martes";
			break;
		case 3:
			diasemana = "Miercoles";
			break;
		case 4:
			diasemana = "Jueves";
			break;
		case 5:
			diasemana = "Viernes";
			break;
		case 6:
			diasemana = "Sabado";
			break;
		case 0:
			diasemana = "Domingo";
			break;
		}
		
		System.out.println("La fecha "+dia+"/"+mes+"/"+a�o+" cae en: "+diasemana);
		s.close();
	}

}
