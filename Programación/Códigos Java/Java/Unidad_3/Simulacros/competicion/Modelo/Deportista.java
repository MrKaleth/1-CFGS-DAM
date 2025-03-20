package competicion.Modelo;

import java.time.LocalDate;

public abstract class Deportista implements ICompeticion {
	private String nombre;
	private String pais;
	private int edad;
	private double peso;
	private double altura;
	private Prueba[] pruebas;

	public Deportista(String nombre, String pais, int edad, double peso, double altura, Prueba[] pruebas) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pruebas = pruebas;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getPais() {
		return pais;
	}

	protected void setPais(String pais) {
		this.pais = pais;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected double getAltura() {
		return altura;
	}

	protected void setAltura(double altura) {
		this.altura = altura;
	}

	protected Prueba[] getPruebas() {
		return pruebas;
	}

	protected void setPruebas(Prueba[] pruebas) {
		this.pruebas = pruebas;
	}

	public abstract int getTiempoCalentamiento();

	public abstract int getCaloriasNecesariasDia();

	public abstract int getHorasEntrenamiento(LocalDate fecha);

	public void agregarPrueba(Prueba prueba) throws CompeticionException {
		for (Prueba p : pruebas) {
			if (p != null && p.equals(prueba)) {
				throw new CompeticionException("El deportista ya está inscrito en esta prueba.");
			}
		}

		if (prueba.getEstado() == Estado_Prueba.PLANIFICADA && prueba.getFecha().isBefore(LocalDate.now())) {
			throw new CompeticionException("No se puede agregar una prueba planificada con fecha pasada.");
		}

		boolean pruebaAgregada = false;
		for (int i = 0; i < pruebas.length; i++) {
			if (pruebas[i] == null) {
				pruebas[i] = prueba;
				pruebaAgregada = true;
			}
		}

		if (!pruebaAgregada) {
			throw new CompeticionException("No hay espacio suficiente para agregar más pruebas.");
		}
	}

	public abstract Prueba getProximaPrueba();

	public abstract int contarPruebasPorEstado(Estado_Prueba estado);

	public String obtenerNombre(Deportista deportista) {
		return deportista.getNombre();
	}

	public String obtenerPais(Deportista deportista) {
		return deportista.getPais();
	}

	public Prueba[] obtenerPruebas(Deportista deportista) {
		return deportista.getPruebas();
	}

}
