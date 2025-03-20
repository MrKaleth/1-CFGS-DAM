package competicion.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Prueba {
	private String id;
	private String lugar;
	private LocalDate fecha;
	private Estado_Prueba estado;

	public Prueba(String id, String lugar, LocalDate fecha, Estado_Prueba estado) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.fecha = fecha;
		this.estado = estado;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getLugar() {
		return lugar;
	}

	protected void setLugar(String lugar) {
		this.lugar = lugar;
	}

	protected LocalDate getFecha() {
		return fecha;
	}

	protected void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	protected Estado_Prueba getEstado() {
		return estado;
	}

	protected void setEstado(Estado_Prueba estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Prueba prueba = (Prueba) obj;
		return id.equals(prueba.id); // Comparar por el ID de la prueba
	}
	
	public String obtenerID(Prueba p) {
		return p.getId();
	}

	public String obtenerLugar(Prueba p) {
		return p.getLugar();
	}

	public LocalDate obtenerFecha(Prueba p) {
		return getFecha();
	}

}
