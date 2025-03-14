package biblioteca.Modelo;

public class ElementoMultimedia extends Recurso implements IPrestable {

	protected String nombre;
	protected String genero;

	public ElementoMultimedia(String identificador, String ubicacion, String nombre, String genero) {
		super(identificador, ubicacion);
		this.nombre = nombre;
		this.genero = genero;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "ElementoMultimedia [nombre=" + nombre + ", genero=" + genero + "]";
	}
	
	

}
