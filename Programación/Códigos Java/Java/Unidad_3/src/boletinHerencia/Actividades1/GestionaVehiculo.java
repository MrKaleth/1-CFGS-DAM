package boletinHerencia.Actividades1;

import boletinHerencia.Actividades1.Automovil.CalificacionEcologica;

public class GestionaVehiculo {
    public static void main(String[] args) {
        // Crear automóviles
        Automovil autoECO = new Automovil("Juan", 4, 4, CalificacionEcologica.ECO);
        Automovil autoC = new Automovil("Maria", 4, 4, CalificacionEcologica.C);

        // Comprobar restricciones de circulación
        System.out.println("¿El automóvil ECO tiene restricción en Madrid? " + autoECO.tieneLimitacionParaCircular("Madrid", 'E'));
        System.out.println("¿El automóvil C tiene restricción en Madrid? " + autoC.tieneLimitacionParaCircular("Madrid", 'C'));
        System.out.println("¿El automóvil C tiene restricción en Sevilla? " + autoC.tieneLimitacionParaCircular("Sevilla", 'C'));

        // Crear camiones
        Camion camion1 = new Camion("Carlos", 2, 4, 500, 2, 2);
        Camion camion2 = new Camion("Pedro", 2, 6, 5000, 7, 3);

        // Imprimir resúmenes de los camiones
        System.out.println(camion1);
        System.out.println("Licencias requeridas para el primer camión: " + String.join(", ", camion1.getLicencias()));
        
        System.out.println(camion2);
        System.out.println("Licencias requeridas para el segundo camión: " + String.join(", ", camion2.getLicencias()));
    }
}