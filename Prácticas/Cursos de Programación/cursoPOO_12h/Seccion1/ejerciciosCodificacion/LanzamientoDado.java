package ejerciciosCodificacion;

public class LanzamientoDado {

	/*
	 * Lanzamiento de un dado Realizar un programa que simule el lanzamiento de un
	 * dado 100000 veces y nos indique el porcentaje obtenido de cada cara.
	 * 
	 * Para ello, definirás tu código en el método generate y tendrás que devolver
	 * un array double de 6 elementos, con los porcentajes obtenidos de cada número.
	 * Al probar tu código, supondremos que el array devolverá 6 números de valor
	 * 16.5, con margen de error de 1.0
	 */
	public static double[] generate() {
		int[] count = new int[6];

		int total_rolls = 100000;

		for (int i = 0; i < total_rolls; i++) {
			int resultado = (int) (Math.random() * 6);
			count[resultado]++;
		}

		double[] porcentajes = new double[6];
		for (int i = 0; i < 6; i++) {
			porcentajes[i] = (count[i] * 100.0) / total_rolls;
		}
		return porcentajes;
	}

	public static void main(String[] args) {
		double[] resultados = generate();
		for (int i = 0; i < resultados.length; i++) {
			System.out.println("Cara " + (i + 1) + ": " + resultados[i] + "%");
		}
	}
}