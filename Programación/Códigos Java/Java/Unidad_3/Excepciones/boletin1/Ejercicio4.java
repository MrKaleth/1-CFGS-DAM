package boletin1;

import java.util.Random;

public class Ejercicio4 {
	public static void main(String[] args) {
		Double[] resultados = new Double[100]; // Arreglo para almacenar los resultados
		Random rand = new Random();

		try {
			for (int i = 0; i <= 100; i++) { // Intentamos llenar hasta la posición 100
				int numerador = rand.nextInt(11); // Número aleatorio entre 0 y 10
				int denominador = rand.nextInt(11); // Número aleatorio entre 0 y 10

				if (denominador == 0) {
					throw new ArithmeticException("División por cero detectada.");
				}

				resultados[i] = (double) numerador / denominador; // Guardamos el resultado
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Intento de acceso fuera de los límites del arreglo.");
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Error: Intento de acceso a una posición nula.");
		}

		// Intentamos leer una posición nula
		try {
			Double valor = resultados[50]; // Suponemos que esta posición podría ser nula
			if (valor == null) {
				throw new NullPointerException("Valor nulo en la posición 50.");
			}
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
