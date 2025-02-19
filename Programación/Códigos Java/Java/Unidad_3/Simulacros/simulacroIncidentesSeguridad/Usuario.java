package simulacroIncidentesSeguridad;

import java.util.Objects;

public class Usuario {
	private String dni;
	private String nombre;
	private String nombreDepartamento;

	public Usuario(String dni, String nombre, String nombreDepartamento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return nombre;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getNombreDepartamento() {
		return nombreDepartamento;
	}

	protected void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}

}
