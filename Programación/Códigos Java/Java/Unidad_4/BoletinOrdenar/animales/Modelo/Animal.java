package animales.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Animal implements Comparable<Animal>{
	private int id;
	private String nombre;
	private String especie;
	private ClasificacionComida clasificacionComida;
	private LocalDate fechaNacimiento;
	private double peso;
	private TipoMedio medio;
	private ClasificacionGestacion clasiGestacion;

	public Animal(int id, String nombre, String especie, ClasificacionComida clasificacionComida,
			LocalDate fechaNacimiento, double peso, TipoMedio medio, ClasificacionGestacion clasiGestacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.clasificacionComida = clasificacionComida;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.medio = medio;
		this.clasiGestacion = clasiGestacion;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getEspecie() {
		return especie;
	}

	protected void setEspecie(String especie) {
		this.especie = especie;
	}

	protected ClasificacionComida getClasificacionComida() {
		return clasificacionComida;
	}

	protected void setClasificacionComida(ClasificacionComida clasificacionComida) {
		this.clasificacionComida = clasificacionComida;
	}

	protected LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	protected void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected TipoMedio getMedio() {
		return medio;
	}

	protected void setMedio(TipoMedio medio) {
		this.medio = medio;
	}

	protected ClasificacionGestacion getClasiGestacion() {
		return clasiGestacion;
	}

	protected void setClasiGestacion(ClasificacionGestacion clasiGestacion) {
		this.clasiGestacion = clasiGestacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clasiGestacion, clasificacionComida, especie, fechaNacimiento, id, medio, nombre, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return clasiGestacion == other.clasiGestacion && clasificacionComida == other.clasificacionComida
				&& Objects.equals(especie, other.especie) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& id == other.id && medio == other.medio && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", clasificacionComida="
				+ clasificacionComida + ", fechaNacimiento=" + fechaNacimiento + ", peso=" + peso + ", medio=" + medio
				+ ", clasiGestacion=" + clasiGestacion + "]";
	}

	@Override
	public int compareTo(Animal o) {
		return 0;
	}
	
	
}
