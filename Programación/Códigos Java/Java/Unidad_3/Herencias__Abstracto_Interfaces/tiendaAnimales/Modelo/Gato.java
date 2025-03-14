package tiendaAnimales.Modelo;

import java.time.LocalDate;

public class Gato extends Mascota {
    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public boolean habla() {
        return false;
    }

    @Override
    public void muestra() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Color=" + color + ", Pelo Largo=" + peloLargo;
    }
}
