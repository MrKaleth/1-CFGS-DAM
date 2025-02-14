package boletinHerencia.Actividades1;

class Vehiculo {
    protected String dueño;
    protected int numPuertas, numRuedas;

    public Vehiculo(String dueño, int numPuertas, int numRuedas) {
        this.dueño = dueño;
        this.numPuertas = numPuertas;
        this.numRuedas = numRuedas;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

	@Override
	public String toString() {
		return "Vehiculo [dueño=" + dueño + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + "]";
	}

   
}