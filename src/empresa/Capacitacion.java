package empresa;

public class Capacitacion {

	private int id;
	private int rutCliente;
	private String diaCap;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantAsist;


	public Capacitacion(int id, int rutCliente, String diaCap, String hora, 
			String lugar, String duracion, int cantAsist) {
		this.id = id;
		this.rutCliente = rutCliente;
		this.diaCap = diaCap;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsist = cantAsist;
	}

	public Capacitacion() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getdiaCap() {
		return diaCap;
	}

	public void setdiaCap(String dia) {
		this.diaCap = diaCap;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCantAsist() {
		return cantAsist;
	}

	public void setCantAsist(int cantAsist) {
		this.cantAsist = cantAsist;
	}
	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rutCliente=" + rutCliente 
				+ ", dia=" + diaCap + ", hora=" + hora + ", lugar=" + lugar 
				+ ", duracion=" + duracion + ", cantAsist=" + cantAsist + "]";
	}
	public void mostrarDetalle(){
		System.out.println("La capacitación será en " + lugar + " a las " 
				+ hora + " del día " + diaCap + ", y durará " 
				+ duracion + " minutos ");
	}

	public void almacenarCapacitacion() {
		// TODO Auto-generated method stub

	}
}
