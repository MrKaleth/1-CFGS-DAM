package herencia;

import java.util.Objects;

public class Empleado {
	private String nombre;
	private String dni;
	private float SalarioBase;

	public Empleado(String nombre, String dni, float salarioBase) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		SalarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		SalarioBase = salarioBase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(SalarioBase, dni, nombre);
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
		return Float.floatToIntBits(SalarioBase) == Float.floatToIntBits(other.SalarioBase)
				&& Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	public void ValidaSalario() {
		if (SalarioBase < 0) {
			SalarioBase = 1134;
			System.out.println("Error. Se ha determinado el salario mínimo interprofesional.");
		}
	}

	public boolean sonIguales(Empleado p1) {
		boolean iguales = false;
		if (dni.equals(p1.dni)) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;
	}

}
