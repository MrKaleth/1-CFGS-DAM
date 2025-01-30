package retos;

import java.util.Scanner;

public class LucesNavidad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int encendidas = 0;
        int apagadas = 0;
        int contador = 0;

        while (contador < 10) { 
            System.out.println("Verifica las luces. ¿Enciende? S o N: ");
            String opcion = input.nextLine().toUpperCase();

            if (opcion.equals("S")) {
                System.out.println("Luz verificada");
                encendidas++;
                contador++;
            } else if (opcion.equals("N")) {
                System.out.println("Luz verificada");
                apagadas++;
                contador++;
            } else {
                System.out.println("Quillo, Ayudame. 'S' o 'N'."); 
            }
        }

        System.out.println("Número de luces encendidas: " + encendidas);
        System.out.println("Número de luces fundidas: " + apagadas);

        if (apagadas > 5) {
            System.out.println("¡Nos devuelven el Dinero!");
        } else {
            System.out.println("Recordemos no comprar más luces a ese proveedor...");
        }
        input.close();
    }
}
