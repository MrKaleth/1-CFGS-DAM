package repaso;

public class RepasoTablas {
	public static void main(String[] args) {

	}

	boolean buscaElemento(int[] tabla, int numero) {
		boolean encontrado = false;
		int i = 0;

		while (!encontrado && i < tabla.length) {
			if (tabla[i] == numero) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}
}
