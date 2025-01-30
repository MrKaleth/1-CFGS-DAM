package retos;

import java.util.Scanner;

public class ArbolNavidad {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce el número de niveles del Árbol: ");
		int niveles = input.nextInt();

		int nivel = 1;
		while (nivel <= niveles) {
			int espacios = niveles - nivel;
			int estrellas = 2 * nivel - 1;
			int i = 0;
			while (i < espacios) {
				System.out.print(" ");
				i++;
			}

			int j = 0;
			while (j < estrellas) {
				if (j == 0 || j == estrellas - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println(); 
			nivel++;
		}

		int k = 0;
		while (k < niveles - 3) {
			System.out.print(" ");
			k++;
		}
		System.out.println("_l l_");
		input.close();
	}
}
