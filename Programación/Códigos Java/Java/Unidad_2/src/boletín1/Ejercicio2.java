package boletín1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner input = new Scanner(System.in);

		System.out.print("Ingresa el primer número entero: ");
		int num1 = input.nextInt();

		System.out.print("Ingresa el segundo número entero: ");
		int num2 = input.nextInt();

		int resultado = num1 * num2;
		System.out.println("El resultado de la multiplicación es: " + resultado);

		// Cerrar el Scanner
		input.close();
	}
}