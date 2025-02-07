package ejemplo.PersonaEquipo;

public class Persona {
	String nombre;
	String apellido;
	String dni;
	int edad;

	public Persona(String nombre, String apellido, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

}
