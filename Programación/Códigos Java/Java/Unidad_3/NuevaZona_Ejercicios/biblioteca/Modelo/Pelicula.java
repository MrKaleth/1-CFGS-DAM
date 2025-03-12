package biblioteca.Modelo;

public class Pelicula extends ElementoMultimedia implements IPrestable {
	private int duracion;
	private boolean disponible;

	public Pelicula(String identificador, String ubicacion, String nombre, String genero, int duracion,
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

}
