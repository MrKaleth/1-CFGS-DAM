package ejerciciosPracticos.Agenda.Controlador;

import java.util.Scanner;

import ejerciciosPracticos.Agenda.beans.Contacto;
import ejerciciosPracticos.Agenda.logica.GestionContactos;

public class GestionaAgendas {
	public static void main(String[] args) {
		GestionContactos gestor = new GestionContactos();
		Scanner input = new Scanner(System.in);
		int op, edad;
		String nombre, email;

		do {
			System.out.println("1.- Añadir contacto.");
			System.out.println("2.- Buscar Contacto.");
			System.out.println("3.- Eliminar Contacto.");
			System.out.println("4.- Mostrar todos.");
			System.out.println("5.- Salir.");
			op = Integer.parseInt(input.nextLine());

			switch (op) {
			case 1: {
				System.out.println("Nombre: ");
				nombre = input.nextLine();

				System.out.println("Edad: ");
				edad = Integer.parseInt(input.nextLine());

				System.out.println("Email: ");
				email = input.nextLine();

				gestor.agregar(nombre, edad, email);
				break;
			}
			case 2: {
				System.out.println("Email: ");
				email = input.nextLine();
				Contacto c = gestor.buscar(email);
				// si es null es que no se ha encontrado el email.
				if (c == null) {
					System.out.println("No se encontró el contacto");
				} else {
					System.out.println(c.getNombre() + "-" + c.getEmail() + "-" + c.getEdad());
				}
				break;
			}
			case 3: {
				System.out.println("Email: ");
				email = input.nextLine();
				if (gestor.eliminar(email)) {
					System.out.println("Contacto eliminado.");
				} else {
					System.out.println("No se encontró el contacto");
				}
				break;
			}

			case 4: {
				Contacto[] todos = gestor.recuperarContactos();
				for (Contacto con : todos) {
					System.out.println(con.getNombre() + "-" + con.getEmail() + "-" + con.getEdad());
				}
			}
			case 5: {
				break;
			}
			default: {
				System.out.println("Introduce una opción válida");
			}
			}

		} while (op != 5);

	}
}
