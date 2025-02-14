package boletinHerencia.Actividades1;

class CocheElectrico extends Vehiculo {
    private String tipoBateria;

	public CocheElectrico(String dueño, int numPuertas, int numRuedas, String tipoBateria) {
		super(dueño, numPuertas, numRuedas);
		this.tipoBateria = tipoBateria;
	}

	@Override
	public String toString() {
		return "CocheElectrico [tipoBateria=" + tipoBateria + ", dueño=" + dueño + ", numPuertas=" + numPuertas
				+ ", numRuedas=" + numRuedas + ", getDueño()=" + getDueño() + ", getNumPuertas()=" + getNumPuertas()
				+ ", getNumRuedas()=" + getNumRuedas() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getTipoBateria() {
		return tipoBateria;
	}

	 public void setTipoBateria(String tipoBateria) {
	        if (tipoBateria.equals("LFP") || tipoBateria.equals("NCM")) {
	            this.tipoBateria = tipoBateria;
	        } else {
	            System.out.println("Tipo de batería no válido. Debe ser 'LFP' o 'NCM'");
	        }
	    }
	}

    
