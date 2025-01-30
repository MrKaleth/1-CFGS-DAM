package ejercicioAlumnos;

public class Alumno {
	String nombre;
	String dni;
	float nota;
	
	String pasaACadena() {
		String cadena = "Alumno 1: " + nombre + " " + dni + ". Nota: " + nota;
		return cadena;
	}
	
	boolean estáAprobado() {
		boolean aprobado = false;
		if(nota>=5) {
			aprobado = true;
		}
		else {
			aprobado = false;
		}
		return aprobado;
	}
}
