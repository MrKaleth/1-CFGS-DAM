package ejemploPersonaEquipo;

public class GestionaEquipo {
	public static void main(String[] args) {
		Persona p1 = new Persona("Andrea", "Perea", "12345678c", 12);
		Persona p2 = new Persona("Luis", "Perea", "12345679d", 15);
		Persona p3 = new Persona("David", "Perez", "22345678c", 18);
		Persona p4 = new Persona("Sebastian", "Rodriguez", "28145678c", 22);

		Persona[] persona1 = { p1, p2 };
		Persona[] persona2 = { p3, p4 };

		int[] puntuaciones1 = { 7, 14, 22 };
		int[] puntuaciones2 = { 40, 12, 3 };

		Equipo e1 = new Equipo("equipo1", puntuaciones1, persona1);
		Equipo e2 = new Equipo("Equipo2", puntuaciones2, persona2);

		System.out.println(e1);

		Persona[] tablaPersona = e1.personas;
		for (int i = 0; i < tablaPersona.length; i++) {
			Persona p = tablaPersona[i];
			System.out.println(p.dni);
		}
		
		System.out.println(e1.mediaEdad());
		System.out.println(e2.mediaEdad());
		
	}
}
