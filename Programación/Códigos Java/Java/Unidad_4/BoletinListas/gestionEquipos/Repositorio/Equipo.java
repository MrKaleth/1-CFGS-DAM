package gestionEquipos.Repositorio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import gestionEquipos.Modelo.Alumno;

public class Equipo {
	private String nombreEquipo;
	private Set<Alumno> grupoAlumnos;

	public Equipo(String nombreEquipo, Set<Alumno> grupoAlumnos) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.grupoAlumnos = new HashSet<Alumno>();
	}

	protected String getNombreEquipo() {
		return nombreEquipo;
	}

	protected void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	protected Set<Alumno> getGrupoAlumnos() {
		return grupoAlumnos;
	}

	protected void setGrupoAlumnos(Set<Alumno> grupoAlumnos) {
		this.grupoAlumnos = grupoAlumnos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(grupoAlumnos, nombreEquipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(grupoAlumnos, other.grupoAlumnos) && Objects.equals(nombreEquipo, other.nombreEquipo);
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", grupoAlumnos=" + grupoAlumnos + "]";
	}

}
