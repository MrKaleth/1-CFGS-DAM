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

	protected List<Prestamo> getListaPrestamo() {
		return listaPrestamo;
	}

	protected void setListaPrestamo(List<Prestamo> listaPrestamo) {
		this.listaPrestamo = listaPrestamo;
	}

	@Override
	public String toString() {
		return "RepositorioPrestamo [listaPrestamo=" + listaPrestamo + "]";
	}

	void addPrestamo(Prestamo p) {

	}
	
	void devolverPrestamo(Prestamo p) {
		
	}
	
	void mostrarLista() {
		
	}

}
