package ejerciciosPracticos.HerenciaCuenta.logica;

public class Cuenta {
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double cantidad) {
		saldo += cantidad;
	}

	public void extraer(double cantidad) {
		saldo -= cantidad;
	}
}
