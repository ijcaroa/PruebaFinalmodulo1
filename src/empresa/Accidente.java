package empresa;

public class Accidente {

	private int idAccidente;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;


	public Accidente(int idAccidente, String rutCliente, String dia, 
			String hora, String lugar, String origen,
			String consecuencias) {
		super();
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public Accidente() {
		super();
	}

	public int getIdAccidente() {
		return idAccidente;
	}
	public String getRutCliente() {
		return rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public String getHora() {
		return hora;
	}
	public String getLugar() {
		return lugar;
	}
	public String getOrigen() {
		return origen;
	}
	public String getConsecuencias() {
		return consecuencias;
	}
	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rutCliente=" 
				+ rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen 
				+ ", consecuencias=" + consecuencias + "]";
	}




}
