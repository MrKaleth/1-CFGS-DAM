package transportes.Modelo;

import java.util.Objects;

public abstract class RutaBase{

	private int id;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private double distanciaKm;

	public RutaBase(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm) {
		super();
		this.id = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.distanciaKm = distanciaKm;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	protected void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	protected Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	protected void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	protected double getDistanciaKm() {
		return distanciaKm;
	}

	protected void setDistanciaKm(double distanciaKm) {
		this.distanciaKm = distanciaKm;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RutaBase other = (RutaBase) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "RutaBase [id=" + id + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino
				+ ", distanciaKm=" + distanciaKm + "]";
	}
	
	

}
