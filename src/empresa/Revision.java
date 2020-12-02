package empresa;

public class Revision {

	private int idRevision;
	private int idVisitaTerre;
	private String nomRevision;
	private String detalle;
	private int estado;

	public Revision(int idRevision, int idVisitaTerre, String nomRevision,
			String detalle, int estado) {

		this.idRevision = idRevision;
		this.idVisitaTerre = idVisitaTerre;
		this.nomRevision = nomRevision;
		this.detalle = detalle;
		this.estado = estado;
	}

	public Revision() {

	}

	public int getIdRevision() {
		return idRevision;
	}

	public int getIdVisitaTerre() {
		return idVisitaTerre;
	}

	public String getNomRevision() {
		return nomRevision;
	}

	public String getDetalle() {
		return detalle;
	}

	public int getEstado() {
		return estado;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public void setIdVisitaTerre(int idVisitaTerre) {
		this.idVisitaTerre = idVisitaTerre;
	}

	public void setNomRevision(String nomRevision) {
		this.nomRevision = nomRevision;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisitaTerre=" 
				+ idVisitaTerre + ", nomRevision="
				+ nomRevision + ", detalle=" + detalle + ", estado=" + estado 
				+ "]";
	}



}
