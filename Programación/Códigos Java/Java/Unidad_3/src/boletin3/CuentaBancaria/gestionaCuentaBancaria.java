package boletin3.CuentaBancaria;

import java.time.LocalDate;

public class gestionaCuentaBancaria {

	public static void main(String[] args) {

		LocalDate fechaNam = LocalDate.of(2000, 12, 12);
		Persona titular = new Persona("12345678A", "Pepe", "López", fechaNam);

		CuentaBancaria cuenta = new CuentaBancaria(0.0, "ES123456789123456789123456", titular);
		/* cuenta.setSaldo(10); */

		System.out.println(fechaNam);
		System.out.println(titular);
		System.out.println(cuenta);

	}

}
