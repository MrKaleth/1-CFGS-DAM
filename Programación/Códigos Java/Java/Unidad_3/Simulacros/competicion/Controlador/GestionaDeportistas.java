package competicion.Controlador;

import competicion.Modelo.*;
import java.time.LocalDate;

public class GestionaDeportistas {
    public static void main(String[] args) {
        try {
            // Crear los deportistas
            Deportista corredor = new Corredor("Juan Pérez", "España", 30, 70, 1.80, new Prueba[3]);
            Deportista nadador = new Nadador("Carlos García", "México", 25, 75, 1.75, new Prueba[3]);

            // Crear las pruebas
            Prueba prueba1 = new Prueba("001", "Madrid", LocalDate.of(2026, 7, 1), Estado_Prueba.PLANIFICADA);
            Prueba prueba2 = new Prueba("002", "Barcelona", LocalDate.of(2026, 6, 15), Estado_Prueba.PLANIFICADA);
            Prueba prueba3 = new Prueba("003", "Sevilla", LocalDate.of(2026, 5, 10), Estado_Prueba.PLANIFICADA);

            corredor.agregarPrueba(prueba1);
            corredor.agregarPrueba(prueba2);
            corredor.agregarPrueba(prueba3);

            nadador.agregarPrueba(prueba1);
            nadador.agregarPrueba(prueba2);
            nadador.agregarPrueba(prueba3);

            mostrarPruebasDeportista(corredor);
            mostrarPruebasDeportista(nadador);

            try {
                corredor.agregarPrueba(prueba1);
            } catch (CompeticionException e) {
                System.out.println(e.getMessage());
            }

        } catch (CompeticionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void mostrarPruebasDeportista(Deportista deportista) {
        Prueba[] pruebas = deportista.obtenerPruebas(deportista);
        System.out.println("Pruebas de " + deportista.obtenerNombre(deportista) + ":");
        for (Prueba prueba : pruebas) {
            if (prueba != null) {
                System.out.println("ID: " + prueba.obtenerID(prueba) + ", Lugar: " + prueba.obtenerLugar(prueba) + ", Fecha: " + prueba.obtenerFecha(prueba));
            }
        }
    }
}
