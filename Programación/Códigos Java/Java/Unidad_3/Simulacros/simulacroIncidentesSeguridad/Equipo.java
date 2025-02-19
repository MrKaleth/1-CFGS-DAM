package simulacroIncidentesSeguridad;

import java.util.Objects;

public class Equipo {
	private String nombreEquipo;
	private String direccionMAC;
	private String sistemaOperativo;
	private int numIncidentesPendientes;
	private Usuario usuario;

	public Equipo(String nombreEquipo, String direccionMAC, String sistemaOperativo, int numIncidentesPendientes) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.direccionMAC = direccionMAC;
		this.sistemaOperativo = sistemaOperativo;
		this.numIncidentesPendientes = numIncidentesPendientes;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Equipo: " + nombreEquipo + ", MAC: " + direccionMAC + 
				", númmero de incidencias pendientes de resolucion: " + numIncidentesPendientes + ", Nombre del Usuario: " + usuario;
	}

	protected String getNombreEquipo() {
		return nombreEquipo;
	}

	protected void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	protected String getDireccionMAC() {
		return direccionMAC;
	}

	protected void setDireccionMAC(String direccionMAC) {
		this.direccionMAC = direccionMAC;
	}

	protected String getSistemaOperativo() {
		return sistemaOperativo;
	}

	protected void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	protected int getNumIncidentesPendientes() {
		return numIncidentesPendientes;
	}

	protected void setNumIncidentesPendientes(int numIncidentesPendientes) {
		this.numIncidentesPendientes = numIncidentesPendientes;
	}

	protected Usuario getUsuario() {
		return usuario;
	}

	protected void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccionMAC);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(direccionMAC, other.direccionMAC);
	}

}
