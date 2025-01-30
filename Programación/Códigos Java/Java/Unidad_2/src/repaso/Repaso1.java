package repaso;

import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Repaso1 r = new Repaso1();
		System.out.println("¿Cuántos números desea considerar?");
		int resultado = input.nextInt();
		System.out.println(resultado);

		System.out.println("¿Números a Sumar?");
		int num_ASumar = input.nextInt();
		
		System.out.println(r.SumaPares(num_ASumar));
		input.close();

	}

	int SumaPares(int num_ASumar) {
		Scanner input = new Scanner(System.in);
		int resultado = 0;

		for (int i = 0; i < num_ASumar; i++) {
			if (num_ASumar % 2 == 0) {
				resultado = resultado + num_ASumar;
			}
		}
		input.close();
		return resultado;
	}
}
