package biblioteca.Controlador;

import biblioteca.Modelo.*;

public class GestionaBiblioteca {
	public static void main(String[] args) {
		Libro libro1 = new Libro("L001", "Estante A3", "J.K. Rowling", "Salamandra", "Fantasía", true);
		Libro libro2 = new Libro("L002", "Estante B1", "George Orwell", "Debolsillo", "Distopía", false);
		Pelicula pelicula1 = new Pelicula("P001", "Sección C2", "Inception", "Ciencia Ficción", 148, true);
		Pelicula pelicula2 = new Pelicula("P002", "Sección C3", "Titanic", "Romance", 195, false);
		Audio audio1 = new Audio("A001", "Sección D1", "Podcast Historia", "Educación", 45, true);
		Audio audio2 = new Audio("A002", "Sección D2", "Audiolibro Filosofía", "Filosofía", 90, false);
		Juego juego1 = new Juego("J001", "Sección E5", "The Witcher 3", "RPG", 50, true);
		Juego juego2 = new Juego("J002", "Sección E6", "Dark Souls 3", "Acción", 20, false);

		Recurso[] elementos = { libro1, libro2, pelicula1, pelicula2, audio1, audio2, juego1, juego2 };

		for (int i = 0; i < elementos.length; i++) {
			System.out.println(elementos[i]);
			IPrestable prestable = (IPrestable) elementos[i];
			System.out.println("  Disponible: " + prestable.estaDisponible());
			System.out.println("  Días de préstamo: " + prestable.getDevuelveDiasPrestamo());

			System.out.println("------------------------------");

		}

	}

}
