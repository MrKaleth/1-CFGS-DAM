package transportes.Modelo;

public class RutaTerrestre extends RutaBase implements IRuta {
	private boolean siEsCarretera;
	private double costeCienKms;

	public RutaTerrestre(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm, boolean siEsCarretera) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKm);
		this.siEsCarretera = siEsCarretera;
		this.costeCienKms = 0.65;
	}

	protected boolean isSiEsCarretera() {
		return siEsCarretera;
	}

	protected void setSiEsCarretera(boolean siEsCarretera) {
		this.siEsCarretera = siEsCarretera;
	}

	@Override
	public double getCoste() {
		double coste;
		double distancia = getDistanciaKm();
		coste = distancia * costeCienKms;
		return coste;
	}

	@Override
	public String getTipoRuta() {
		String mensaje;
		if (this.siEsCarretera == true) {
			mensaje = "RutaTerrestre " + "-carretera";
		} else {
			mensaje = "RutaTerrestre " + "-tren";
		}
		return mensaje;
	}

	@Override
	public String toString() {
		return "RutaTerrestre [siEsCarretera=" + siEsCarretera + ", costeCienKms=" + costeCienKms + "]";
	}

	
}
