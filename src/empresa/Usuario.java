package empresa;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

abstract class Usuario implements IAsesoria {


	private String nombre;
	private String fechaNac;
	private int run;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String fechaNac, int run) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public int getRun() {
		return run;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNac=" + fechaNac 
				+ ", run=" + run + "]";
	}

	public void analizarUsuario() {
		System.out.println("Nombre: " + nombre + "," + "RUN: " + run);
	}

	public void mostrarEdad() throws ParseException {
		SimpleDateFormat formFecha = new SimpleDateFormat("dd/MM/yyyy");

		Date fecha = new Date();
		Date birthDate = formFecha.parse(fechaNac);
		long nac = birthDate.getTime();
		long hoy = fecha.getTime();

		long dif = hoy - nac;
		dif = dif / 31536; 
		dif = dif / 1000000;
		System.out.println("El usuario tiene " + dif + " años");
	}

	@Override
	public boolean buscarPorRun(int run) {

		if (run == this.run) {
			return true;
		}
		else {
			return false;
		}
	}

	public void mostrarDatosUsuario() {
		System.out.println("Nombre: " + nombre + "," + "Fecha de nacimiento" 
				+ fechaNac + "," +  "RUN: " + run);
	}



}
