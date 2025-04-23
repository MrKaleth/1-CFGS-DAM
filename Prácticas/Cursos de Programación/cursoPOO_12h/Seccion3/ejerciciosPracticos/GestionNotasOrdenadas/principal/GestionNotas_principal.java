package ejerciciosPracticos.GestionNotasOrdenadas.principal;

import java.util.Scanner;
import ejerciciosPracticos.GestionNotasOrdenadas.logica.GestionNotas_logica;

public class GestionNotas_principal {
	public static void main(String[] args) {
		GestionNotas_logica gnotas = new GestionNotas_logica();
		int op; // opción elegida por el usuario en el menu
		Scanner input = new Scanner(System.in);
		double nota;

		do {
			// presentamos menú
			System.out.println("1.- Añadir nota.");
			System.out.println("2.- Ver media.");
			System.out.println("3.- Ver aprobados.");
			System.out.println("4.- Mostrar ordenados.");
			System.out.println("5.- Salir.");
			op = Integer.parseInt(input.nextLine());

			switch (op) {
			case 1: {
				System.out.println("Introduce nota:");
				nota = Double.parseDouble(input.nextLine());
				gnotas.guardarNota(nota);
				break;
			}
			case 2: {
				System.out.println("Media actual: " + gnotas.media());
				break;
			}
			case 3: {
				System.out.println("Aprobados: " + gnotas.aprobados());
				break;
			}
			case 4: {
				Double[] todas = gnotas.recuperarNotas();
				for(Double d:todas) {
					System.out.print(d+", ");
				}
				System.out.println();
			}
			}

		} while (op != 5);

	}
}
