package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		System.out.println("Escribe la cantidad de números que deseas agregar: ");
		int cantidadNum = miEscaner.nextInt();
		int[] numeros = new int[cantidadNum];
		boolean hayPositivos = false;

		System.out.println("Introduce " + cantidadNum + " números:");

		for (int pos = 0; pos < cantidadNum; pos++) {
			try {
				int numero = miEscaner.nextInt();
				numeros[pos] = numero;
				if (numero >= 0) {
					hayPositivos = true;
					throw new ArithmeticException("Número positivo encontrado: " + numero);
				}
			} catch (ArithmeticException e) {
				System.out.println("Excepción capturada: " + e.getMessage());
			} finally {
				System.out.println("Número analizado.");
			}
		}

		System.out.print("Los números introducidos son: [");
		for (int posNum = 0; posNum < cantidadNum; posNum++) {
			System.out.print(numeros[posNum]);
			if (posNum != cantidadNum - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		if (!hayPositivos) {
			System.out.println("Todos los números son negativos.");
		}

		miEscaner.close();
	}
}
