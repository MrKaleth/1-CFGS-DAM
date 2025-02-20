package ejercicio2_Examen;

import java.util.Objects;

public class Dispositivo {
	protected String marca;
	protected String modelo;
	protected double precio;

	public Dispositivo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		if (precio <= 0) {
			System.out.println(
					"Error. El dispositivo " + modelo + " no puede tener un precio negativo. Valor mínimo 1.00 euros");
			this.precio = 1.00;
		} else {
			this.precio = precio;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " - Modelo: " + modelo + " - Precio: " + precio + " euros." + " - Precio con descuento: " + calcularPrecioDescuento() + " euros.";
	}
	
	public double calcularPrecioDescuento() {
		double descuento = 0;
		descuento = precio - (precio*10/100);
		return descuento;
	}

}
