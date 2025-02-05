package boletin3.Vehiculos;

import java.util.Scanner;

public class GestionaVehiculos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Vehiculos vehiculo1 = new Vehiculos("Toyota", "Corolla", 2020, "Gasolina", 10.0f, 50.0f, 7.0f);
		Vehiculos vehiculo2 = new Vehiculos("Tesla", "Model S", 2022, "Eléctrico", 80.0f, 100.0f, 0.0f); 

		System.out.println(vehiculo1);
		System.out.println(vehiculo2);

		System.out.print("Introduce los kilómetros recorridos para calcular el consumo: ");
		float kms = input.nextFloat();

		System.out.println("Consumo de combustible para " + vehiculo1.marca + " " + vehiculo1.modelo + ":");
		vehiculo1.calcularConsumo(kms);

		System.out.println("Consumo de combustible para " + vehiculo2.marca + " " + vehiculo2.modelo + ":");
		vehiculo2.calcularConsumo(kms);

		System.out.println("¿" + vehiculo1.marca + " " + vehiculo1.modelo + " necesita repostar?");
		System.out.println(vehiculo1.hayQueRepostar() ? "Sí" : "No");

		System.out.println("¿" + vehiculo2.marca + " " + vehiculo2.modelo + " necesita repostar?");
		System.out.println(vehiculo2.hayQueRepostar() ? "Sí" : "No");

		input.close();
	}
}