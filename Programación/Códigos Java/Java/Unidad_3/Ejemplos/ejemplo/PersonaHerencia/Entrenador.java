package ejemplo.PersonaHerencia;

class Entrenador extends Persona {
	private String idFederacion;
	private float salario;

	public Entrenador(String nombre, String apellidos, int edad, float salario, String idFederacion, float salario2) {
		super(nombre, apellidos, edad, salario);
		this.idFederacion = idFederacion;
		salario = salario2;
	}

	protected String getIdFederacion() {
		return idFederacion;
	}

	protected void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	protected float getSalario() {
		return salario;
	}

	protected void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void dirigirPartido() {
		System.out.println("Ha dirigido el partido.");
	}

}
