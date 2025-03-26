package pilotos.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo implements IVuelo {
	private String identificador;
	private String aerolinea;
	private String destino;
	private LocalDate fechaVuelo;
	private int duracion;
	private EstadoVuelo estado;

	public Vuelo(String identificador, String aerolinea, String destino, LocalDate fechaVuelo, int duracion,
			EstadoVuelo estado) {
		super();
		this.identificador = identificador;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fechaVuelo = fechaVuelo;
		this.duracion = duracion;
		this.estado = estado;
	}

	protected String getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	protected String getAerolinea() {
		return aerolinea;
	}

	protected void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	protected String getDestino() {
		return destino;
	}

	protected void setDestino(String destino) {
		this.destino = destino;
	}

	protected LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	protected void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	protected int getDuracion() {
		return duracion;
	}

	protected void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	protected EstadoVuelo getEstado() {
		return estado;
	}

	protected void setEstado(EstadoVuelo estado) {
		this.estado = estado;
	}

	@Override
	public void operarVuelo() {
		System.out.println("Operando vuelo " + identificador + " con destino a " + destino);
	}

	@Override
	public int getDuracionVuelo() {
		return (duracion > 5) ? duracion + 3 : duracion + 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return Objects.equals(identificador, other.identificador);
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}
}