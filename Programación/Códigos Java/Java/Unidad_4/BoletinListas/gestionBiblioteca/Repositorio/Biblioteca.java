package gestionBiblioteca.Repositorio;

import java.util.ArrayList;
import java.util.List;
import gestionBiblioteca.Modelo.BibliotecaException;
import gestionBiblioteca.Modelo.EstadoLibro;
import gestionBiblioteca.Modelo.Libro;

public class Biblioteca {
	private List<Libro> listaLibros;

	public Biblioteca(List<Libro> listaLibros) {
		super();
		this.listaLibros = new ArrayList<Libro>();
	}

	protected List<Libro> getListaLibros() {
		return listaLibros;
	}

	protected void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "Biblioteca [listaLibros=" + listaLibros + "]";
	}

	public void anyadirLibro(Libro l) {
		listaLibros.add(l);
	}

	public Libro buscarLibro(String titulo) {
		Libro libroEncontrado = null;
		for (Libro libro : listaLibros) {
			if (libro.obtenerTitulo().equalsIgnoreCase(titulo)) {
				libroEncontrado = libro;
			}
		}
		return libroEncontrado;
	}

	public List<Libro> buscarLibroAutor(String autor) {
		List<Libro> librosEncontrados = new ArrayList<>();
		for (Libro libro : listaLibros) {
			if (libro.obtenerAutor().equalsIgnoreCase(autor)) {
				librosEncontrados.add(libro);
			}
		}
		return librosEncontrados;
	}

	public void prestarLibro(Libro l) throws BibliotecaException {
		if (l.obtenerEstado() != EstadoLibro.PRESTADO) {
			l.cambiarEstado(EstadoLibro.PRESTADO);
			System.out.println("El libro \"" + l.obtenerTitulo() + "\" ha sido prestado.");

		} else {
			throw new BibliotecaException("El libro \"" + l.obtenerTitulo() + "\" ya está prestado.");
		}

	}

	public void devolverLibro(Libro l) throws BibliotecaException {
		if (l.obtenerEstado() != EstadoLibro.LIBRE) {
			l.cambiarEstado(EstadoLibro.LIBRE);
			System.out.println("El libro \"" + l.obtenerTitulo() + "\" ha sido devuelto.");
		} else {
			throw new BibliotecaException("El libro \"" + l.obtenerTitulo() + "\" ya ha sido devuelto..");

		}

	}

}
