package gestionBiblioteca.Modelo;

import java.util.ArrayList;
import java.util.List;
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
	
	public boolean prestarLibro(Libro l) throws BibliotecaException{
		boolean prestado;
		if (l.getEstado() != EstadoLibro.PRESTADO) {
			l.setEstado(EstadoLibro.PRESTADO);
			System.out.println("El libro \"" + l.getTitulo() + "\" ha sido prestado.");
			prestado = true;
		} else {
			throw new BibliotecaException("El libro \"" + l.getTitulo() + "\" ya está prestado.");
		}

		return prestado;
	}

	public boolean devolverLibro(Libro l) throws BibliotecaException {
		boolean devuelto;
		if (l.getEstado() != EstadoLibro.LIBRE) {
			l.setEstado(EstadoLibro.LIBRE);
			System.out.println("El libro \"" + l.getTitulo() + "\" ha sido devuelto.");
			devuelto = true;
		} else {
			throw new BibliotecaException("El libro \"" + l.getTitulo() + "\" ya ha sido devuelto..");

		}

		return devuelto;
	}

}
