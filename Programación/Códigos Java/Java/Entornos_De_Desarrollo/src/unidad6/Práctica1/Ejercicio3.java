package unidad6.Práctica1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int usuario = -1;

		while (usuario != 0) {
			System.out.println("Elige una opción:");
			System.out.println("1. Piedra");
			System.out.println("2. Papel");
			System.out.println("3. Tijeras");
			System.out.println("0. Salir");
			System.out.print("Ingresa el número de tu elección: ");

			usuario = input.nextInt();

			if (usuario == 0) {
				System.out.println("Gracias por jugar. ¡Hasta luego!");
			} else if (usuario >= 1 && usuario <= 3) {
				int computadora = random.nextInt(3) + 1;
				String[] opciones = { "Piedra", "Papel", "Tijeras" };

				System.out.println();
				System.out.println("Tú elegiste: " + opciones[usuario - 1]);
				System.out.println("La computadora eligió: " + opciones[computadora - 1]);

				if (usuario == computadora) {
					System.out.println("Empate");
				} else if ((usuario == 1 && computadora == 3) || (usuario == 2 && computadora == 1)
						|| (usuario == 3 && computadora == 2)) {
					System.out.println("¡Ganaste!");
					System.out.println();

				} else {
					System.out.println("Perdiste.");
					System.out.println();

				}
			} else {
				System.out.println("Elección inválida. Inténtalo de nuevo.");
				System.out.println();

			}
		}

		input.close();
	}
}
