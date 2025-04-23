package ejerciciosPracticos.AgendaFiltrada.presentacion;

import ejerciciosPracticos.AgendaFiltrada.logica.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		GestionNotas gNotas = new GestionNotas();
		int opcion; // Opcion elegida por el usuario
		Scanner scanner = new Scanner(System.in);
		double nota;
		do {
			// Presentamos menu
			System.out.println("1. Añadir nota.");
			System.out.println("2. Ver media.");
			System.out.println("3. Ver aprobados.");
			System.out.println("4. Mostrar ordenados.");
			System.out.println("5. Borrar suspensos.");
			System.out.println("6. Salir.");
			opcion = Integer.parseInt(scanner.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Introduce nota:");
				nota = Double.parseDouble(scanner.nextLine());
				gNotas.guardarNota(nota);
				break;
			case 2:
				System.out.println("Media actual:" + gNotas.media());
				break;
			case 3:
				System.out.println("Aprobados:" + gNotas.aprobados());
				break;
			case 4:
				Double[] todas = gNotas.recuperarNotas();
				for (Double d : todas) {
					System.out.println(d + ",");
				}
				System.out.println("");
				break;
			case 5:
				gNotas.eliminarSuspensos();
			}

		} while (opcion != 6);
	}

}
