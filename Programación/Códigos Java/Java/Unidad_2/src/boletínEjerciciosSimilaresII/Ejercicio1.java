package boletínEjerciciosSimilaresII;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ejercicio1 r = new Ejercicio1();
		Boolean Salir = false;
		String Num1 = "";
		int Num2 = 0;
		while (!Salir) {
			System.out.println("Introduce el Primer número: ");
			Num1 = input.nextLine();

			System.out.println("Introduce el Segundo número: ");
			Num2 = input.nextInt();

			if (Num1.length() < Num2) {
				System.out.println("Error.");
				System.out.println("Introduce de nuevo los números");
			} else {
				System.out.println("Introducidos ambos números.");
				Salir = true;
			}
			
		}
		System.out.println(r.sumaDigitos(Num1, Num2));
		input.close();
	}

	int sumaDigitos(String Num1, int Num2) {
	    int sumados = 0;

	    for (int i = 0; i < Num2; i++) {
	        // Convertir el carácter a su valor numérico
	        int Num1_v2 = Character.getNumericValue(Num1.charAt(i));
	        sumados += Num1_v2;
	    }

	    return sumados;
	}

}
