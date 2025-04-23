package ejerciciosPracticos.Almacen.presentacion;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

import ejerciciosPracticos.Almacen.bean.Pieza;
import ejerciciosPracticos.Almacen.logica.GestionPiezas;

public class Principal {

	public static void main(String[] args) {
		GestionPiezas gestor = new GestionPiezas();
		Scanner scanner = new Scanner(System.in);
		int opcion, dia, mes, anio;
		String nombre;
		do {
			System.out.println("1. Añadir pieza.");
			System.out.println("2. Piezas antiguas.");
			System.out.println("3. Salir.");
			opcion = Integer.parseInt(scanner.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Nombre pieza:");
				nombre = scanner.nextLine();
				System.out.println("Año de fabricacion:");
				anio = Integer.parseInt(scanner.nextLine());
				System.out.println("Mes de fabricacion(1-12):");
				mes = Integer.parseInt(scanner.nextLine());
				System.out.println("Dia de fabricacion:");
				dia = Integer.parseInt(scanner.nextLine());
				/*
				 * Creamos un Calendar con los datos de fecha introducidos.
				 */
				Calendar calendar = Calendar.getInstance();
				calendar.set(anio, mes - 1, dia);
				// Pasamos la fecha al metodo como un objeto Date.
				gestor.agregarPieza(nombre, calendar.getTime());
				break;
			case 2:
				System.out.println("Año fabricacion:");
				anio = Integer.parseInt(scanner.nextLine());
				System.out.println("Mes de fabricacion(1-12):");
				mes = Integer.parseInt(scanner.nextLine());
				System.out.println("Dia de fabricacion:");
				dia = Integer.parseInt(scanner.nextLine());
				/*
				 * Creamos un Calendar con los datos de fecha. introducidos
				 */
				Calendar calendar2 = Calendar.getInstance();
				// Se resta 1 en el mes porque van de 0 a 11.
				calendar2.set(anio, mes - 1, dia);
				HashSet<Pieza> piezas = gestor.obtenerAntiguas(calendar2.getTime());
				/*
				 * Recorremos las piezas recuperadas y mostramos la fecha formateada.
				 */
				for (Pieza pieza : piezas) {
					DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("ES", "es"));
					System.out.println(pieza.getNombre() + "-" + df.format(pieza.getFechaFabricacion()));
				}
				break;
			}
		} while (opcion != 3);

	}

}
