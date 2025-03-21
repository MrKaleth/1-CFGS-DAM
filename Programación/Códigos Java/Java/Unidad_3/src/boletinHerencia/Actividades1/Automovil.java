package boletinHerencia.Actividades1;

class Automovil extends Vehiculo {
	private CalificacionEcologica calificacionEcologica = CalificacionEcologica.ECO;

	protected enum CalificacionEcologica {
		ECO, O, B, C;
	}

	public Automovil(String dueño, int numPuertas, int numRuedas, CalificacionEcologica calificacionEcologica) {
		super(dueño, numPuertas, numRuedas);
		setCalificacionEcologica(calificacionEcologica);
	}

	public CalificacionEcologica getCalificacionEcologica() {
		return calificacionEcologica;
	}

	public void setCalificacionEcologica(CalificacionEcologica calificacionEcologica) {
		if (calificacionEcologica.equals(calificacionEcologica.ECO)
				|| calificacionEcologica.equals(calificacionEcologica.O)
				|| calificacionEcologica.equals(calificacionEcologica.B)
				|| calificacionEcologica.equals(calificacionEcologica.C)) {

			this.calificacionEcologica = calificacionEcologica;

		}
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