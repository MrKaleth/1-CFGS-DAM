package boletin1;

import java.util.Random;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        Double[] resultados = new Double[20];

        Random miRandom = new Random();

        try {
            for (int i = 0; i <= 20; i++) {
                int numerador = miRandom.nextInt(11);
                int denominador = miRandom.nextInt(11);

                if (denominador == 0) {
                    throw new ArithmeticException("División por 0 detectada.");
                }

                resultados[i] = (double) numerador / denominador;
            }

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Error. Intento de acceso fuera de los límites.");
        } catch (ArithmeticException e2) {
            System.out.println("Error: " + e2.getMessage());
        } catch (NullPointerException e3) {
            System.out.println("Error. Intento de acceso a una posición nula.");
        }

        try {
            int posicion = miRandom.nextInt(20);
            Double valor = resultados[posicion];
            if (valor == null) {
                throw new NullPointerException("Valor nulo en la posición " + posicion);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        for(int i = 0; i<resultados.length; i++) {
        	System.out.println(resultados[i]);
        }
    }
}
