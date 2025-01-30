package funciones;

import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {
		Ejemplo1 f = new Ejemplo1();

		int resultado = f.sumaNum(4, 7);
		System.out.println(resultado);
		
		String [] lista = f.generaLista5n();
		
		for(int i=0; i<5; i++) {
		System.out.println("Nombre nº"+i+":"+lista[i]);
		}

	}

	int sumaNum(int num1, int num2) {

		return num1 + num2;
	}

	String[] generaLista5n() {
		Scanner input = new Scanner(System.in);
		String[] Lista = {"", "", "", "", ""};
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce un Nombre: ");
			String nom = input.nextLine();
			Lista[i] = nom;
		}

		input.close();
		return Lista;
	}
}
