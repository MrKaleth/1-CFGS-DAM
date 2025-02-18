package herencia;

import java.util.Objects;

public class Directivo extends Empleado {
	float bonificacion;

	public Directivo(String nombre, String dni, float salarioBase, float bonificacion) {
		super(nombre, dni, salarioBase);
		this.bonificacion = bonificacion;
	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bonificacion);
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
		Directivo other = (Directivo) obj;
		return Float.floatToIntBits(bonificacion) == Float.floatToIntBits(other.bonificacion);
	}

	private float CalculaSalario() {
		float bonificacion1 = bonificacion / 100;
		float bonificacion2 = bonificacion1 * getSalarioBase();
		float salarioReal = getSalarioBase() + bonificacion2;
		return salarioReal;
	}

	public String PasaACadena() {
		String cadena = "DNI:" + getDni() + "-Nombre:" + getNombre() + "-Salario:" + CalculaSalario();
		return cadena;
	}
}
