package ejemplo.PersonaHerencia;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private float salario;

	public Persona(String nombre, String apellidos, int edad, float salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected float getSalario() {
		return salario;
	}

	protected void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void concentrarse() {
		System.out.println("Se ha concentrado.");
	}
	
	public void viajar(String lugar) {
		System.out.println("Ha viajado a" + lugar);
	}

}
