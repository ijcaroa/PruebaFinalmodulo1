package empresa;

public class Administrativo extends Usuario {

	private String area;
	private String expPrev;

	public Administrativo(String nombre, String fechaNac,
			int run, String area, String expPrev) {
		super(nombre, fechaNac, run);
		this.area = area;
		this.expPrev = expPrev;
	}

	public Administrativo() {
		super();
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExpPrev() {
		return expPrev;
	}

	public void setExpPrev(String expPrev) {
		this.expPrev = expPrev;
	}


	@Override
	public String toString() {
		return "Profesional [" + super.toString() + " area=" + area 
				+ ", expPrev=" + expPrev + ", toString()=" + "]";
	}


	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println(""
				+ "El administrativo pertenece al área : " + area 
				+  " y su experiencia previa es: " + expPrev );

	}


}
