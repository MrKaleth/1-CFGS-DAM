package boletín2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce tu Edad: "); int edad = input.nextInt();
		 * 
		 * double descuento = 0.0;
		 * 
		 * if (edad > 60) { descuento = 0.3;
		 * System.out.println("Eres apto para un descuento del 30%"); }
		 * 
		 * else { descuento = 0.1;
		 * System.out.println("Eres apto para un descuento del 10%"); }
		 * 
		 * System.out.print("Indica el precio del producto a Comprar: "); double precio
		 * = input.nextInt();
		 * 
		 * double precio_descuento = precio - precio*descuento;
		 * 
		 * System.out.println("Precio final del producto tras el descuento: "+
		 * precio_descuento);
		 * 
		 * input.close();
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Introduce tu Edad: ");
		int edad = input.nextInt();

		double descuento = (edad > 60) ? 0.3 : 0.1;

		System.out.println("Eres apto para un descuento del " + (descuento * 100) + "%");

		System.out.print("Indica el precio del producto a comprar: ");
		double precio = input.nextDouble();

		// Calcular el precio con descuento
		double precio_descuento = precio - (precio * descuento);

		System.out.println("Precio final del producto tras el descuento: " + precio_descuento);

		input.close();
	}
}
