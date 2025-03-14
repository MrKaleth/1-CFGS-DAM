package factoriaCoches.Modelo;

public class RobotSoldador extends Robot {

	private float temperatura;
	private String especificacionSeguridad;

	public RobotSoldador(String modelo, int bateria_numerico, Estado estado, String combustible, String descripcion,
			float temperatura, String especificacionSeguridad) {
		super(modelo, bateria_numerico, estado, combustible, descripcion);
		this.temperatura = temperatura;
		this.especificacionSeguridad = especificacionSeguridad;
	}

	@Override
	public void ejecutarTarea() {
		System.out.println("Soldando a " + temperatura + "°C con especificación de seguridad: " + especificacionSeguridad);
	}

	@Override
	public boolean recargar() {
		boolean recargando = false;
		if (getEstado() == Estado.APAGADO) {
			System.out.println("Recargando por electricidad");
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
