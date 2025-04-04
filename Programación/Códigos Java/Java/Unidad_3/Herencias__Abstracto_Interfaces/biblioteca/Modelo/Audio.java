package biblioteca.Modelo;

public class Audio extends ElementoMultimedia implements IPrestable {
	private int duracion;
	private boolean disponible;

	public Audio(String identificador, String ubicacion, String nombre, String genero, int duracion,
			boolean disponible) {
		super(identificador, ubicacion, nombre, genero);
		this.duracion = duracion;
		this.disponible = disponible;
	}

	protected int getDuracion() {
		return duracion;
	}

	protected void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	protected boolean isDisponible() {
		return disponible;
	}

	protected void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public boolean estaDisponible() {
		return disponible;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		return 10;
	}

	@Override
	public String toString() {
		return "Audio [duracion=" + duracion + "]";
	}

	

}
