package biblioteca.Modelo;

public class Libro extends Recurso implements IPrestable {

	private String autor;
	private String editorial;
	private String genero;
	private boolean disponible;

	public Libro(String identificador, String ubicacion, String autor, String editorial, String genero,
			boolean disponible) {
		super(identificador, ubicacion);
		this.autor = autor;
		this.editorial = editorial;
		this.genero = genero;
		this.disponible = disponible;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getEditorial() {
		return editorial;
	}

	protected void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
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
		return 21;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", editorial=" + editorial + ", genero=" + genero + "]";
	}

}
