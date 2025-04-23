package ejerciciosPracticos.HerenciaCuentaLimitada.logica;

import java.util.HashSet;

import ejerciciosPracticos.HerenciaCuentaLimitada.beans.Movimiento;

public class CuentaMovimientos extends CuentaLimitada {
	HashSet<Movimiento> movs;

	public CuentaMovimientos(double saldo, double limite) {
		super(saldo, limite);
		movs = new HashSet<Movimiento>();
	}

	@Override
	public void extraer(double cantidad) {
		movs.add(new Movimiento(cantidad, "extracción"));
		super.extraer(cantidad);
	}

	@Override
	public void ingresar(double cantidad) {
		movs.add(new Movimiento(cantidad, "ingreso"));
		super.ingresar(cantidad);
	}

	public HashSet<Movimiento> getMovimientos() {
		return movs;
	}

}
