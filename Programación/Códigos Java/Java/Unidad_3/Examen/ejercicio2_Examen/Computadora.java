package ejercicio2_Examen;

public class Computadora extends Dispositivo {
	protected int capacidadRAM;

	public Computadora(String marca, String modelo, double precio, int capacidad) {
		super(marca, modelo, precio);
		this.capacidadRAM = capacidad;
	}

	protected int getCapacidad() {
		return capacidadRAM;
	}

	protected void setCapacidad(int capacidad) {
		this.capacidadRAM = capacidad;
	}

}
