package cadenaAlimenticia.Modelo;

public abstract class Animal {
	private String nombreEspecie;
	private TipoFamilia tipoFamilia;
	private String lugarQueHabita;
	private Animal[] animalesCome;
	private Animal[] animalesComido;

	public Animal(String nombreEspecie, TipoFamilia tipoFamilia, String lugarQueHabita, Animal[] animalesCome,
			Animal[] animalesComido) {
		super();
		this.nombreEspecie = nombreEspecie;
		this.tipoFamilia = tipoFamilia;
		this.lugarQueHabita = lugarQueHabita;
		this.animalesCome = animalesCome;
		this.animalesComido = animalesComido;
	}

}
