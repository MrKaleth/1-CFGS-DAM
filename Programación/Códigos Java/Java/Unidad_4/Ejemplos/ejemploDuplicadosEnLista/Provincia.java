package ejemploDuplicadosEnLista;

import java.util.Objects;

public class Provincia {
	private String nombre;
	private int poblacion;

	public Provincia(String nombre, int poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getPoblacion() {
		return poblacion;
	}

	protected void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, poblacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		return Objects.equals(nombre, other.nombre) && poblacion == other.poblacion;
	}

}
