package boletinHerencia.Actividades;

class Automovil extends Vehiculo {
    private String calificacionEcologica;

    public Automovil(String dueño, int numPuertas, int numRuedas, String calificacionEcologica) {
        super(dueño, numPuertas, numRuedas);
        this.calificacionEcologica = calificacionEcologica;
    }

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }

    public boolean tieneLicenciaParaCircular(String ciudad) {
        return !"Zona Restringida".equals(ciudad);
    }

    @Override
    public void imprimeResumen() {
        System.out.println("Automóvil de " + dueño + " con " + numPuertas + " puertas y " + numRuedas + " ruedas. Calificación ecológica: " + calificacionEcologica);
    }

    @Override
    public String toString() {
        return "Automovil [dueño=" + dueño + ", calificacionEcologica=" + calificacionEcologica + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + "]";
    }
}