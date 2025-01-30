package boletín1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("--- Bienvenido al Restaurante ---");
        System.out.println("====================================");

        System.out.print("\nIntroduce tu tipo de Membresía (Premium o No Premium): ");
        String membresia = input.nextLine();

        System.out.print("\nIntroduce el monto gastado: ");
        int gasto = input.nextInt();

        System.out.print("\nIntroduce tu edad: ");
        int edad = input.nextInt();

        if ((membresia.equals("Premium") || membresia.equals("premium")) && gasto > 50 || edad > 65) {
            System.out.println("\n¡Felicidades! Eres elegible para un descuento.");
        } else {
            System.out.println("\nLo sentimos, no eres elegible para un descuento.");
        }

        input.close();
    }
}
