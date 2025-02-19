package simulacroIncidentesSeguridad;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {
	private int id;
	private String nombre;
	private String descripcion;
	private EstadoIncidente estado;
	private Criticidad criticidad;
	private LocalDate fechaRegistro;
	private LocalDate fechaResolucion;
	private Equipo equipo;

	public Incidente(int id, String nombre, String descripcion, EstadoIncidente estado, Criticidad criticidad,
			LocalDate fechaRegistro, Equipo equipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.criticidad = criticidad;
		this.fechaRegistro = fechaRegistro;
		setFechaResolucion(fechaResolucion);
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Incidente: " + nombre + ", estado: " + estado + ", criticidad: " + criticidad
				+ ", Fecha de registro de la incidencia: " + fechaRegistro;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected EstadoIncidente getEstado() {
		return estado;
	}

	protected void setEstado(EstadoIncidente estado) {
		this.estado = estado;
	}

	protected Criticidad getCriticidad() {
		return criticidad;
	}

	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}

	protected LocalDate getfechaRegistro() {
		return fechaRegistro;
	}

	protected void setfechaRegistro(LocalDate datefechaRegistro) {
		this.fechaRegistro = datefechaRegistro;
	}

	protected LocalDate getFechaResolucion() {
		return fechaResolucion;
	}

	protected void setFechaResolucion(LocalDate fechaResolucion) {
		if (estado == EstadoIncidente.CERRADA) {
			this.fechaResolucion = fechaResolucion;
		} else {
			this.fechaResolucion = null;
		}

	}

	protected Equipo getEquipo() {
		return equipo;
	}

	protected void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(criticidad, descripcion, equipo, estado, fechaRegistro, fechaResolucion, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidente other = (Incidente) obj;
		return criticidad == other.criticidad && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(equipo, other.equipo) && estado == other.estado
				&& Objects.equals(fechaRegistro, other.fechaRegistro)
				&& Objects.equals(fechaResolucion, other.fechaResolucion) && id == other.id
				&& Objects.equals(nombre, other.nombre);
	}

	protected void esUrgente() {
		LocalDate hoy = LocalDate.now();

		if (this.criticidad == Criticidad.CRITICA) {
			System.out.println("La incidencia es urgente.");
		} else if (this.criticidad == Criticidad.GRAVE && this.fechaRegistro.plusDays(7).isBefore(hoy)) {
			System.out.println("La incidencia es urgente.");
		}

		else if (this.criticidad == Criticidad.MEDIA && this.fechaRegistro.plusDays(30).isBefore(hoy)) {
			System.out.println("La incidencia es urgente.");
		}
		else {
			System.out.println("La incidencia no es urgente");
		}
	}

}
