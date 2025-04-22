package ejerciciosCodificacion;

import java.util.Scanner;

public class CalculoValorMedio {
	public static double media(String cad) {
		String[] partes = cad.split(",");
		double suma = 0.0;
		for (int i = 0; i < partes.length; i++) {
			suma += Double.parseDouble(partes[i]);
		}

		return suma / partes.length;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Introduce tu cadena de notas (Usa este formato --> (4.2,7.1,2.8,9.0)");
		String cadenaNotas = input.nextLine();

		double resultado = media(cadenaNotas);

		System.out.println("Media: " + resultado);
	}
}
