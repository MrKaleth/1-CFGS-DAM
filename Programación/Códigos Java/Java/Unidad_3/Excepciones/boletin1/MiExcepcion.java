package boletin1;

public class MiExcepcion extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private int numero;

	@Override
	public String toString() {
		return "MiExcepcion: El número " + numero + " es impar.";

	}

	public MiExcepcion(int numero) {
		super();
		this.numero = numero;
	}
}