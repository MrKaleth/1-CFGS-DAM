package herencia;

import java.util.Objects;

public class Administrativo extends Empleado {
	float extra;

	public Administrativo(String nombre, String dni, float salarioBase, float extra) {
		super(nombre, dni, salarioBase);
		this.extra = extra;
	}

	public float getExtra() {
		return extra;
	}

	public void setExtra(float extra) {
		this.extra = extra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(extra);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrativo other = (Administrativo) obj;
		return Float.floatToIntBits(extra) == Float.floatToIntBits(other.extra);
	}

	private float CalculaSalario() {
		float SalarioReal = getSalarioBase() + extra;
		return SalarioReal;
	}

	public String PasaACadena() {
		String cadena = "DNI:" + getDni() + "-Nombre:" + getNombre() + "-Salario:" + CalculaSalario();
		return cadena;
	}
}
