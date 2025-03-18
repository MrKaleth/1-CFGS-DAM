package boletin1;

import java.util.Random;

public class GestionaExcepcionesEjercicio5 {

	public void metodo1(int numero) throws MiExcepcion {
		if (numero % 2 != 0) {
			throw new MiExcepcion(numero);
		}
		System.out.println("El número " + numero + " es par.");
	}

	public static void main(String[] args) {

		GestionaExcepcionesEjercicio5 r = new GestionaExcepcionesEjercicio5();

		Random miRandom = new Random();

		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = miRandom.nextInt(101);
		}

		for (int num : nums) {
			try {
				r.metodo1(num);
			} catch (MiExcepcion e) {
				System.out.println(e);
			}

		}
	}
}
