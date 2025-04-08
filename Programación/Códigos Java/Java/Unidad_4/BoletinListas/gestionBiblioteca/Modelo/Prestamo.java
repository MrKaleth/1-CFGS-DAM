package gestionBiblioteca.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
	private int id;
	private Libro libroA_Prestar;
	private String idUsuario;
	private LocalDate fechaPrestamo;

	public Prestamo(int id, Libro libroA_Prestar, String idUsuario, LocalDate fechaPrestamo) {
		super();
		this.id = id;
		this.libroA_Prestar = libroA_Prestar;
		this.idUsuario = idUsuario;
		this.fechaPrestamo = fechaPrestamo;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected Libro getLibroA_Prestar() {
		return libroA_Prestar;
	}

	protected void setLibroA_Prestar(Libro libroA_Prestar) {
		this.libroA_Prestar = libroA_Prestar;
	}

	protected String getIdUsuario() {
		return idUsuario;
	}

	protected void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	protected LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	protected void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaPrestamo, id, idUsuario, libroA_Prestar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(fechaPrestamo, other.fechaPrestamo) && id == other.id
				&& Objects.equals(idUsuario, other.idUsuario) && Objects.equals(libroA_Prestar.obtenerISBN(), other.libroA_Prestar.obtenerISBN());
	}

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", libroA_Prestar=" + libroA_Prestar + ", idUsuario=" + idUsuario
				+ ", fechaPrestamo=" + fechaPrestamo + "]";
	}

}
