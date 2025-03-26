package transportes.Modelo;

public class RutaAerea extends RutaBase implements IRuta {
	private TipoVuelo tipoVuelo;

	public RutaAerea(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm, TipoVuelo tipoVuelo) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKm);
		this.tipoVuelo = tipoVuelo;
	}

	protected TipoVuelo getTipoVuelo() {
		return tipoVuelo;
	}

	protected void setTipoVuelo(TipoVuelo tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	@Override
	public double getCoste() {
		double coste = 0;
		double distancia = getDistanciaKm();
		if(this.tipoVuelo == TipoVuelo.LOW_COST) {
			coste = distancia * 0.75;
		}
		else if (this.tipoVuelo == TipoVuelo.NORMAL) {
			coste = distancia * 1.1;
		}
		else if (this.tipoVuelo == TipoVuelo.EXPRESS) {
			coste = distancia * 1.5;
		}
		else {
			System.out.println("Error, no hay tipo de vuelo asignado o es erroneo");
		}
		return coste;
	}

	@Override
	public String getTipoRuta() {
		String mensaje = "RutaAerea: " + this.tipoVuelo;
		return mensaje;
	}

	@Override
	public String toString() {
		return "RutaAerea [tipoVuelo=" + tipoVuelo + "]";
	}

	
}
