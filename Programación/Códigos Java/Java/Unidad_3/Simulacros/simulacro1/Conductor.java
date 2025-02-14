package simulacro1;

import java.util.Objects;

public class Conductor {
	private String nombre;
	private int anyoExperiencia;

	public Conductor(String nombre, int anyoExperiencia) {
		super();
		this.nombre = nombre;
		/*this.anyoExperiencia = anyoExperiencia;*/
		setanyoExperiencia(anyoExperiencia);
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getanyoExperiencia() {
		return anyoExperiencia;
	}

	protected void setanyoExperiencia(int anyo) {
		if (anyo < 0) {
			this.anyoExperiencia = 0;
		} else {

			this.anyoExperiencia = anyo;
		}
	}

	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anyoExperiencia=" + anyoExperiencia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anyoExperiencia, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductor other = (Conductor) obj;
		return anyoExperiencia == other.anyoExperiencia && Objects.equals(nombre, other.nombre);
	}

	public void conducir() {
		System.out.println("Estamos conduciendo el coche.");
	}

}
