package gestionBiblioteca.Controlador;

import gestionBiblioteca.Modelo.*;
import gestionBiblioteca.Repositorio.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionaBiblioteca {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		GestionaBiblioteca f = new GestionaBiblioteca();
		List<Libro> listaLibrosBiblioteca = new ArrayList<Libro>();
		Biblioteca b = new Biblioteca(listaLibrosBiblioteca);
		boolean salir = false;
		while (!salir) {
			int opcion = f.menu(input);

			switch (opcion) {
			case 1: {
				f.agregaLibro(b);
				break;
			}

			case 2: {

				f.prestar(b);

				break;
			}

			case 3: {

				f.devolver(b);

				break;
			}

			case 4: {
				f.mostrar(b);
				break;
			}

			case 5: {
				f.infoLibro(b);
				break;
			}

			case 6: {
				f.busquedaLibro(b);
				break;
			}

			case 7: {
				salir = f.salirPrograma();
				break;
			}

			default:
				System.out.println("Valor inexperado: " + opcion + ". Por favor, ingrese opción nuevamente.");
				System.out.println();
			}
		}

		input.close();
	}

	int menu(Scanner input) {
		int opcion;
		System.out.println("--- Menu ---");
		System.out.println("1. Agregar un nuevo libro al inventario.");
		System.out.println("2. Prestar un ejemplar de libro.");
		System.out.println("3. Devolver un ejemplar prestado.");
		System.out.println("4. Mostrar la lista de todos los libros en el inventario");
		System.out.println("5. Mostrar información detallada de un libro");
		System.out.println("6. Buscar libros por título o autor");
		System.out.println("7. Salir del programa");
		System.out.println();
		System.out.println("Introduce la opción del menú: ");
		opcion = input.nextInt();
		return opcion;

	}

	void agregaLibro(Biblioteca b) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Agregando un libro nuevo al inventario...");
		System.out.println("Introduce los datos del libro.");
		System.out.println("Introduce título. ");
		String titulo = input.nextLine();
		System.out.println("Introduce nombre. ");
		String nombre = input.nextLine();
		System.out.println("Introduce género. ");
		String genero = input.nextLine();
		System.out.println("Introduce año. ");
		int anyo = input.nextInt();
		input.nextLine();
		System.out.println("Introduce ISBN. ");
		String isbn = input.nextLine();

		Libro l = new Libro(titulo, nombre, genero, anyo, EstadoLibro.LIBRE, isbn);
		b.anyadirLibro(l);
		System.out.println("Libro añadido de forma exitosa.");
		System.out.println();
	}

	void prestar(Biblioteca b) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el título del libro que quieres prestar: ");
		String titulo = input.nextLine();

		Libro libro = b.buscarLibro(titulo);
		try {
			b.prestarLibro(libro);

		} catch (BibliotecaException e) {
			System.out.println(e.getMessage());
		}
	}

	void devolver(Biblioteca b) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el título del libro que quieres devolver: ");
		String titulo = input.nextLine();

		Libro libro = b.buscarLibro(titulo);

		try {
			b.devolverLibro(libro);
		} catch (BibliotecaException e) {
			System.out.println(e.getMessage());
		}
	}

	void mostrar(Biblioteca b) {
		System.out.println("Mostrando lista de libros de la biblioteca: ");
		System.out.println(b);
		System.out.println();
	}

	void infoLibro(Biblioteca b) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el título del libro del que quieres saber su información: ");
		String titulo = input.nextLine();

		Libro libro = b.buscarLibro(titulo);
		if (libro != null) {
			System.out.println(libro);
		} else {
			System.out.println("El libro no se encuentra en la biblioteca.");
		}

		System.out.println();
	}

	void busquedaLibro(Biblioteca b) {
		Scanner input = new Scanner(System.in);
		System.out.println("¿Deseas buscar libro por título o por autor?");
		String busqueda = input.nextLine().toLowerCase();

		if (busqueda.equals("titulo")) {
			System.out.println("Introduce el título del libro: ");
			String titulo = input.nextLine();
			Libro libroEncontrado = b.buscarLibro(titulo);

			if (libroEncontrado != null) {
				System.out.println(libroEncontrado);

			} else {
				System.out.println("No se encontró ningún libro con ese título.");
			}
		}

		else if (busqueda.equals("autor")) {
			System.out.println("Introduce el autor del libro: ");
			String autor = input.nextLine();
			List<Libro> librosEncontrados = b.buscarLibroAutor(autor);

			if (!librosEncontrados.isEmpty()) {
				for (Libro libro : librosEncontrados) {
					System.out.println(libro);
				}

			} else {
				System.out.println("No se encontraron libros de ese autor.");
			}

		} else {
			System.out.println("Opción inválida. Debes escribir 'titulo' o 'autor'.");
		}
	}

	boolean salirPrograma() {
		System.out.println();
		System.out.println("Saliendo del programa...");
		return true;
	}
}
