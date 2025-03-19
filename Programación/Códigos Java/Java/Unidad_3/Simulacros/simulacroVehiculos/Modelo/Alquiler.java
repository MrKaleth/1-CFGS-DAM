package simulacroVehiculos.Modelo;

import java.time.LocalDate;

public class Alquiler {
	private String id;
	private VehiculoGeneral datos;
	private int numPermiso;
	private String dni;
	private LocalDate fechaEntregainicio;
	private LocalDate fechaRegistroAlquiler;
	private int numDias;
	private Estado estado;

	public Alquiler(String id, VehiculoGeneral datos, int numPermiso, String dni, LocalDate fechaEntregainicio,
			LocalDate fechaRegistroAlquiler, int numDias, Estado estado) {
		super();
		this.id = id;
		this.datos = datos;
		this.numPermiso = numPermiso;
		this.dni = dni;
		this.fechaEntregainicio = fechaEntregainicio;
		this.fechaRegistroAlquiler = fechaRegistroAlquiler;
		this.numDias = numDias;
		this.estado = estado;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected VehiculoGeneral getDatos() {
		return datos;
	}

	protected void setDatos(VehiculoGeneral datos) {
		this.datos = datos;
	}

	protected int getNumPermiso() {
		return numPermiso;
	}

	protected void setNumPermiso(int numPermiso) {
		this.numPermiso = numPermiso;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected LocalDate getFechaEntregainicio() {
		return fechaEntregainicio;
	}

	protected void setFechaEntregainicio(LocalDate fechaEntregainicio) {
		this.fechaEntregainicio = fechaEntregainicio;
	}

	protected LocalDate getFechaRegistroAlquiler() {
		return fechaRegistroAlquiler;
	}

	protected void setFechaRegistroAlquiler(LocalDate fechaRegistroAlquiler) {
		this.fechaRegistroAlquiler = fechaRegistroAlquiler;
	}

	protected int getNumDias() {
		return numDias;
	}

	protected void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	protected Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

}
