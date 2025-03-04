package tiendaAnimales.Modelo;

import java.time.LocalDate;

public class Canario extends Ave {
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public boolean habla() {
        return false;
    }

    @Override
    public void volar() {
        System.out.println("El canario está volando.");
    }

    @Override
    public void muestra() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Color=" + color + ", Canta=" + canta;
    }
}
