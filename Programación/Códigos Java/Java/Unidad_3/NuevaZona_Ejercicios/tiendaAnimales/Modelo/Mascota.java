package tiendaAnimales.Modelo;

import java.time.LocalDate;

public abstract class Mascota {
	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNacimiento;

	public Mascota(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	public void cumplirAnios() {
		this.edad++;
	}

	public void morir() {
		this.estado = "Fallecido";
	}

	public void muestra() {
		System.out.println(this);
	}
	
	public abstract boolean habla();

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [Nombre=" + nombre + ", Edad=" + edad + ", Estado=" + estado
				+ ", Fecha Nacimiento=" + fechaNacimiento + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
