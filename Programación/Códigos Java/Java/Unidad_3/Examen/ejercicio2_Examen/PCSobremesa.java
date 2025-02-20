package ejercicio2_Examen;

public class PCSobremesa extends Computadora {
	protected boolean tieneGPUdedicada;

	public PCSobremesa(String marca, String modelo, double precio, int capacidadRAM, boolean tieneGPUdedicada) {
		super(marca, modelo, precio, capacidadRAM);
		this.tieneGPUdedicada = tieneGPUdedicada;
	}

	protected boolean isTieneGPUdedicada() {
		return tieneGPUdedicada;
	}

	protected void setTieneGPUdedicada(boolean tieneGPUdedicada) {
		this.tieneGPUdedicada = tieneGPUdedicada;
	}

}
