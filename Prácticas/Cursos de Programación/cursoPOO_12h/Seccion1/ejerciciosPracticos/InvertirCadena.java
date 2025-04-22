package ejerciciosPracticos;

import java.util.Scanner;

public class InvertirCadena {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cad;
		StringBuilder aux = new StringBuilder("");

		System.out.println("Introduce una cadena de texto");
		cad = input.nextLine();

		for (int i = cad.length() - 1; i >= 0; i--) {
			aux.append(cad.charAt(i));
		}

		System.out.println(aux.toString());
		System.out.println(aux.reverse());

	}
}
