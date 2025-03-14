package ejemplo.Abstracto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepciones {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un número entero: ");
		int numero;

		try {
			numero = scanner.nextInt();
			String cadena = "";
			System.out.println(cadena.charAt(10));
			System.out.print("Detrás del input");
		}

		catch (InputMismatchException e) {
			System.err.println("Entro en el catch 1: " + e.getCause());
			System.out.println("Entro en el catch 1: " + e.getMessage());
			System.out.print("Ingresa un número entero: ");
			numero = scanner.nextInt();
		}

		catch (StringIndexOutOfBoundsException pepe) {
			System.err.println("Entro en el catch 2: " + pepe.getCause());
			System.out.println("Entro en el catch 2: " + pepe.getMessage());
		}

		catch (Exception e) {
			// TODO: handle exception
		}

		finally {
			System.out.println("Pase lo que pase salgo");
		}

		System.out.print("Sigo detrás del finally");
		scanner.close();
	}
}