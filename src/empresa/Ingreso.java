package empresa;

import java.util.Scanner;

public class Ingreso {
	Scanner sc = new Scanner(System.in);

	public String  ingresaFecha() {
		int dia=0;
		int mes=0;
		int año=0;
		String fecha = "";

		do {
			System.out.print("día (DD) ");
			dia = sc.nextInt();
			sc.nextLine();
		}
		while (dia<1 || dia>31);
		do {
			System.out.print("mes (MM) ");
			mes = sc.nextInt();
			sc.nextLine();
		}
		while (mes<1 || mes>12);
		do {
			System.out.print("año (AAAA) ");
			año = sc.nextInt();
			sc.nextLine();
		}
		while (año<1900 || año > 2100);
		if (dia<10 && mes<10) {
			fecha = "0"+Integer.toString(dia) + "/" + "0" 
					+ Integer.toString(mes) + "/" + Integer.toString(año);
		}
		else if (dia>9 && mes<10) {
			fecha = Integer.toString(dia) + "/" + "0" 
					+ Integer.toString(mes) + "/" + Integer.toString(año);
		}
		else if (dia<10 && mes>9) {
			fecha = "0"+Integer.toString(dia) + "/" + Integer.toString(mes) 
			+ "/" + Integer.toString(año);
		}
		else
			fecha = Integer.toString(dia) + "/" + Integer.toString(mes) 
			+ "/" + Integer.toString(año);
		return  fecha;

	}

	public String  ingresaHora() {
		int hora = 0;
		int min = 0;
		String hour = "";

		do {
			System.out.print("hora (HH) ");
			hora = sc.nextInt();
			sc.nextLine();
		}
		while (hora<0 || hora>23);
		do {
			System.out.print("minutos (MM) ");
			min = sc.nextInt();
			sc.nextLine();
		}
		while (min<0 || min>59);

		if (hora<10 && min<10) {
			hour = "0"+Integer.toString(hora) + ":" + "0" 
					+ Integer.toString(min);
		}
		else if (hora>9 && min<10) {
			hour = Integer.toString(hora) + ":" + "0" 
					+ Integer.toString(min);
		}
		else if (hora<10 && min>9) {
			hour = "0"+Integer.toString(hora) + ":" + Integer.toString(min);

		}
		else
			hour = Integer.toString(hora) + ":" + Integer.toString(min);

		return  hour;

	}

	public String  validCadena1050() {
		String cadena="";
		do
			cadena = sc.nextLine();
		while (cadena.length() < 10 || cadena.length()> 50);

		return cadena;
	}

	public String  validCadena530() {
		String cadena="";
		do
			cadena = sc.nextLine();
		while (cadena.length() < 5 || cadena.length()> 30);

		return cadena;
	}

	public String  validCadena100() {
		String cadena="";
		do
			cadena = sc.nextLine();
		while (cadena.length() < 0 || cadena.length()> 100);

		return cadena;
	}

	public int validarRut() {
		int run = 0;
		do {
			run = sc.nextInt();
			sc.nextLine();
		}
		while (run > 99999999);
		return run;
	}
}
