package empresa;

public class Cliente extends Usuario {


	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private int sistSalud;
	private String direccion;
	private String comuna;
	private int edad;


	public Cliente() {
		super();
	}


	public Cliente(String nombre, String fechaNac, int run, String nombres, 
			String apellidos, String telefono, String afp, int sistSalud, 
			String direccion, String comuna, int edad) {
		super(nombre, fechaNac, run);
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistSalud = sistSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}


	public String getNombres() {
		return nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public String getTelefono() {
		return telefono;
	}


	public String getAfp() {
		return afp;
	}


	public int getSistSalud() {
		return sistSalud;
	}


	public String getDireccion() {
		return direccion;
	}


	public String getComuna() {
		return comuna;
	}


	public int getEdad() {
		return edad;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public void setAfp(String afp) {
		this.afp = afp;
	}


	public void setSistSalud(int sistSalud) {
		this.sistSalud = sistSalud;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}








	@Override
	public String toString() {
		return "Cliente [ " + super.toString() + " nombres=" + nombres 
				+ ", apellidos=" + apellidos + ", telefono=" + telefono 
				+ ", afp=" + afp
				+ ", sistSalud=" + sistSalud + ", direccion=" + direccion 
				+ ", comuna=" + comuna + ", edad=" + edad
				+ ", toString()=" + "]";
	}


	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();

		System.out.println("La direccion del clientes es: " + direccion 
				+ "," + comuna );
	}

	public void obtenerNombre() {
		System.out.println(nombres + " " + apellidos);
	}
	public void obtenerSistemaSalud() {
		if (sistSalud == 1) 
			System.out.println("El sistema de salud es FONASA");
		else 
			System.out.println("El sistema de salud es ISAPRE");

	}



	public int buscarPorTipoUsu() {

		if (afp.length() > 3) {
			return 1;
		}
		else 
			return 0;
	}



}
