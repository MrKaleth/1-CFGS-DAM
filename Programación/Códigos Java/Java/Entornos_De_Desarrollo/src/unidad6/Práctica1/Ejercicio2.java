package unidad6.Práctica1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] tabla = new int[10];

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce un número: ");
			int num = input.nextInt();
			tabla[i] = num;
		}
		System.out.println();
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}

		input.close();
	}
}