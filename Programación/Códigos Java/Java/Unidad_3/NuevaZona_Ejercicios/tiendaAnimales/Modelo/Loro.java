package tiendaAnimales.Modelo;

import java.time.LocalDate;

public class Loro extends Ave {
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public boolean habla() {
        return habla;
    }

    public void saluda() {
        if (habla) {
            System.out.println("¡Hola! Soy un loro de " + origen);
        }
    }

    @Override
    public void volar() {
        if (super.toString().contains("Vuela=true")) {
            System.out.println("El loro está volando.");
        }
    }

    @Override
    public void muestra() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Origen=" + origen + ", Habla=" + habla;
    }
}
