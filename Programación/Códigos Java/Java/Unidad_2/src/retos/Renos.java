package retos;

import java.util.Scanner;

public class Renos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el número de renos que participan en la carrera: ");
        int num_Renos = input.nextInt();

        System.out.print("Introduce la longitud de las pistas de la carrera: ");
        int len_pista = input.nextInt();

        int tablaCarrera[] = new int[num_Renos];

        for (int posReno = 0; posReno < num_Renos; posReno++) {
            boolean posicionValida = false;
            while (!posicionValida) {
                System.out.print("Introduce la posición del reno nº" + (posReno + 1) + ": ");
                int posicion = input.nextInt();
                if (posicion >= 0 && posicion < len_pista) {
                    tablaCarrera[posReno] = posicion;
                    posicionValida = true;
                } else {
                    System.out.println("Error: La posición del reno debe estar entre 0 y " + (len_pista - 1) + ". Inténtalo de nuevo.");
                }
            }
        }

        for (int i = 0; i < num_Renos; i++) {
            String carril = "@";

            for (int j = 0; j < len_pista; j++) {
                if (j == tablaCarrera[i]) {
                    if (j != 0) {
                        carril += "r";
                    } else {
                        carril += "~";
                    }
                } else {
                    carril += "~";
                }
            }

            System.out.println(carril + "@" + "/" + (i + 1));
        }

        input.close();
    }
}