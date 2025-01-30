package boletín0;

import java.util.Scanner;

public class Ej2Bol6Py {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = input.nextInt();

		int pos = 0;
		String estrella = "*";

		while (num != pos) {
			System.out.println(estrella);
			estrella = estrella + "*";
			pos += 1;

			input.close();
		}
	}
}
