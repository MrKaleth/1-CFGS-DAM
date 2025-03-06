package factoriaCoches.Modelo;

public class RobotPintor extends Robot {

	public RobotPintor(String modelo, int bateria_numerico, Estado estado, String combustible, String descripcion) {
		super(modelo, bateria_numerico, estado, combustible, descripcion);
	}

	@Override
	public void ejecutarTarea() {
		System.out.println("Aplicando pintura a los vehículos de manera uniforme.");
	}

	@Override
	public boolean recargar() {
		boolean recargando = false;
		if (getEstado() != Estado.AVERIADO) {
			System.out.println("Recargando por electricidad");
			recargando = true;
		} else {
			System.out.println("No puedo recargar, estoy averiado");
			recargando = false;
		}
		return recargando;
	}
}
