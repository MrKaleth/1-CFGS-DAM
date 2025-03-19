package proyecto.Controlador;

import proyecto.Modelo.*;

public class GestionaEmpleados {
	public static void main(String[] args) {
		Desarrollador dev = new Desarrollador("Carlos", "DEV123", "Fernández", 3000, false,
				Categoria.DESARROLLADOR_SENIOR, new String[] { "Java", "Python" }, new String[] { "Spring", "Django" });

		JefeProyecto jefe = new JefeProyecto("Ana", "JP456", "Gómez", 5000, true, Categoria.JEFE_PROYECTO, true,
				new String[] { "PMP", "Scrum Master" });

		System.out.println(dev);
		System.out.println(dev.imprimeHorario());
		System.out.println(dev.devuelveFunciones());
		System.out.println("Nómina: " + dev.calculaImporteNomina() + "€");

		System.out.println("\n====================================\n");

		System.out.println(jefe);
		System.out.println(jefe.imprimeHorario());
		System.out.println(jefe.devuelveFunciones());
		System.out.println("Nómina: " + jefe.calcularNomina() + "€");
	}
}