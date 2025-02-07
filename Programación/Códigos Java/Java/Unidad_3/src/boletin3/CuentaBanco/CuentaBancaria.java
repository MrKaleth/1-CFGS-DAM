package boletin3.CuentaBanco;

public class CuentaBancaria {

	private double saldo;
	private String numCuenta;
	private Persona titular;
	private Persona autorizado;

	public CuentaBancaria(double saldo, String numCuenta, Persona titular) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.autorizado = autorizado;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", numCuenta=" + numCuenta + ", titular=" + titular + ", autorizado="
				+ autorizado + "]";
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public Persona getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Persona autorizado) {
		this.autorizado = autorizado;
	}

	private boolean validaImportePositivo(double importe) {
		return importe > 0;
	}

	private boolean validarAutorizado(String dni) {
		return dni != null && dni.equals(autorizado.getDni());
	}

	public void ingresarDinero(Persona personaGestion, double ingreso) {
		if (validarAutorizado(personaGestion.getDni()) && validaImportePositivo(ingreso)) {
			setSaldo(getSaldo() + saldo);
		} else {
			System.out.println("ERROR. No autorizado o Ingreso Incorrecto");
		}
	}

	public void retirarDinero(Persona personaGestion, double ingreso) {
		if (validarAutorizado(personaGestion.getDni()) && validaImportePositivo(ingreso) && getSaldo() >= ingreso) {
			setSaldo(getSaldo() - saldo);
		} else {
			System.out.println("ERROR. No autorizado o Ingreso Incorrecto");
		}
	}

	public void eliminarAutorizado(String dni) {
		if(validarAutorizado(dni)) {
			autorizado = null;
		}
		else {
			System.out.println("ERROR. La persona no figura como Autorizada");
		}
	}
}
