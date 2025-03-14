package biblioteca.Modelo;

public class Juego extends ElementoMultimedia implements IPrestable {
	private int numeroFases;
	private boolean disponible;

	public Juego(String identificador, String ubicacion, String nombre, String genero, int numeroFases,
			boolean disponible) {
		super(identificador, ubicacion, nombre, genero);
		this.numeroFases = numeroFases;
		this.disponible = disponible;
	}

	protected int getNumeroFases() {
		return numeroFases;
	}

	protected void setNumeroFases(int numeroFases) {
		this.numeroFases = numeroFases;
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
		return "Juego [numeroFases=" + numeroFases +"]";
	}

	

}
