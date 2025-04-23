package ejerciciosPracticos.Almacen.logica;

import java.util.Date;
import java.util.HashSet;
import ejerciciosPracticos.Almacen.bean.Pieza;

public class GestionPiezas {
	private HashSet<Pieza> piezas;

	public GestionPiezas() {
		piezas = new HashSet<>();
	}

	public void agregarPieza(String nombre, Date fecha) {
		piezas.add(new Pieza(nombre, fecha));
	}

	public void agregarPieza(String nombre) {
		piezas.add(new Pieza(nombre, new Date()));
	}

	public HashSet<Pieza> obtenerAntiguas(Date fecha) {
		HashSet<Pieza> resultado = new HashSet<>();
		for (Pieza pieza : piezas) {
			if (pieza.getFechaFabricacion().getTime() < fecha.getTime()) {
				resultado.add(pieza);
			}
		}
		return resultado;
	}

}
