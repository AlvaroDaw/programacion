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
		int año;
		int coesiglo=0;
		int coeaño;
		int coebisi;
		int coemes=0;
		int coedia;
		int sumacoe;
		String diasemana = "";
		
		System.out.println("Introduzca fecha, indicando dia, mes y año (dd mm aaaa): ");
		dia = s.nextInt();
		mes = s.nextInt();
		año = s.nextInt();
		
		if(año >= 1700 && año <= 1799) {
			coesiglo = 5;
		}else if(año >= 1800 && año <= 1899) {
			coesiglo = 3;
		}else if(año >= 1900 && año <= 1999) {
			coesiglo = 1;
		}else if(año >= 2000 && año <= 2099) {
			coesiglo = 0;
		}else if(año >= 2100 && año <= 2199) {
			coesiglo = -2;
		}else if(año >= 2200 && año <= 2299) {
			coesiglo = -4;
		}
		
		coeaño = año%100;
		int cuartaparte = (int)(coeaño/4);
		coeaño = coeaño+cuartaparte;
		
		if(año%4 == 0 && año%100 != 0 && (mes == 1 || mes == 2)) {
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
		sumacoe = coesiglo+coeaño+coebisi+coemes+coedia;
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
		
		System.out.println("La fecha "+dia+"/"+mes+"/"+año+" cae en: "+diasemana);
		s.close();
	}

}
