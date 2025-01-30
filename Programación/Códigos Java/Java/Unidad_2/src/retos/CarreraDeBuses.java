package retos;

import java.util.Random;

public class CarreraDeBuses {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		String ganador = null;

		System.out.println("        <<<<<<<<<<<  CARRERA DE BUSES >>>>>>>>>>");
		System.out.println("                     SORAYA VS ISABEL ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.err.println("Interrupted: " + e.getMessage());
		}

		while (a < 97 && b < 97) {
			Random random = new Random();
			int c = random.nextInt(2) + 1; // Genera 1 o 2

			if (c == 1) {
				a++;
			} else if (c == 2) {
				b++;
			}

			System.out.println(buses(a, b));

			try {
				Thread.sleep(70);
			} catch (InterruptedException e) {
				System.err.println("Interrupted: " + e.getMessage());
			}
		}

		if (a >= 97) {
			ganador = "SORAYA";
		} else if (b >= 97) {
			ganador = "ISABEL";
		}

		System.out.println("\033[32mGANÓ LA CARRERA: " + ganador + "\033[0m");
	}

	public static String buses(int n1, int n2) {
		StringBuilder output = new StringBuilder();
		output.append(repeatString("-", 115)).append("\n");
		output.append(repeatString(" ", n1)).append("_______________  ").append(repeatString(" ", 100 - n1))
				.append("|\n");
		output.append(repeatString(" ", n1)).append("|__|__|__|__|__|___ ").append(repeatString(" ", 97 - n1))
				.append("|\n");
		output.append(repeatString(" ", n1)).append("|     SORAYA      |)").append(repeatString(" ", 96 - n1))
				.append("|\n");
		output.append(repeatString(" ", n1)).append("|~~~@~~~~~~~~~@~~~|)").append(repeatString(" ", 95 - n1))
				.append("|\n");
		output.append(repeatString("_", 115)).append("\n");
		output.append(repeatString(" ", n2)).append("_______________  ").append(repeatString(" ", 100 - n2))
				.append("|\n");
		output.append(repeatString(" ", n2)).append("|__|__|__|__|__|___ ").append(repeatString(" ", 97 - n2))
				.append("|\n");
		output.append(repeatString(" ", n2)).append("|      ISABEL     |)").append(repeatString(" ", 96 - n2))
				.append("|\n");
		output.append(repeatString(" ", n2)).append("|~~~@~~~~~~~~~@~~~|)").append(repeatString(" ", 95 - n2))
				.append("|\n");
		output.append(repeatString("_", 115));

		return output.toString();
	}

	public static String repeatString(String str, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(str);
		}
		return sb.toString();
	}
}
