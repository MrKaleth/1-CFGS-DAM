package boletinHerencia.Actividades1;

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
        if (tonelajeKilos > 7500) {
            return new String[]{"C", "C+E"}; // Puede conducir cualquier camión sin límite de tonelaje y enganchar remolques pesados
        } else if (tonelajeKilos > 3500) {
            if (numEjes > 2) {
                return new String[]{"C", "C+E"}; // Vehículos más pesados, se requiere C+E para remolques
            }
            return new String[]{"C", "C1"}; // Camión entre 3.500 y 7.500 kg sin remolque pesado
        } else if (tonelajeKilos > 3500 && tonelajeKilos <= 7500) {
            return new String[]{"C1", "C1+E"}; // Vehículos entre 3.500 y 7.500 kg con posibilidad de remolque
        } else {
            return new String[]{"C"}; // Cubre la mayoría de camiones sin especificar remolques
        }
    }

    @Override
    public String toString() {
        return "Camion [dueño=" + dueño + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + ", tonelajeKilos=" + tonelajeKilos + ", numPasajeros=" + numPasajeros + ", numEjes=" + numEjes + "]";
    }
}
