package empresa;

import java.util.Scanner;

public class Menu {

	int opc = 0;

	Scanner sc = new Scanner(System.in);
	Contenedor contenedor = new Contenedor();

	public int getOpc() {
		return opc;
	}

	public void setOpc(int opc) {
		this.opc = opc;
	}

	public int menu() {

		opc = 0;
		System.out.println("*************************************************");
		System.out.println("*****************MENÚ****************************");
		System.out.println("1.- Ingresar cliente");
		System.out.println("2.- Ingresar profesional");
		System.out.println("3.- Ingresar administrativo");
		System.out.println("4.- Ingresar capacitación");
		System.out.println("5.- Eliminar usuario por RUN");
		System.out.println("6.- Listado de  usuarios");
		System.out.println("7.- Listado de usuarios por tipo");
		System.out.println("8.- Listado de capacitaciones");
		System.out.println("9.- Salir");
		System.out.println("Elija una opción");

		opc = sc.nextInt();
		sc.nextLine();

		while ( opc > 9 || opc < 1) {
			System.out.println("*********************************************");
			System.out.println("Por favor ingrese una opción válida");
			System.out.println("*********************************************");

			opc = sc.nextInt();
			sc.nextLine();

		}

		switch (opc) {

		case 1: 
			contenedor.almacenarCliente();
			break;

		case 2:
			contenedor.almacenarProfesional();
			break;

		case 3:
			contenedor.almacenarAdministrativo();
			break;

		case 4:
			contenedor.almacenarCapacitacion();
			break;

		case 5:
			contenedor.Eliminarusuario();
			break;

		case 6:
			contenedor.ListarUsuarios();
			break;

		case 7:
			contenedor.ListaUsuaTipo();
			break;

		case 8:
			contenedor.ListarCapacitaciones();
			break;


		case 9:
			break;

		}

		return opc;


	}



}
