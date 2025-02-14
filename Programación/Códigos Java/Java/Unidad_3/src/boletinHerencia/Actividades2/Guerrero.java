package boletinHerencia.Actividades2;

class Guerrero extends Personaje {

	public Guerrero(String nombre, int nivel, int hp, String arma) {
		super(nombre, nivel, hp, arma);
	}

	public boolean esAtacado(Personaje p) {
		boolean atacado = false;
		if (p instanceof Mago) {
			atacado = true;
		}
		else {
			atacado = false;
		}
		return atacado;
	}
	
}
