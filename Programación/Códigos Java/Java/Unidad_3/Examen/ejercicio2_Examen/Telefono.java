package ejercicio2_Examen;

public class Telefono extends Dispositivo {
	protected boolean tieneTecladoFisico;

	public Telefono(String marca, String modelo, double precio, boolean tieneTecladoFisico) {
		super(marca, modelo, precio);
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

	protected boolean isTieneTecladoFisico() {
		return tieneTecladoFisico;
	}

	protected void setTieneTecladoFisico(boolean tieneTecladoFisico) {
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

}
