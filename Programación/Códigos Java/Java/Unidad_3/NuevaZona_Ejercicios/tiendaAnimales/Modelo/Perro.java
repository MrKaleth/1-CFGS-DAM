package tiendaAnimales.Modelo;

import java.time.LocalDate;

public class Perro extends Mascota {
    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
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
        return super.toString() + ", Raza=" + raza + ", Pulgas=" + pulgas;
    }
}
