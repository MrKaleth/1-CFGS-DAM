package factoriaCoches.Modelo;

public class RobotEnsamblador extends Robot {

	public RobotEnsamblador(String modelo, int bateria_numerico, Estado estado, String combustible,
			String descripcion) {
		super(modelo, bateria_numerico, estado, combustible, descripcion);
	}

	@Override
	public void ejecutarTarea() {
		System.out.println("Ensamblando piezas del vehículo.");
	}

	@Override
	public boolean recargar() {
		boolean recargando = false;
		if (getEstado() == Estado.APAGADO) {
			System.out.println("Recargando por gasolina");
			recargando = true;
		} else if (getEstado() == Estado.AVERIADO) {
			System.out.println("Estoy averiado y no puedo recargar");
			recargando = false;
		} else {
			System.out.println("Estoy encendido y no puedo recargar");
			recargando = false;
		}
		return recargando;
	}
}
