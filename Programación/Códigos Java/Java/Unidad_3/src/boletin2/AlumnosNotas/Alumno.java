package boletin2.AlumnosNotas;

public class Alumno {
	String nombre;
	String apellidos;
	String email;
	NotaAsignatura programacion;
	NotaAsignatura basesDeDatos;

	// Constructor con nombre y email
	public Alumno(String nombre, String apellidos, String email, NotaAsignatura programacion,
			NotaAsignatura basesDeDatos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.programacion = programacion;
		this.basesDeDatos = basesDeDatos;
	}

	// Método para imprimir si el alumno ha aprobado una asignatura
	public void imprimeSiHaAprobado(NotaAsignatura asignatura) {
		String resultado = asignatura.calcularNotaMedia() >= 5 ? "ha aprobado" : "NO ha aprobado";
		System.out.println("El alumno " + nombre + " " + resultado + " la asignatura " + asignatura.toString());
	}

	// Método toString
	@Override
	public String toString() {
		return "Alumno: " + nombre + " " + apellidos + ", Email: " + email + "\n" + "Notas: \n"
				+ programacion.toString() + "\n" + basesDeDatos.toString();
	}
}
