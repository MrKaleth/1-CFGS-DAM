package navegacion.Controlador;

import java.util.Scanner;

public class GestionaHistorial {
	public static void main(String[] args) {
		GestionaHistorial f = new GestionaHistorial();
		Scanner input = new Scanner(System.in);

		// Insertar aquí historial

		boolean salir = false;
		while (!salir) {
			int opcion = f.menu(input);

			switch (opcion) {
			case 1: {
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				salir = f.salirPrograma();
				break;
			}
			default:
				System.out.println("Valor inexperado: " + opcion + ". Por favor, ingrese opción nuevamente.");
				System.out.println();
			}
		}

	}

	int menu(Scanner input) {
		int opcion;
		System.out.println("=== MENU DEL PROGRAMA ===");
		System.out.println("1. Agregar página al historial.");
		System.out.println("2. Consultar historial completo.");
		System.out.println("3. Consultar historial de un día específico.");
		System.out.println("4. Consultar registros del historial para una url específica.");
		System.out.println("5. Borrar visitas a una página específica.");
		System.out.println("6. Salir del programa.");

		opcion = input.nextInt();
		return opcion;

	}

	boolean salirPrograma() {
		System.out.println();
		System.out.println("Saliendo del programa...");
		return true;
	}
}
