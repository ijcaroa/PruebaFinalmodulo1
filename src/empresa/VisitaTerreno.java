package empresa;

public class VisitaTerreno {

	private int idVisita;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;

	public VisitaTerreno(int idVisita, String rutCliente, String dia,
			String hora, String lugar, String comentarios) {

		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	public VisitaTerreno() {

	}

	public int getIdVisita() {
		return idVisita;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
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

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [idVisita=" + idVisita + ", rutCliente=" 
				+ rutCliente + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}





}
