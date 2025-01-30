package simulacro;

import java.util.Scanner;

public class Extra {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		Extra s = new Extra();
		double numero = s.obtenerNumeroValido(miEscaner);
		double numeroRedondeado = s.redondear(numero);
		System.out.printf("El número redondeado a dos decimales es:%.2f\n ", numeroRedondeado);
	}

	double obtenerNumeroValido(Scanner miEscaner) {
		double numero = 0;
		boolean numeroValido = false;
		while (!numeroValido) {
			System.out.print("Ingrese un número: ");
			String num = miEscaner.nextLine();

			if (num.matches("\\d*(\\.\\d+)?")) {
				numero = Double.parseDouble(num);
				numeroValido = true;
			} else {
				System.out.println("¡Eso no es un número valido!");
			}
		}
		return numero;
	}

	double redondear(double numero) {

		double numeroConvertido = numero * 100;
		int parteEntera = (int) numeroConvertido;
		double parteDecimal = numeroConvertido - parteEntera;
		if (parteDecimal >= 0.5) {
			parteEntera++;
		}

		return (double) parteEntera / 100.0;
	}
}
