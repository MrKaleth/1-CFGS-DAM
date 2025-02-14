package boletinHerencia.Actividades;

class Camion extends Vehiculo {
    private int tonelajeKilos, numPasajeros, numEjes;

    public Camion(String dueño, int numPuertas, int numRuedas, int tonelajeKilos, int numPasajeros, int numEjes) {
        super(dueño, numPuertas, numRuedas);
        this.tonelajeKilos = tonelajeKilos;
        this.numPasajeros = numPasajeros;
        this.numEjes = numEjes;
    }

    public int getTonelajeKilos() {
        return tonelajeKilos;
    }

    public void setTonelajeKilos(int tonelajeKilos) {
        this.tonelajeKilos = tonelajeKilos;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public String[] getLicencias() {
        return new String[]{"Licencia A", "Licencia B", "Licencia C"};
    }

    @Override
    public void imprimeResumen() {
        System.out.println("Camión de " + dueño + " con " + numPuertas + " puertas, " + numRuedas + " ruedas y " + numEjes + " ejes.");
    }

    @Override
    public String toString() {
        return "Camion [dueño=" + dueño + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + ", tonelajeKilos=" + tonelajeKilos + ", numPasajeros=" + numPasajeros + ", numEjes=" + numEjes + "]";
    }
}
