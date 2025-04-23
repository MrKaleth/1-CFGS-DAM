package ejerciciosPracticos.ProcesoInterfaz.varios;

import ejerciciosPracticos.ProcesoInterfaz.auxiliar.IProceso;

public class Mesa implements IProceso {
	private int ancho;
	private int largo;

	public Mesa(int ancho, int largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}

	@Override
	public void imprimir() {
		System.out.println("El ancho es " + ancho + " y el largo es " + largo);
	}

	@Override
	public void aumentar(int c) {
		ancho += c;
		largo += c;
	}

}
