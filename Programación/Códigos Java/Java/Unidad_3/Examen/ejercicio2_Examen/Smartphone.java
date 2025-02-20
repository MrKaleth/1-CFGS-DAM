package ejercicio2_Examen;

public class Smartphone extends Telefono {
	protected int cantidadCamaras;

	public Smartphone(String marca, String modelo, double precio, boolean tieneTecladoFisico, int cantidadCamaras) {
		super(marca, modelo, precio, tieneTecladoFisico);
		this.cantidadCamaras = cantidadCamaras;
	}

	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}
	
	public double calcularPrecioDescuento() {
		double descuento = 0;
		descuento = precio - (precio*15/100);
		return descuento;
	}

}
