package boletín1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Introduce tu nombre de Usuario: ");
		String usuario = input.nextLine();

		System.out.println("Introduce tu contraseña: ");
		String clave = input.nextLine();

		if (usuario.equals("admin") && clave.equals("secreta123")) {
			System.out.println("Acceso permitido. Bienvenido, admin.");
		} 
		
		else {
			System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
		}

		input.close();
	}
}
