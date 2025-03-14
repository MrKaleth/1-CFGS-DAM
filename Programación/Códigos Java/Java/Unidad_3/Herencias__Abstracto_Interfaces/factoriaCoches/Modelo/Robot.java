package factoriaCoches.Modelo;

import java.util.Objects;

public abstract class Robot {
	private static int contador;
	private int identificador;
	private String modelo;
	private int bateria_numerico;
	private Estado estado;
	private String combustible;
	private String descripcion;

	public Robot(String modelo, int bateria_numerico, Estado estado, String combustible, String descripcion) {
		this.identificador = asignarIdentificador();
		this.modelo = modelo;
		this.bateria_numerico = bateria_numerico;
		this.estado = estado;
		this.combustible = combustible;
		this.descripcion = descripcion;
	}

	private static int asignarIdentificador() {
		return contador++;
	}

	public boolean tieneBateriaSuficiente() {
		return this.getBateria_numerico() > 10;
	}

	@Override
	public String toString() {
		return "Robot ID: " + identificador + ", Modelo: " + modelo + ", Estado: " + estado + ", Batería: "
				+ bateria_numerico;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		return identificador == other.identificador;
	}

	protected int getIdentificador() {
		return identificador;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected int getBateria_numerico() {
		return bateria_numerico;
	}

	protected void setBateria_numerico(int bateria_numerico) {
		this.bateria_numerico = bateria_numerico;
	}

	protected Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

	protected String getCombustible() {
		return combustible;
	}

	protected void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public abstract void ejecutarTarea();

	public abstract boolean recargar();
}