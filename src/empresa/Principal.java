package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		Menu menu = new Menu();

		int opcion = 0;
		do { 
			opcion = menu.menu();
		}
		while ( opcion != 9);

		sc.close();

	}

}
