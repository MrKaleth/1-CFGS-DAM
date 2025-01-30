package boletín8;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Ejercicio2 r = new Ejercicio2();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de árboles: ");
        int numArboles = scanner.nextInt();

        char[] tipos = new char[numArboles];
        int[] diametros = new int[numArboles];
        int[] alturas = new int[numArboles];
        Integer[] edades = new Integer[numArboles];

        boolean datosRegistrados = r.registrarArboles(scanner, tipos, diametros, alturas, edades, numArboles);

        if (datosRegistrados) {
            int mediaAltura = r.calcularMediaAltura(alturas);
            int alturaMaxima = r.calcularAlturaMaxima(alturas);
            int alturaMinima = r.calcularAlturaMinima(alturas);
            int diametroMaximo = r.calcularDiametroMaximo(diametros);
            int diametroMinimo = r.calcularDiametroMinimo(diametros);
            int mediaEdadTipoB = r.calcularMediaEdadTipoB(edades, tipos);
            boolean existenArboles30m = r.existenArboles30m(alturas);

            System.out.println("Media de las alturas de los árboles: " + mediaAltura);
            System.out.println("Altura máxima: " + alturaMaxima);
            System.out.println("Altura mínima: " + alturaMinima);
            System.out.println("Diámetro máximo: " + diametroMaximo);
            System.out.println("Diámetro mínimo: " + diametroMinimo);

            if (mediaEdadTipoB >= 0) {
                System.out.println("Media de las edades de los árboles tipo B: " + mediaEdadTipoB);
            }

            if (existenArboles30m) {
                System.out.println("Existen árboles de más de 30 m.");
            }
        } else {
            System.out.println("No se pudo registrar los datos correctamente.");
        }

        scanner.close();
    }

    boolean registrarArboles(Scanner scanner, char[] tipos, int[] diametros, int[] alturas, Integer[] edades, int numArboles) {
        for (int i = 0; i < numArboles; i++) {
            System.out.println("Introduce los datos del árbol " + (i + 1) + ":");

            System.out.print("Tipo (A o B): ");
            tipos[i] = scanner.next().toUpperCase().charAt(0);

            System.out.print("Diámetro del tronco (en metros): ");
            diametros[i] = scanner.nextInt();

            System.out.print("Altura (en metros): ");
            alturas[i] = scanner.nextInt();

            if (tipos[i] == 'B') {
                System.out.print("Edad (en años): ");
                edades[i] = scanner.nextInt();
            }
        }
        return true;
    }

    int calcularMediaAltura(int[] alturas) {
        int sumaAlturas = 0;
        for (int altura : alturas) {
            sumaAlturas += altura;
        }
        return sumaAlturas / alturas.length;
    }

    int calcularAlturaMaxima(int[] alturas) {
        int max = alturas[0];
        for (int altura : alturas) {
            if (altura > max) {
                max = altura;
            }
        }
        return max;
    }

    int calcularAlturaMinima(int[] alturas) {
        int min = alturas[0];
        for (int altura : alturas) {
            if (altura < min) {
                min = altura;
            }
        }
        return min;
    }

    int calcularDiametroMaximo(int[] diametros) {
        int max = diametros[0];
        for (int diametro : diametros) {
            if (diametro > max) {
                max = diametro;
            }
        }
        return max;
    }

    int calcularDiametroMinimo(int[] diametros) {
        int min = diametros[0];
        for (int diametro : diametros) {
            if (diametro < min) {
                min = diametro;
            }
        }
        return min;
    }

    int calcularMediaEdadTipoB(Integer[] edades, char[] tipos) {
        int sumaEdades = 0;
        int contador = 0;
        for (int i = 0; i < edades.length; i++) {
            if (tipos[i] == 'B' && edades[i] != null) {
                sumaEdades += edades[i];
                contador++;
            }
        }
        return contador > 0 ? sumaEdades / contador : -1;
    }

    boolean existenArboles30m(int[] alturas) {
    	boolean Existen = false;
        for (int altura : alturas) {
            if (altura > 30) {
            	Existen = true;
            }
        }
        return Existen;
    }
}