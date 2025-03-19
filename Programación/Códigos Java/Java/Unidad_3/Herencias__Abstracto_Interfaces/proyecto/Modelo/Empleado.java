package proyecto.Modelo;

import java.util.Objects;

public abstract class Empleado implements INomina {
	protected String nombre;
	protected String identificador;
	protected String apellidos;
	protected float salario;
	protected boolean tieneReduccionHorario;
	protected Categoria categoria;

	public Empleado(String nombre, String identificador, String apellidos, float salario, boolean tieneReduccionHorario,
			Categoria categoria) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
		this.apellidos = apellidos;
		this.salario = salario;
		this.tieneReduccionHorario = tieneReduccionHorario;
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, categoria, identificador, nombre, salario, tieneReduccionHorario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellidos, other.apellidos) && categoria == other.categoria
				&& Objects.equals(identificador, other.identificador) && Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario)
				&& tieneReduccionHorario == other.tieneReduccionHorario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", identificador=" + identificador + ", apellidos=" + apellidos
				+ ", salario=" + salario + ", tieneReduccionHorario=" + tieneReduccionHorario + ", categoria="
				+ categoria + "]";
	}

	public abstract String imprimeHorario();

	public abstract String devuelveFunciones();

}
