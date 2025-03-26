package gestionBiblioteca.Controlador;

import gestionBiblioteca.Modelo.*;

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
			int opcion = f.menu();

			switch (opcion) {
			case 1: {
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

				Libro l = new Libro(titulo, nombre, genero, anyo, EstadoLibro.LIBRE);
				b.anyadirLibro(l);
				System.out.println("Libro añadido de forma exitosa.");
				System.out.println();
				break;
			}

			case 2: {
				System.out.println("Introduce el título del libro que quieres prestar: ");
				String titulo = input.nextLine();

				Libro libro = b.buscarLibro(titulo);

				if (libro != null) {
					boolean prestado = libro.prestarLibro();

					if (prestado) {
						System.out.println("Libro prestado con éxito.");
					} else {
						System.out.println("No se pudo prestar el libro.");
					}
				} else {
					System.out.println("El libro no se encuentra en la biblioteca.");
				}
				System.out.println();
				break;
			}

			case 3: {
				System.out.println("Introduce el título del libro que quieres devolver: ");
				String titulo = input.nextLine();

				Libro libro = b.buscarLibro(titulo);

				if (libro != null) {
					boolean devuelto = libro.devolverLibro();

					if (devuelto) {
						System.out.println("Libro devuelto con éxito.");
					} else {
						System.out.println("No se pudo devolver el libro.");
					}
				} else {
					System.out.println("El libro no se encuentra en la biblioteca.");
				}
				System.out.println();
				break;
			}

			case 4: {
				System.out.println("Mostrando lista de libros de la biblioteca: ");
				System.out.println(b);
				System.out.println();
				break;
			}

			case 5: {
				System.out.println("Introduce el título del libro del que quieres saber su información: ");
				String titulo = input.nextLine();

				Libro libro = b.buscarLibro(titulo);
				if (libro != null) {
					System.out.println(libro);
				} else {
					System.out.println("El libro no se encuentra en la biblioteca.");
				}

				System.out.println();
				break;
			}

			case 6: {
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
				break;
			}
			
			case 7: {
				System.out.println("Saliendo del programa...");
				salir = true;
				break;
			}

			default:
				throw new IllegalArgumentException("Valor inesperado " + opcion);
			}
		}

		input.close();
	}

	int menu() {
		Scanner input = new Scanner(System.in);
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
}
