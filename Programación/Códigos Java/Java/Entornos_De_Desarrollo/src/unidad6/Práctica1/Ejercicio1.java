package unidad6.Práctica1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce los números (8) de tu DNI: ");
		String numDNI = input.nextLine();

		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		if (numDNI.length() != 8) {
			System.out.println("Número de DNI inválido. No posee 8 dígitos");
		} else {

			int resto = Integer.parseInt(numDNI) % 23;
			String dniCompleto = numDNI + letras[resto];

			System.out.println(
					"La Letra de tu DNI debe de ser: " + letras[resto] + ". " + "Tu DNI completo será: " + dniCompleto);

		}
		input.close();

	}
}