package gestionBiblioteca.Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(listaLibros);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biblioteca other = (Biblioteca) obj;
		return Objects.equals(listaLibros, other.listaLibros);
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
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				libroEncontrado = libro;
			}
		}
		return libroEncontrado;
	}

	public List<Libro> buscarLibroAutor(String autor) {
	    List<Libro> librosEncontrados = new ArrayList<>();
	    for (Libro libro : listaLibros) {
	        if (libro.getAutor().equalsIgnoreCase(autor)) {
	            librosEncontrados.add(libro);
	        }
	    }
	    return librosEncontrados;
	}

}
