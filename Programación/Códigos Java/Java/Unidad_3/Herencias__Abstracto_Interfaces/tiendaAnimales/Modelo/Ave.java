package tiendaAnimales.Modelo;

import java.time.LocalDate;

public abstract class Ave extends Mascota {
    private boolean pico;
    private boolean vuela;

    public Ave(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public abstract void volar();

    @Override
    public String toString() {
        return super.toString() + ", Pico=" + pico + ", Vuela=" + vuela;
    }
}
