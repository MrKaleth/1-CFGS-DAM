package geometria.Modelo;

public abstract class Figura {
	private String color;

	public abstract double calcularArea();

	public String getColor() {
		return color;
	}

	public Figura(String color) {
		super();
		this.color = color;
	}
	
}
