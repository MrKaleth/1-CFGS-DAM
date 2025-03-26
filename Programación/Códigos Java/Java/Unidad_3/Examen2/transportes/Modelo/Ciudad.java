package transportes.Modelo;

import java.util.Objects;

public class Ciudad {

	private String nombre;
	private int numHabitantes;

	public Ciudad(String nombre, int numHabitantes) {
		super();
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getNumHabitantes() {
		return numHabitantes;
	}

	protected void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(nombre.toUpperCase(), other.nombre.toUpperCase());
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", numHabitantes=" + numHabitantes + "]";
	}

}
