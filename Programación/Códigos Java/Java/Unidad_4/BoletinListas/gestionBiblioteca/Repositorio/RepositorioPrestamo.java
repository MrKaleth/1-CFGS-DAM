package gestionBiblioteca.Repositorio;

import java.util.LinkedList;
import java.util.List;

import gestionBiblioteca.Modelo.Prestamo;

public class RepositorioPrestamo {
	List<Prestamo> listaPrestamo;

	public RepositorioPrestamo(List<Prestamo> listaPrestamo) {
		super();
		this.listaPrestamo = new LinkedList<Prestamo>();
	}

}
