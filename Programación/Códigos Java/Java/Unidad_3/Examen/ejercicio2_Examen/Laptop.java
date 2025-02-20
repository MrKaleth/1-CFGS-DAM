package ejercicio2_Examen;

public class Laptop extends Computadora {
	protected double peso;

	public Laptop(String marca, String modelo, double precio, int capacidadRAM, double peso) {
		super(marca, modelo, precio, capacidadRAM);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double calcularPrecioDescuento() {
		double descuento = 0;
		if(peso >= 2) {
		descuento = precio - (precio*20/100);
		}
		else {
			descuento = precio - (precio*12/100);
		}
		return descuento;
	}

}
