package empresa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contenedor {
	Scanner sc = new Scanner(System.in);
	private List<IAsesoria> lista = new ArrayList<IAsesoria>();
	private List<Capacitacion> lista2 = new ArrayList<Capacitacion>();
	Ingreso ingreso = new Ingreso();

	//Atrubutos locales usuarios
	String nombre, fechaNac, nombres, apellidos, telefono, afp, direccion,
	comuna, titulo, fechaIngr, area, expPrev, dia, mes, año, horaCap, min;
	int run, sistSalud, edad;
	//Atributos locales capacitacion
	String  diaCap, hora, lugar, duracion, nomRev, detalle;
	int id, cantAsist, rutCliente, idV, idR, estado;

	public void  almacenarCliente() {
		System.out.println("Ingrese nombre: ");
		nombre=ingreso.validCadena1050();
		System.out.println("Ingrese fecha de nacimiento: ");
		fechaNac=ingreso.ingresaFecha();

		System.out.println("Ingrese run sin digito verificador: ");
		run = ingreso.validarRut();
		do {
			System.out.println("Ingrese nombres: ");
			nombres = sc.nextLine();
		}
		while (nombres.length() < 5 || nombres.length()> 30);
		do {
			System.out.println("Ingrese apellidos: ");
			apellidos = sc.nextLine();
		}
		while (apellidos.length() < 10 || apellidos.length()> 50);
		do {
			System.out.println("Ingrese teléfono: ");
			telefono = sc.nextLine();
		}
		while (telefono.length() < 1 );
		do {
			System.out.println("Ingrese afp: ");
			afp = sc.nextLine();
		}
		while (afp.length() < 4 || afp.length()> 30);
		do {
			System.out.println("Ingrese opción de sistema de salud: ");
			System.out.println("(1) Fonasa ");
			System.out.println("(2) Isapre ");
			sistSalud = sc.nextInt();
			sc.nextLine();
		}
		while (sistSalud < 1 || sistSalud > 2);
		do {
			System.out.println("Ingrese dirección: ");
			direccion = sc.nextLine();
		}
		while (direccion.length() > 70);
		do {
			System.out.println("Ingrese comuna: ");
			comuna = sc.nextLine();
		}
		while (comuna.length() > 50);
		do {
			System.out.println("Ingrese edad ");
			edad = sc.nextInt();
			sc.nextLine();
		}
		while (edad <= 0 || edad > 150);
		Cliente cliente = new Cliente (nombre, fechaNac, run, nombres, 
				apellidos, telefono, afp, sistSalud, direccion, comuna, edad );
		lista.add(cliente);
		System.out.println("*************************************************");
		System.out.println("Ingrese datos de Visita a terreno :");
		almacenarVisita();


	}

	public void almacenarProfesional() {
		System.out.println("Ingrese nombre: ");
		nombre=ingreso.validCadena1050();
		System.out.println("Ingrese fecha de nacimiento: ");
		fechaNac = ingreso.ingresaFecha();

		System.out.println("Ingrese run sin digito verificador: ");
		run = ingreso.validarRut();

		System.out.println("Ingrese título profesional: ");
		titulo = ingreso.validCadena1050();

		System.out.println("Ingrese fecha de ingreso: ");
		fechaIngr = ingreso.ingresaFecha();
		Profesional profesional = new Profesional (nombre, fechaNac, run, 
				titulo, fechaIngr );
		lista.add(profesional);
		System.out.println(lista.size());
	}

	public void almacenarAdministrativo() {
		System.out.println("Ingrese nombre: ");
		nombre=ingreso.validCadena1050();
		System.out.println("Ingrese fecha de nacimiento: ");
		fechaNac = ingreso.ingresaFecha();

		System.out.println("Ingrese run sin digito verificador: ");
		run = ingreso.validarRut();
		do {
			System.out.println("Ingrese área: ");
			area = sc.nextLine();
		}
		while (area.length() < 5 || area.length()> 20);
		do {
			System.out.println("Ingrese experiencia previa: ");
			expPrev = sc.nextLine();
		}
		while (expPrev.length() > 100);
		Administrativo administrativo = new Administrativo (nombre, fechaNac,
				run, area, expPrev );
		lista.add(administrativo);
		System.out.println(lista.size());

	}
	public void almacenarCapacitacion() {
		do {
			System.out.println("Ingrese Id ");
			id = sc.nextInt();
			sc.nextLine();
		}
		while (id < 1);

		System.out.println("Ingrese rut de cliente: ");
		rutCliente = ingreso.validarRut();

		do {
			System.out.println("Ingrese día de la capacitación: "); 
			System.out.println("(LUNES - MARTES - MIERCOLES - JUEVES - VIERNES "
					+ "- SABADO -DOMINGO) ");
			diaCap = sc.nextLine(); 
			diaCap = diaCap.toLowerCase();
		
		}
		while (!diaCap.equals("lunes") && !diaCap.equals("martes")
				&& !diaCap.equals ("miercoles") && !diaCap.equals ("jueves") 
				&& !diaCap.equals ("viernes") && !diaCap.equals ("sabado") 
				&& !diaCap.equals ("domingo"));


		System.out.println("Ingrese hora de la capacitación ");
		horaCap = ingreso.ingresaHora(); 

		System.out.println("Ingrese lugar de la capacitación: ");
		lugar = ingreso.validCadena1050();
		do {
			System.out.println("Ingrese duración en minutos de la "
					+ "capacitación: ");
			duracion = sc.nextLine();
		}
		while (duracion.length() > 70);
		do {
			System.out.println("Ingrese cantidad de asistentes ");
			cantAsist = sc.nextInt();
			sc.nextLine();
		}
		while (cantAsist < 1 || cantAsist > 1000);
		Capacitacion capacitacion = new Capacitacion (id, rutCliente, diaCap, 
				hora, lugar, duracion, cantAsist );
		lista2.add(capacitacion);

	}

	public void almacenarVisita() {

		System.out.println("Ingrese Id Visita");
		idV = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese rut de cliente: ");
		rutCliente = ingreso.validarRut();
		System.out.println("Ingrese fecha de visita: ");
		diaCap = ingreso.ingresaFecha(); 
		System.out.println("Ingrese hora de visita: ");
		hora = ingreso.ingresaHora();
		System.out.println("Ingrese lugar de visita: ");
		lugar = ingreso.validCadena1050();
		System.out.println("Ingrese comentarios de visita: ");
		lugar = ingreso.validCadena100();
		System.out.println("*************************************************");
		System.out.println("Ingrese datos de Revisión correspondiente a"
				+ " Visita");
		almacenarRevisión();

	}

	public void almacenarRevisión() {

		System.out.println("Ingrese Id Revisión");
		idR = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese nombre alusivo: ");
		nomRev = ingreso.validCadena1050();
		System.out.println("Ingrese detalle: ");
		detalle = ingreso.validCadena100();

		System.out.println("Ingrese opción de estado: ");
		System.out.println("(1) Sin problemas ");
		System.out.println("(2) Con observaciones ");
		System.out.println("(3) No aprueba ");
		estado = sc.nextInt();
		sc.nextLine();

		while (estado < 1 || estado > 3) {
			System.out.println("Ingrese opción válida");

			estado = sc.nextInt();
			sc.nextLine();
		}



	}

	public void Eliminarusuario() {
		run = 0;
		System.out.println(" Ingrese el run del usuario que desea eliminar : ");
		run = sc.nextInt();
		sc.nextLine();
		for ( int i = 0; i < lista.size(); i++) {
			if (lista.get(i).buscarPorRun(run)) {
				lista.remove(i);
				System.out.println(" Usuario eliminado");
			}
			else 
				System.out.println(" Usuario no existe en BBDD");
			System.out.println(lista.size());
		}
	}

	public void ListarUsuarios() {              
		for (IAsesoria i : lista) {
			i.mostrarDatosUsuario();
			System.out.println(" ");
		}
	}

	public void ListaUsuaTipo() {
		String typeUsu = "";
		System.out.println(" Ingrese el tipo de usuario que desea listar : ");
		typeUsu = sc.nextLine();
		typeUsu = typeUsu.toLowerCase();
		for ( IAsesoria i :  lista) {

			if ( typeUsu.equals("cliente")) {
				if (i instanceof Cliente) {
					System.out.println(i.toString());
				}
			}
			else if  ( typeUsu.equals("profesional")) {
				if (i instanceof Profesional) {
					System.out.println(i.toString());
				}
			}
			else if ( typeUsu.equals("administrativo")) {
				if (i instanceof Administrativo) {
					System.out.println(i.toString());
				}
			}
		}
	}

	public void ListarCapacitaciones() {

		for (Capacitacion i : lista2) {
			i.mostrarDetalle();

			run = i.getRutCliente();
			for ( int j = 0; j < lista.size(); j++) {
				if (lista.get(j).buscarPorRun(run)) {
					System.out.println(lista.get(j));

				}
				else 
					System.out.println(" Usuario no existe en BBDD");
				System.out.println(lista.size());
			}
		}
	}

}





