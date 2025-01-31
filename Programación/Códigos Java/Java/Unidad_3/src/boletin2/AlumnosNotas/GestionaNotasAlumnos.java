package boletin2.AlumnosNotas;

public class GestionaNotasAlumnos {

	public static void main(String[] args) {
		// Crear notas de los alumnos
		NotaAsignatura progLucia = new NotaAsignatura("Programación", 5, 7, 7);
		NotaAsignatura bdLucia = new NotaAsignatura("Bases de Datos", 6, 6, 7);
		NotaAsignatura progAndres = new NotaAsignatura("Programación", 4, 4, 6);
		NotaAsignatura bdAndres = new NotaAsignatura("Bases de Datos", 9, 8, 8);
		NotaAsignatura progVicente = new NotaAsignatura("Programación", 2, 2, 3);
		NotaAsignatura bdVicente = new NotaAsignatura("Bases de Datos", 6, 6, 7);

		// Crear alumnos
		Alumno lucia = new Alumno("Lucía", "Pérez", "lucia@example.com", progLucia, bdLucia);
		Alumno andres = new Alumno("Andrés", "Gómez", "andres@example.com", progAndres, bdAndres);
		Alumno vicente = new Alumno("Vicente", "López", "vicente@example.com", progVicente, bdVicente);

		// Imprimir la nota media de Vicente en Programación
		System.out.println("Nota media de Vicente en Programación: " + progVicente.calcularNotaMedia());

		// Ejecutar imprimeSiHaAprobado para Vicente y Lucía
		vicente.imprimeSiHaAprobado(progVicente);
		lucia.imprimeSiHaAprobado(progLucia);
		
		System.out.println();
		System.out.println(andres);
		
		System.out.println();
		System.out.println("Andrés ha Aprobado " + bdAndres.contarTrimestresAprobados() + " trimestres de Base de Datos");
	}

}
