package unidad6.Práctica1;

import java.util.*;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Programa de suma de dos números.");
		System.out.print("Ingresa el primer número: ");
		int num1 = scanner.nextInt();
		System.out.print("Ingresa el segundo número: ");

		int num2 = scanner.nextInt();
		int resultado = sumarNumeros(num1, num2);
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
		scanner.close();
	}

	public static int sumarNumeros(int a, int b) {
		// Hay un error en la siguiente línea. ¡Usa el debugger para encontrarlo!
		int suma = a - b; // Cambiar a + b
		return suma;
	}

}