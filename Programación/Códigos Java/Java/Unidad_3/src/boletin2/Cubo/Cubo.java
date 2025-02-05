package boletin2.Cubo;

public class Cubo {
	int lado;
	float litros;
	float capacidad;

	public Cubo() {
		super();
		/*this.lado = lado;
		this.litros = litros;*/
		this.capacidad = calculaVolumen();

	}

	float calculaVolumen() {
		float volumen = lado * lado * lado;
		return volumen;
	}

	@Override
	public String toString() {
		return "Cubo [lado=" + lado + ", litros=" + litros + ", capacidad=" + capacidad + "]";
	}

	float calculaArea() {
		float area = 6 * lado * lado;
		return area;
	}
}
