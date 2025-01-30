package boletín0;

import java.util.Scanner;

public class GasolinaPocho {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("===================================");
			System.out.println("1. Asignar Surtidor.");
			System.out.println("2. Consultar Estado.");
			System.out.println("3. Asignar Precio.");
			System.out.println("4. Recargar Surtidor.");
			System.out.println("5. Cerrar Programa.");
			System.out.println("===================================");

			System.out.print("Elige una opción: ");
			opcion = input.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Asignar Surtidor seleccionado.");
				break;

			case 2:
				System.out.println("Consultar Estado seleccionado.");
				break;

			case 3:
				System.out.println("Asignar Precio seleccionado.");
				break;

			case 4:
				System.out.println("Recargar Surtidor seleccionado.");
				break;

			case 5:
				System.out.println("Cerrando programa...");
				break;

			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
			
		} while (opcion != 5);

		input.close();
	}
}