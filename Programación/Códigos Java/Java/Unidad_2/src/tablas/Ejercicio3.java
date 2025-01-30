package tablas;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int lista_Num[] = { 1, 3, 5, 7, 9 };

		System.out.print("¿Qué número deseas buscar en la lista? ");
		int busca = input.nextInt();

		for (int pos = 0; pos < lista_Num.length; pos++) {
			if (busca == lista_Num[pos]) {
				System.out.println(pos);
			} else if (lista_Num[pos] < busca && busca < lista_Num[pos + 1]) {
				System.out.println(-(pos + 1));
			}

		}
		input.close();
	}
}