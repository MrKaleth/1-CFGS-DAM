package ejerciciosPracticos;

public class Primitiva {

	public static void main(String[] args) {
		int generados = 0;
		int[] nums = new int[6];
		int n;

		do {
			//Generamos un número aleatorio entre 1 y 19
			n = (int) (Math.random() * 49 + 1);
			//Si no está repetido lo guardamos en el array
			if (!repetido(n, nums, generados)) {
				nums[generados] = n;
				generados++;
			}

		} while (generados<nums.length);
		ordenar(nums);
		mostrar(nums);
	}

	private static boolean repetido(int n, int[] nums, int generados) {
		boolean resultado = false;
		for (int i = 0; i < generados; i++) {
			if (n == nums[i]) {
				resultado = true;
			}
		}
		return resultado;
	}

	private static void ordenar(int[] nums) {
		int aux;
		for (int i = 0; i < nums.length; i++) {
			for (int k = i; k < nums.length; k++) {
				if(nums[k]<nums[i]) {
					aux=nums[i];
					nums[i]=nums[k];
					nums[k]=aux;
				}
			}
		}

	}
	
	private static void mostrar(int[] nums) {
		for(int num : nums) {
			System.out.print(num+", ");
		}
	}
}
