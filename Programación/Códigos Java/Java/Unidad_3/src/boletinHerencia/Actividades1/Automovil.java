package boletinHerencia.Actividades1;

class Automovil extends Vehiculo {
	private String calificacionEcologica;

	public Automovil(String dueño, int numPuertas, int numRuedas, String calificacionEcologica) {
		super(dueño, numPuertas, numRuedas);
		this.calificacionEcologica = calificacionEcologica;
	}

	public String getCalificacionEcologica() {
		return calificacionEcologica;
	}

	public void setCalificacionEcologica(String calificacionEcologica) {
		this.calificacionEcologica = calificacionEcologica;
	}

	public boolean tieneLimitacionParaCircular(String ciudad, char tipoVehiculo) {
		boolean restriccion = false;

		if (ciudad != null) {
			switch (ciudad) {
			case "Madrid":
				restriccion = (tipoVehiculo == 'B' || tipoVehiculo == 'C');
				break;
			case "Barcelona":
				restriccion = (tipoVehiculo == 'B' || tipoVehiculo == 'C');
				break;
			case "Valencia":
				restriccion = (tipoVehiculo == 'C');
				break;
			case "Sevilla":
				restriccion = (tipoVehiculo == 'C');
				break;
			default:
				restriccion = false;
			}
		}

		return restriccion;
	}


	@Override
	public String toString() {
		return "Automovil [dueño=" + dueño + ", calificacionEcologica=" + calificacionEcologica + ", numPuertas="
				+ numPuertas + ", numRuedas=" + numRuedas + "]";
	}
}