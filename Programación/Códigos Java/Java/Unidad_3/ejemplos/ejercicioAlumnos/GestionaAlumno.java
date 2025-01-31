package ejercicioAlumnos;

public class GestionaAlumno {
	public static void main(String[] args) {
		Alumno Alonso = new Alumno();
		Alonso.nombre = "Alonso";
		Alonso.dni = "47568789M";
		Alonso.nota = 8;
		
		Alumno Pachino = new Alumno();
		Pachino.nombre = "Pachino";
		Pachino.dni = "28488404Y";
		Pachino.nota = 4;
		
		String cadenaAlonso = Alonso.pasaACadena();
		String cadenaPachino = Pachino.pasaACadena();
		
		System.out.println(cadenaAlonso);
		System.out.println(cadenaPachino);
		
		boolean apruebaAlonso = Alonso.estáAprobado();
		boolean apruebaPachino = Pachino.estáAprobado();
		
		System.out.println(apruebaAlonso);
		System.out.println(apruebaPachino);
	}
}
