package herencia;

public class GestionaEmpleados {

	public static void main(String[] args) {
		Administrativo carlos = new Administrativo("Carlos", "12345678A", 1200, 40);
		Directivo juan = new Directivo("Juan", "87654321B", 2800, 15);
		Empleado juana = new Empleado("Juana", "159753852C", 1200);
		Empleado juana1 = new Empleado("Juana", "159753852C", -1200);
		Empleado pepe = new Empleado("Pepe", "7514268951D", 1400);
		System.out.println("¿Son iguales estos empleados?: " + juana.sonIguales(juana1));
		System.out.println("¿Son iguales estos empleados?: " + juana.sonIguales(pepe));
		System.out.println(carlos.PasaACadena());
		System.out.println(juan.PasaACadena());
	}

}
