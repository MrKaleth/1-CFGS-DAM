package simulacro;

import java.util.Scanner;
import java.util.Random;

public class ApuestaDados {
	String[][] historial = new String[100][4]; // Tabla con un máximo de 100 jugadas
	int contadorJugadas = 0;
	int saldoTotal = 0;

	public static void main(String[] args) {
		ApuestaDados r = new ApuestaDados();
		r.pintaMenu();
	}

	String pintaMenu() {
		Scanner input = new Scanner(System.in);
		ApuestaDados r = new ApuestaDados();
		String opcion = "";
		boolean Retirarse = false;

		while (!Retirarse) {
			System.out.println("1. Apostar");
			System.out.println("2. Mostrar Historial");
			System.out.println("3. Retirarse");
			System.out.print("Selecciona una opción: ");

			opcion = input.nextLine();

			switch (opcion) {
			case "1":
				System.out.println(r.apuesta());
				break;

			case "2":
				System.out.println(r.mostrarHistorial());
				break;

			case "3":
				Retirarse = true;
				System.out.println(r.retirarse());
				break;

			default:
				System.out.println("Opción no válida. Por favor, elige una opción del 1 al 3.");
				break;
			}
		}
		input.close();
		return opcion;
	}

	String apuesta() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		String respuesta = "";

		System.out.println("Introduce el número sobre el que deseas apostar (2-12): ");
		int numeroApostado = input.nextInt();

		if (numeroApostado < 2 || numeroApostado > 12) {
			respuesta = "Número no válido. Debes apostar entre 2 y 12.";
		} else {
			System.out.println("Introduce la cantidad apostada: ");
			int cantidadApostada = input.nextInt();

			int dado1 = random.nextInt(6) + 1;
			int dado2 = random.nextInt(6) + 1;
			int sumaDados = dado1 + dado2;

			System.out.println("Resultado de los dados: " + dado1 + " + " + dado2 + " = " + sumaDados);

			if (sumaDados == numeroApostado) {
				int ganancia = cantidadApostada * 2;
				saldoTotal += ganancia;
				respuesta = "¡Felicidades, has ganado! Tu ganancia es: " + ganancia;
				respuesta += registrarJugada(numeroApostado, sumaDados, "Ganó", ganancia);
			} else {
				int perdida = cantidadApostada;
				saldoTotal -= perdida;
				respuesta = "Lo siento, has perdido. Tu pérdida es: " + perdida;
				respuesta += registrarJugada(numeroApostado, sumaDados, "Perdió", perdida);
			}
		}

		input.nextLine();
		return respuesta;
	}

	String registrarJugada(int numeroApostado, int sumaDados, String resultado, int cantidad) {
		String mensaje = "";
		if (contadorJugadas < 100) {
			historial[contadorJugadas][0] = String.valueOf(contadorJugadas + 1); // Número de jugada
			historial[contadorJugadas][1] = String.valueOf(numeroApostado); // Valor apostado
			historial[contadorJugadas][2] = String.valueOf(sumaDados); // Suma de los dados
			historial[contadorJugadas][3] = resultado + " " + cantidad; // Resultado y cantidad
			contadorJugadas++;
			mensaje = " Jugada registrada correctamente.";
		} else {
			mensaje = " El historial está lleno. No se pueden registrar más jugadas.";
		}
		return mensaje;
	}

	String mostrarHistorial() {
		if (contadorJugadas == 0) {
			return "No hay jugadas en el historial.";
		} else {
			StringBuilder historialCompleto = new StringBuilder();
			historialCompleto.append("Historial de jugadas:\n");
			historialCompleto.append("Nº | Valor Apostado | Suma Dados | Resultado\n");
			for (int i = 0; i < contadorJugadas; i++) {
				historialCompleto.append(historial[i][0]).append("  | ").append(historial[i][1])
						.append("             | ").append(historial[i][2]).append("          | ")
						.append(historial[i][3]).append("\n");
			}
			return historialCompleto.toString();
		}
	}

	String retirarse() {
		String mensaje = "Has decidido retirarte. Tu saldo total es: " + saldoTotal;
		return mensaje;
	}
}
