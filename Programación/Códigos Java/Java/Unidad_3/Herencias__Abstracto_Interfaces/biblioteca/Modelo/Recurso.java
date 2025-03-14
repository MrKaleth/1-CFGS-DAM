package biblioteca.Modelo;

public abstract class Recurso {
	protected String identificador;
	protected String ubicacion;

	public Recurso(String identificador, String ubicacion) {
		super();
		this.identificador = identificador;
		this.ubicacion = ubicacion;
	}

	protected String getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	protected String getUbicacion() {
		return ubicacion;
	}

	protected void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Recurso [identificador=" + identificador + ", ubicacion=" + ubicacion + "]";
	}

}
