package boletín8;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Ejercicio1 r = new Ejercicio1();

		Scanner scanner = new Scanner(System.in);
		char[] grupos = { 'A', 'B', 'C', 'D' };
		int[] alumnosPorGrupo = { 25, 28, 31, 29 };
		/* int[] alumnosPorGrupo = {2, 1, 1, 2}; */

		System.out.print("Introduce la letra del grupo (A, B, C, D): ");
		char grupoSeleccionado = scanner.next().toUpperCase().charAt(0);

		int indexGrupo = r.getIndexGrupo(grupoSeleccionado, grupos);
		if (indexGrupo == -1) {
			System.out.println("Grupo inválido. Fin del programa.");
		}

		int numAlumnos = alumnosPorGrupo[indexGrupo];

		String[] nombres = new String[numAlumnos];
		int[][] notas = new int[numAlumnos][3];

		r.registrarAlumnos(scanner, nombres, notas, numAlumnos);

		int[] medias = r.calcularMedias(notas);
		String alumnoMayorNota = r.obtenerMayorNotaMedia(nombres, medias);
		int cantidadSuspensos = r.contarSuspensos(medias);
		boolean existenSobresalientes = r.verificarSobresalientes(medias);

		System.out.println("El alumno con mayor nota media es: " + alumnoMayorNota);
		System.out.println("Cantidad de alumnos con nota media suspensa: " + cantidadSuspensos);
		if (existenSobresalientes) {
			System.out.println("Existen sobresalientes.");
		}
		scanner.close();
	}

	int getIndexGrupo(char grupo, char[] grupos) {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] == grupo) {
				return i;
			}
		}
		return -1;
	}

	String[][] registrarAlumnos(Scanner scanner, String[] nombres, int[][] notas, int numAlumnos) {
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Introduce los datos del alumno " + (i + 1) + ":");
			System.out.print("Nombre: ");
			scanner.nextLine();
			nombres[i] = scanner.nextLine();
			System.out.print("Nota del primer parcial: ");
			notas[i][0] = scanner.nextInt();
			System.out.print("Nota del segundo parcial: ");
			notas[i][1] = scanner.nextInt();
			System.out.print("Nota del tercer parcial: ");
			notas[i][2] = scanner.nextInt();
		}
		return new String[][] { nombres };
	}

	int[] calcularMedias(int[][] notas) {
		int numAlumnos = notas.length;
		int[] medias = new int[numAlumnos];
		for (int i = 0; i < numAlumnos; i++) {
			medias[i] = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
		}
		return medias;
	}

	String obtenerMayorNotaMedia(String[] nombres, int[] medias) {
		int mayor = -1;
		String nombreMayor = "";
		for (int i = 0; i < medias.length; i++) {
			if (medias[i] > mayor) {
				mayor = medias[i];
				nombreMayor = nombres[i];
			}
		}
		return nombreMayor;
	}

	int contarSuspensos(int[] medias) {
		int contador = 0;
		for (int media : medias) {
			if (media < 5) {
				contador++;
			}
		}
		return contador;
	}

	boolean verificarSobresalientes(int[] medias) {
		boolean Sobresaliente = false;
		for (int media : medias) {
			if (media >= 9) {
				Sobresaliente = true;
						}
		}
		return Sobresaliente;
	}
}