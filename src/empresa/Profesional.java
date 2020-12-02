package empresa;

public class Profesional extends Usuario {

	private String titulo;
	private String fechaIngr;


	public Profesional() {
		super();
	}


	public Profesional(String nombre, String fechaNac, int run, 
			String titulo, String fechaIngr) {
		super(nombre, fechaNac, run);
		this.titulo = titulo;
		this.fechaIngr = fechaIngr;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngr() {
		return fechaIngr;
	}

	public void setFechaIngr(String fechaIngr) {
		this.fechaIngr = fechaIngr;
	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("El título es : " + titulo 
				+  " y la fecha de ingreso del profesional: " + fechaIngr );
	}


	@Override
	public String toString() {
		return "Profesional [" + super.toString() + " titulo=" + titulo 
				+ ", fechaIngr=" + fechaIngr + ", toString()=" + "]";
	}



}
