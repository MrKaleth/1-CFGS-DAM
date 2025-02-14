package boletinHerencia.Actividades2;

class Arquero extends Personaje {

	public Arquero(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp, "Arco");
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
